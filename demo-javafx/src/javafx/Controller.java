package javafx;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextArea txtAddress;
    public Text fullName;
    public Text email;
    public Text age;
    public Text address;
    public Text noticeFullName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;

    public void handleSubmit(){
//        System.out.println("hello ba gia !!!");
        String fn = txtFullName.getText();
        if (fn.isEmpty()){
            noticeFullName.setText("dcdcsdc");
            noticeFullName.setVisible(true);
        }else {
            fullName.setText(fn);
            noticeFullName.setVisible(false);
        }
        String e = txtEmail.getText();
        if (e.isEmpty() || !e.contains("@") || e.startsWith("@") || e.endsWith("@")){
            noticeEmail.setText("fdfdsf");
            noticeEmail.setVisible(true);
        }else {
            noticeEmail.setVisible(false);
            email.setText(e);
        }

        String a = txtAge.getText();
        try {
            Integer nAge = Integer.parseInt(a);
            if (nAge<=0 || nAge > 200)
                throw  new Exception("dsdadwed");
            age.setText(nAge.toString());
            noticeAge.setVisible(false);
        }catch (Exception exception){
            noticeAge.setText(exception.getMessage());
            noticeAge.setVisible(true);
        }

        String ad = txtAddress.getText();
        if (ad.isEmpty() || ad.length()<10){
            noticeAddress.setText("fdfdsf");
            noticeAddress.setVisible(true);
        }else {
            noticeAddress.setVisible(false);
            address.setText(ad);
        }
    }
}
