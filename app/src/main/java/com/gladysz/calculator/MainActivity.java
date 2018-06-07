package com.gladysz.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView display;
    private Operation operation;
    private double firstNumber = 0;
    private double secondNumber = 0;
    private Button decimal;
    private AdvancedCalculator advancedCalculator;


    public void operationButtonClick(View view) {
        firstNumber = Double.parseDouble(display.getText().toString());
        decimal.setEnabled(true);
        display.setText("");
        switch (view.getId()) {
            case R.id.add:
                operation = Operation.ADD;
                break;
            case R.id.multiply:
                operation = Operation.MULTIPLY;
                break;
            case R.id.subtract:
                operation = Operation.SUBTRACT;
                break;
            case R.id.divide:
                operation = Operation.DIVIDE;
                break;
            case R.id.power:
                operation = Operation.POWER;
                break;
            case R.id.sqrt:
                operation = Operation.SQRT;
                break;
            case R.id.fibonacci:
                operation = Operation.FIBONACCI;
                break;
            case R.id.factorial:
                operation = Operation.FACTORIAL;
                break;
        }
    }

    public void equalButtonClick(View view) {
        decimal.setEnabled(true);
        double result = 0;
        switch (operation) {
            case ADD:
                secondNumber = Double.parseDouble(display.getText().toString());
                result = firstNumber + secondNumber;
                break;
            case SUBTRACT:
                secondNumber = Double.parseDouble(display.getText().toString());
                result = firstNumber - secondNumber;
                break;
            case MULTIPLY:
                secondNumber = Double.parseDouble(display.getText().toString());
                result = firstNumber * secondNumber;
                break;
            case DIVIDE:
                secondNumber = Double.parseDouble(display.getText().toString());
                result = firstNumber /= secondNumber;
                break;
            case POWER:
                secondNumber = Double.parseDouble(display.getText().toString());
                result = Math.pow(firstNumber, secondNumber);
                break;
            case SQRT:
                secondNumber = Double.parseDouble(display.getText().toString());
                result = Math.pow(firstNumber, 1 / secondNumber);
                break;
            case FIBONACCI:
                result = advancedCalculator.calculateFibonacci((int) firstNumber);
                break;
            case FACTORIAL:
                result = advancedCalculator.calculateFactorial((int) firstNumber);
                break;
            default:
                firstNumber = secondNumber;
        }
        display.setText(result + "");
        operation = Operation.STARTOVER;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        advancedCalculator = new AdvancedCalculator();
        display = findViewById(R.id.display);
        operation = Operation.STARTOVER;
        decimal = findViewById(R.id.decimal);
    }

    public void numberButtonClick(View view) {
        Button button = (Button) view;
        if (operation == Operation.STARTOVER) {
            display.setText("");
            operation = Operation.NONE;
        }
        if (button.getText().equals(".") || display.getText().toString().contains("."))
            decimal.setEnabled(false);
        display.append(button.getText() + "");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.clear_display) {
            display.setText("0");
            operation = Operation.STARTOVER;
            decimal.setEnabled(true);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}