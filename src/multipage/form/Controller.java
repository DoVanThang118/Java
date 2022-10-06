package multipage.form;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import multipage.Main;
import multipage.Subject;

public class Controller {

    public Text errors;
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,600,600);

        Main.rootStage.setTitle("list subject");
        Main.rootStage.setScene(listScene);
    }

    private ObservableList<Subject> list = FXCollections.observableArrayList();
    public void addSubject(ActionEvent actionEvent) {
        try {
            errors.setVisible(false);
            Integer hours = Integer.parseInt(txtHours.getText());
            if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() || hours <= 0){
                throw new Exception("Vui lòng nhập các thông tin hợp lệ");
            }
            list.add(new Subject(txtCode.getText(),txtName.getText(),hours));

            Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
            Scene listScene = new Scene(listPage,600,600);

            Main.rootStage.setTitle("list subject");
            Main.rootStage.setScene(listScene);
        }
        catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }
    }
}
