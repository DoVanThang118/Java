package multipage.list;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import multipage.Main;
import multipage.Subject;

import java.net.URL;
import java.util.ResourceBundle;

import static multipage.form.Controller.list;

public class Controller implements Initializable {
    public ListView<Subject> lv;

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene listScene = new Scene(listPage,600,600);

        Main.rootStage.setTitle("add subject");
        Main.rootStage.setScene(listScene);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(list);
    }
}
