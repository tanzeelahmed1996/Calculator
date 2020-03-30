import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator extends Application {
static Stage current;

    @FXML
    TextField numberInput;

    @Override
    public void start(Stage stage) throws Exception {
        current = stage;
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        current.setResizable(false);
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root, 300, 375));
        stage.show();
    }

    public void sumMethod() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("+ ");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + " + ");
        }
    }

    public void equalsMethod() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("=");

        } else {
            String textField = numberInput.getText();
            String [] split = textField.split(" ");
            String [] operators = {"+", "-", "×", "÷"}; //Array of operators for checking (cleaner than 4 if statements)

            String currentPart = ""; //Stores part of a number as we build it up
            ArrayList<String> tokenized = new ArrayList<>(); //Array list to store the broken up equation

            for(int i = 0; i < split.length; i++){
                if(Arrays.asList(operators).contains(split[i])){ //If the current is an operator
                    tokenized.add(currentPart); //Add the number we built up to the tokens
                    tokenized.add(split[i]); //Add the operator to the tokens
                    currentPart = ""; //Reset the number we were building because we already added it to the array
                }else{
                    currentPart += split[i]; //If its not an operator, append it to the number we are building
                }
            }

            tokenized.add(currentPart); // Final number added outside the loop

            System.out.println(tokenized);

            double sum = 0;
            for (int i = 0; i <tokenized.size();i++){

                if (tokenized.get(i).equals(operators[0])){
                    double firstVar = Double.parseDouble(tokenized.get(i-1));
                    double secondVar = Double.parseDouble(tokenized.get(i+1));
                    sum = firstVar + secondVar;
                }

                if (tokenized.get(i).equals(operators[1])){
                    double firstVar = Double.parseDouble(tokenized.get(i-1));
                    double secondVar = Double.parseDouble(tokenized.get(i+1));
                    sum = firstVar - secondVar;
                }

                if (tokenized.get(i).equals(operators[2])){
                    double firstVar = Double.parseDouble(tokenized.get(i-1));
                    double secondVar = Double.parseDouble(tokenized.get(i+1));
                    sum = firstVar * secondVar;
                }

                if (tokenized.get(i).equals(operators[3])){
                    double firstVar = Double.parseDouble(tokenized.get(i-1));
                    double secondVar = Double.parseDouble(tokenized.get(i+1));
                    sum = firstVar / secondVar;
                }

                if (tokenized.size()==1){
                    sum = Double.parseDouble(tokenized.get(i));
                }


            }

            numberInput.setText("= "+sum);
        }
    }

    public void subtractMethod() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("- ");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + " - ");
        }
    }

    public void multiplyMethod() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("× ");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + " × ");
        }
    }

    public void divideMethod() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("÷ ");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + " ÷ ");
        }
    }


    public void decimalPoint() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText(".");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + ".");
        }
    }

    public void zero() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("0");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "0");
        }
    }

    public void one() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("1");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "1");
        }
    }

    public void two() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("2");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "2");
        }
    }

    public void three() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("3");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "3");
        }
    }

    public void four() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("4");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "4");
        }
    }

    public void five() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("5");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "5");
        }
    }

    public void six() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("6");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "6");
        }
    }

    public void seven() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("7");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "7");
        }
    }

    public void eight() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("8");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "8");
        }
    }

    public void nine() {
        if (numberInput.getText().isEmpty()) {
            numberInput.setText("9");

        } else {
            String textField = numberInput.getText();
            numberInput.setText(textField + "9");
        }
    }


    public void clear() {
        numberInput.clear();
    }
}
