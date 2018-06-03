package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Controller {
    @FXML
    private Button regbtn;
@FXML
private Label backbtn;

    @FXML
    private void regbtnclick(ActionEvent event) throws Exception{

       Parent newparent = FXMLLoader.load(getClass().getResource("newAccount.fxml"));
       Scene newscene = new Scene(newparent);

       Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(newscene);
       window.show();

    }
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    @FXML
    private TextField emailtxt;

    @FXML
    private void backbtnclk(MouseEvent event)throws Exception{

        Parent newparent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene newscene = new Scene(newparent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newscene);
        window.show();


    }

@FXML
    private Button signinbtn;

    @FXML
    private Label emailveri;

    @FXML
    private void signinbtnclick(ActionEvent event) throws Exception{

String email = emailtxt.getText();
String password;

if(isValid(email)){

    emailveri.setTextFill(Color.web("#004d08"));
    emailveri.setText("Valid Email");

}


    }
}
