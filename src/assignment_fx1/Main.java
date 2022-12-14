package assignment_fx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("assignment-javafx1.fxml"));
        primaryStage.setTitle("Wellcome to WINHO");
        primaryStage.setScene(new Scene(root, 808, 808));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}