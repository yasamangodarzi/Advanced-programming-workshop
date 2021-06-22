package sample; /**
 * Sample Skeleton for 'g.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.PI;

public class  Controller {
    int num1;
    int num2;
    double Answer;
    String ans;
    String ans1;
    String symbol;

    @FXML // fx:id="FirstNumber"
    private TextField FirstNumber; // Value injected by FXMLLoader

    @FXML // fx:id="SecondNumber"
    private TextField SecondNumber; // Value injected by FXMLLoader

    @FXML // fx:id="AddButton"
    private Button AddButton; // Value injected by FXMLLoader

    @FXML // fx:id="SubButton"
    private Button SubButton; // Value injected by FXMLLoader

    @FXML // fx:id="SinButton"
    private Button SinButton; // Value injected by FXMLLoader

    @FXML // fx:id="MultiButton"
    private Button MultiButton; // Value injected by FXMLLoader

    @FXML // fx:id="DivieButton"
    private Button DivieButton; // Value injected by FXMLLoader

    @FXML // fx:id="CosButton"
    private Button CosButton; // Value injected by FXMLLoader

    @FXML // fx:id="AnswerShow"
    private Label AnswerShow; // Value injected by FXMLLoader

    @FXML // fx:id="ClearButton"
    private Button ClearButton; // Value injected by FXMLLoader

    @FXML
    void Action(ActionEvent event) {
        num1 = Integer.parseInt(FirstNumber.getText());
        num2 = Integer.parseInt(SecondNumber.getText());
        if (event.getSource() == AddButton) {
            symbol = "+";
            Answer = (num1 + num2);
        } else if (event.getSource() ==SubButton) {
            symbol = "-";
            Answer =  (num1 - num2);
        } else if (event.getSource() == MultiButton) {
            symbol = "x";
            Answer = (num1 * num2);
        }  else if (event.getSource() == DivieButton) {
            symbol = "/";
            Answer = (num1 / num2);
        } else if (event.getSource() == SinButton) {
            symbol = "Sin";
            ans= String.valueOf((Math.sin(num1*PI/180)));

            System.out.println(ans);
            System.out.println(ans1);
        } else if (event.getSource() == CosButton) {
            symbol = "Cos";
            ans= String.valueOf((Math.cos(num1*PI/180)));

        }
        //display answer
        if (symbol.equals("Sin") || symbol.equals("Cos"))
        {

            AnswerShow.setText("" + symbol +"("+ num1 +")="+ ans );

        }
        else
        {
            AnswerShow.setText("" + num1 + symbol + num2 + "=" +Answer);

        }


    }

    @FXML
    void Clear(ActionEvent event) {
        FirstNumber.setPrefColumnCount(1000);
        SecondNumber.setPrefColumnCount(1000);
        FirstNumber.setText("first Number");
        SecondNumber.setText("second Number");
        AnswerShow.setText("Answer");
        FirstNumber.requestFocus();
        return;

    }

}
