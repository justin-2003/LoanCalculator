package com.example.loancalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.NumberFormat;

public class HelloController {

    //Added the text fields
    @FXML
    private TextField InterestRate;

    @FXML
    private TextField NoOfYears;

    @FXML
    private TextField loanAmount;

    //Added the labels
    @FXML
    private Label monthlyAmounts;

    @FXML
    private Label totalAmount;

    //the method to calculate the amount when the user press in calculate button
    @FXML
    public void calculator() {

           // the input string change to double and store it a variable
           double interest= Double.parseDouble(InterestRate.getText());
           double loan= Double.parseDouble(loanAmount.getText());
           double years= Double.parseDouble(NoOfYears.getText());

           // the equations to calculate the monthly Payment
           double mRate = (interest/100)/12;
           double months = (years)*12.0;
           double monthlyPayment = (loan*mRate)/(1-Math.pow(1+mRate,-months));

           // sets the text of the label to the monthly amount
          monthlyAmounts.setText(NumberFormat.getCurrencyInstance().format(monthlyPayment));

          //sets the total Amount by multiplying monthly amount with the months
         totalAmount.setText(NumberFormat.getCurrencyInstance().format(monthlyPayment * months));


    }
}
