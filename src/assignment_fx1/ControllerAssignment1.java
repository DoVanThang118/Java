package assignment_fx1;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControllerAssignment1 {
    public TextField txtName;
    public TextField txtNumber;
    public TextArea txtList;
    public Text noticeName;
    public Text noticeNumber;
    public void handleAdd(){

        String name = txtName.getText();
        if (name.isEmpty()){
            noticeName.setText("nhập tên vào chú bé đần ơi !!!");
            noticeName.setVisible(true);
        }else {
            txtList.setText(name);
            noticeName.setVisible(false);
        }

        String number = txtNumber.getText();
        if (number.isEmpty() || number.length() <10 || number.length() >15 ){
            noticeNumber.setText("Số mà chú bé đần nhập vào không hợp lệ !!!!");
            noticeNumber.setVisible(true);
        }else {
            txtList.setText(number);
            noticeNumber.setVisible(false);
        }
    }
}
