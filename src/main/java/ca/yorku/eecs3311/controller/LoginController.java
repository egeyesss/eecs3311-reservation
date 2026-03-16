package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LoginController {

    private final BookingFacade facade = new BookingFacade();
    private User loggedInUser;

    // Login Fields
    @FXML private TextField loginEmailField;
    @FXML private PasswordField loginPasswordField;

    // Register Fields
    @FXML private TextField regEmailField;
    @FXML private PasswordField regPasswordField;
    @FXML private TextField regDeptField;
    @FXML private ComboBox<UserType> regTypeComboBox;

    @FXML
    public void initialize() {
        if (regTypeComboBox != null) {
            // Req 2: Filter out ADMIN and MANAGER from public registration.
            regTypeComboBox.getItems().setAll(
                    Arrays.stream(UserType.values())
                            .filter(type -> type != UserType.ADMIN && type != UserType.MANAGER)
                            .collect(Collectors.toList())
            );
        }
    }

    @FXML
    public void handleLogin() {
        String email = loginEmailField.getText();
        String password = loginPasswordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            showAlert("Input Error", "Please enter both email and password.");
            return;
        }

        try {
            loggedInUser = facade.login(email, password);
            if (loggedInUser != null) {
                navigateBasedOnUserType(loggedInUser.getUserType());
            } else {
                showAlert("Login Failed", "Invalid credentials.");
            }
        } catch (IllegalStateException e) {
            // This catches the specific PENDING account block from AuthenticationService
            showAlert("Account Pending", e.getMessage());
        } catch (Exception e) {
            showAlert("Error", "Login Error: " + e.getMessage());
        }
    }

    @FXML
    public void handleRegister() {
        try {
            UserType selectedType = regTypeComboBox.getValue();
            String email = regEmailField.getText();
            String password = regPasswordField.getText();
            String dept = regDeptField.getText();

            if (selectedType == null) {
                showAlert("Input Error", "Please select a User Type.");
                return;
            }

            // Req 1: Strong Password Regex
            String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
            if (!password.matches(regex)) {
                showAlert("Weak Password", "Password must be 8+ chars with Upper, Lower, Number, and Symbol.");
                return;
            }

            facade.registerUser(selectedType, email, password, dept, null, null, null, null);

            // Req 1: Branching UI Feedback based on UserType
            if (selectedType == UserType.FACULTY || selectedType == UserType.RESEARCHER) {
                showAlert("Request Sent", "University-affiliated account request sent.\nWaiting for administrator approval.");
            } else {
                showAlert("Success", "Registration successful. Returning to login.");
            }

            handleGoToLogin();
        } catch (Exception e) {
            showAlert("Registration Failed", e.getMessage());
        }
    }

    @FXML
    public void handleGoToRegister() {
        switchScene("/view/register.fxml", loginEmailField);
    }

    @FXML
    public void handleGoToLogin() {
        // Use regEmailField because we are on the register page
        switchScene("/view/login.fxml", regEmailField);
    }

    private void switchScene(String fxmlPath, TextField anchorField) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = (Stage) anchorField.getScene().getWindow();
            Scene scene = new Scene(root, 900, 650);
            if (getClass().getResource("/styles/app.css") != null) {
                scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());
            }
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void navigateBasedOnUserType(UserType type) {
        String fxmlFile = switch (type) {
            case ADMIN -> "/view/admin_dashboard.fxml";
            case MANAGER -> "/view/manager_dashboard.fxml";
            default -> "/view/user_dashboard.fxml";
        };

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            if (type != UserType.ADMIN && type != UserType.MANAGER) {
                UserDashboardController controller = loader.getController();
                controller.setCurrentUserId(loggedInUser.getUserId());
            }

            Stage stage = (Stage) loginEmailField.getScene().getWindow();
            Scene scene = new Scene(root, 900, 650);
            if (getClass().getResource("/styles/app.css") != null) {
                scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());
            }
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}