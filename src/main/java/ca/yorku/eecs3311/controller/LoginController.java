package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

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
            regTypeComboBox.getItems().addAll(UserType.values());
        }
    }

    @FXML
    public void handleLogin() {
        String email = loginEmailField.getText();
        String password = loginPasswordField.getText();

        try {
            loggedInUser = facade.login(email, password);
            if (loggedInUser != null) {
                navigateBasedOnUserType(loggedInUser.getUserType());
            } else {
                showAlert("Login Failed", "Invalid credentials.");
            }
        } catch (Exception e) {
            showAlert("Error", e.getMessage());
        }
    }

    @FXML
    public void handleRegister() {
        try {
            UserType type = regTypeComboBox.getValue();
            String email = regEmailField.getText();
            String password = regPasswordField.getText();
            String dept = regDeptField.getText();

            // Assuming basic registration without extra credentials for this demo
            facade.registerUser(type, email, password, dept, null, null, null, null);
            showAlert("Success", "Registration successful. Please log in.");
        } catch (Exception e) {
            showAlert("Registration Failed", e.getMessage());
        }
    }

    @FXML
    public void handleLogout() {
        if (loggedInUser != null) {
            facade.logout(loggedInUser.getUserId());
            loggedInUser = null;
            // TODO: Navigate back to login view
            System.out.println("Logged out successfully.");
        }
    }

    private void navigateBasedOnUserType(UserType type) {
        System.out.println("Navigating to dashboard for: " + type);
        // TODO: Load respective FXML files (Phase 8)
        // ADMIN -> admin_dashboard.fxml
        // MANAGER -> manager_dashboard.fxml
        // Else -> user_dashboard.fxml
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}