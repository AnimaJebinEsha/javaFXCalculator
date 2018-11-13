package ru.calculator.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calculatorOverviewController implements Initializable {
	Float data = 0f;
	Float ans = 0f;
	int operation = 1;
	int lastEvent = -1;

	@FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonfive;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonSub;

    @FXML
    private Button buttonMul;

    @FXML
    private Button buttonReset;

    @FXML
    private Button buttonEqual;

    @FXML
    private Button buttonZero;

    @FXML
    private Button buttonDiv;

    @FXML
    private TextField display;

    @FXML
    private Button buttonOne;
    
    @FXML
    private Button buttonPi;
    
    @FXML
    private Button buttonDot;
    
    @FXML
    private Button buttonDel;
    
    @FXML
    private Button buttonPercent;
    
    @FXML
    void doOperation()
    {
    	switch (operation) {
        case 1: //Addition
        	data = Float.parseFloat(display.getText());
            ans += data;
            display.setText(String.valueOf(ans));break;
        case 2: //Subtraction
        	data = Float.parseFloat(display.getText());
            ans -= data;
            display.setText(String.valueOf(ans));break;
        case 3: //Mul
        	data = Float.parseFloat(display.getText());
            ans *= data;
            display.setText(String.valueOf(ans));break;
        case 4: //Div
            data = Float.parseFloat(display.getText());
            try {
                ans /= data;
            }catch(Exception e){display.setText("Error");}
            display.setText(String.valueOf(ans));break;
    	}
    }
    
    @FXML
    void handleButtonAction(ActionEvent event) {
    	if(event.getSource() == buttonOne)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "1");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonTwo)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "2");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonThree)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "3");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonFour)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "4");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonfive)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "5");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonSix)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "6");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonSeven)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "7");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonEight)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "8");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonNine)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "9");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonZero)
    	{
    		if(lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5)
    		{
    			display.setText("");
    		}
    		display.setText(display.getText() + "0");
    		lastEvent = -1;
    	}
    	else if(event.getSource() == buttonReset)
    	{
    		display.setText("");
    		lastEvent = -1;
    		ans = 0f;
    		data = 0f;
    		operation = 1;
    	}
    	else if(event.getSource() == buttonAdd)
    	{
            doOperation();
            lastEvent = 1;
            operation = 1;
    	}
    	else if(event.getSource() == buttonSub)
    	{
    		doOperation();
            lastEvent = 2;
            operation = 2;
    	}
    	else if (event.getSource() == buttonMul) {
            doOperation();
            lastEvent = 3;
            operation = 3;
        }
    	else if (event.getSource() == buttonDiv) {
            doOperation();
            lastEvent = 4;
            operation = 4;
        }
    	else if (event.getSource() == buttonEqual) {
            doOperation();
            lastEvent = 5;
            ans = 0f;
    		data = 0f;
    		operation = 1;
    	}
    	
    }
	
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
	
}
