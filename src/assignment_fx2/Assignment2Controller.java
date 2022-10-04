package assignment_fx2;

import assignment_fx1.PhoneNumber;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Assignment2Controller {
    public TextField txtName;
    public TextField txtNumber;
    public ListView<assignment_fx1.PhoneNumber> lv;
    public Text notice;

    private ObservableList<assignment_fx1.PhoneNumber> phoneNumbers = FXCollections.observableArrayList();

    public void handleAdd(){

        try {
            notice.setVisible(false);
            if (txtName.getText().isEmpty() || txtNumber.getText().isEmpty()){
                throw new Exception("Ơ kìa !!! Chú bé đần !!!");
            }
            updatePhone();
            printResult();
        }catch (Exception e){
            notice.setText(e.getMessage());
            notice.setVisible(true);
        }
    }

    public void updatePhone(){
        for (assignment_fx1.PhoneNumber p:phoneNumbers){
            if (p.getName().equals(txtName.getText())){
                p.setNumber(txtNumber.getText());
                return;
            }
        }
        phoneNumbers.add(new PhoneNumber(txtName.getText(),txtNumber.getText()));
    }

    public void  printResult(){
        lv.setItems(phoneNumbers);
        lv.refresh();
    }
}
