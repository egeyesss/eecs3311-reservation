package ca.yorku.eecs3311;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the initial login view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);

        // Phase 8: Apply the CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());

        primaryStage.setTitle("YorkU Lab Equipment Reservation Platform");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}