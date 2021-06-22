package sample; /**
 /**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class  Controller {
    ArrayList<String> op = new ArrayList<String>();
    ArrayList<String> ResultString = new ArrayList<String>();
    ArrayList<Double> num = new ArrayList<Double>();

    @FXML // fx:id="Four"
    private Button Four; // Value injected by FXMLLoader

    @FXML // fx:id="Five"
    private Button Five; // Value injected by FXMLLoader

    @FXML // fx:id="Six"
    private Button Six; // Value injected by FXMLLoader

    @FXML // fx:id="Sub"
    private Button Sub; // Value injected by FXMLLoader

    @FXML // fx:id="One"
    private Button One; // Value injected by FXMLLoader

    @FXML // fx:id="Two"
    private Button Two; // Value injected by FXMLLoader

    @FXML // fx:id="Three"
    private Button Three; // Value injected by FXMLLoader

    @FXML // fx:id="Add"
    private Button Add; // Value injected by FXMLLoader



    @FXML // fx:id="Zero"
    private Button Zero; // Value injected by FXMLLoader

    @FXML // fx:id="Result"
    private Button Result; // Value injected by FXMLLoader

    @FXML // fx:id="Divied"
    private Button Divied; // Value injected by FXMLLoader

    @FXML // fx:id="Seven"
    private Button Seven; // Value injected by FXMLLoader

    @FXML // fx:id="Eight"
    private Button Eight; // Value injected by FXMLLoader

    @FXML // fx:id="Nine"
    private Button Nine; // Value injected by FXMLLoader

    @FXML // fx:id="MUlti"
    private Button MUlti; // Value injected by FXMLLoader

    @FXML // fx:id="ResultLable"
    private Label ResultLable; // Value injected by FXMLLoader

    @FXML // fx:id="Sin"
    private Button Sin; // Value injected by FXMLLoader



    @FXML // fx:id="Cos"
    private Button Cos; // Value injected by FXMLLoader

    @FXML // fx:id="Clear"
    private Button Clear; // Value injected by FXMLLoader

    @FXML
    void Clear(ActionEvent event) {
        ResultString.clear();
        ResultLable.setText("");
    }

    @FXML
    void NewClick(ActionEvent event) {
        String operatorID = "";
        int number = -1;
        if (event.getSource().equals(Add)) {
            operatorID = "+";
        } else if (event.getSource().equals(Sub)) {
            operatorID = "-";
        } else if (event.getSource().equals(MUlti)) {
            operatorID = "x";
        } else if (event.getSource().equals(Divied)) {
            operatorID = "/";
        } else if (event.getSource().equals(Sin)) {
            operatorID = "-5";
        } else if (event.getSource().equals(Cos)) {
            operatorID = "-10";
        }
        if (event.getSource().equals(One)) {
            number = 1;
        } else if (event.getSource().equals(Two)) {
            number = 2;
        } else if (event.getSource().equals(Three)) {
            number = 3;
        } else if (event.getSource().equals(Four)) {
            number = 4;
        } else if (event.getSource().equals(Five)) {
            number = 5;
        } else if (event.getSource().equals(Six)) {
            number = 6;
        } else if (event.getSource().equals(Seven)) {
            number = 7;
        } else if (event.getSource().equals(Eight)) {
            number = 8;
        } else if (event.getSource().equals(Nine)) {
            number = 9;
        } else if (event.getSource().equals(Zero)) {
            number = 0;
        }
        if (!(operatorID.equals(""))) {
            ResultString.add(operatorID);
            System.out.println(operatorID+"add");
            PrintLabel();
            op.add(operatorID);
        }
        if (number != -1) {
            ResultString.add(String.valueOf(number));
            System.out.println(number+"add");
            PrintLabel();
            num.add(Double.valueOf(number));
        }


    }

    @FXML
    void Reuslt(ActionEvent event) {
        double Result=0;
       while (true)
       {
           double num1= Double.parseDouble(ResultString.get(0));
           System.out.println( num1);
           if (num1==-5){  double num2= Double.parseDouble(ResultString.get(1)); Result=Calculate(num2,0,"Sin");break;}
           if (num1==-10){ double num2= Double.parseDouble(ResultString.get(1)); Result=Calculate(num2,0,"Cos");break;}

           String action=ResultString.get(1);
           System.out.println(action);
           double num2= Double.parseDouble(ResultString.get(2));
           System.out.println( num2);
           System.out.println("Size"+ResultString.size());
             Result=Calculate(num1,num2,action);
           System.out.println(Result);
           for (int i=3;i<ResultString.size() ;i=i+2)
           {
               String action1=ResultString.get(i);
               System.out.println( action1);
               double num3= Double.parseDouble(ResultString.get(i+1));
               System.out.println( num3);
               Result=Calculate(Result,num3,action1);
               System.out.println(Result);
           }
           break;

       }

        ResultLable.setText(String.valueOf(Result));

    }

    public void PrintLabel() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : ResultString) {
            if (s.equalsIgnoreCase(String.valueOf(-5))){stringBuilder.append("Sin");}
            else if (s.equalsIgnoreCase(String.valueOf(-10))){stringBuilder.append("Cos");}
            else {stringBuilder.append(s + " ");}

        }
        ResultLable.setText(stringBuilder.toString());
    }
    public double Calculate(double num1,double num2,String op) {
        if(op.equalsIgnoreCase("+")){
         return num1+num2;
        }else if(op.equalsIgnoreCase("-")){
            return num1-num2;
        }else if(op.equalsIgnoreCase("x")){
            return num1*num2;
        }else if(op.equalsIgnoreCase("/")){
            return num1/num2;
        }else if(op.equalsIgnoreCase("Sin")){
            return Math.sin(num1);
        }else if(op.equalsIgnoreCase("Cos")){
            return Math.cos(num1);
        }
        return  0;
    }
}


