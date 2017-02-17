package com.example.x16109139.alexsantosca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText first;
    private EditText second;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private TextView result;
    private TextView maximunNumber;
    private TextView maximum;
    private int countAdd =0;
    private int countSubtract =0;
    private int countMultiply =0;
    private int countDivide =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.editTextFirst);
        second = (EditText) findViewById(R.id.editTextSecond);
        add = (Button) findViewById(R.id.buttonAdd);
        subtract = (Button) findViewById(R.id.buttonSubtract);
        multiply = (Button) findViewById(R.id.buttonMultiply);
        divide = (Button) findViewById(R.id.buttonDivide);
        result = (TextView) findViewById(R.id.Result);
        maximum = (TextView) findViewById(R.id.TextViewMaximum);

        add.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                countAdd = countAdd +1;

                try {
                if((countAdd > countDivide) && (countAdd > countMultiply) && (countAdd > countSubtract)){
                    maximum.setText("Maximum used operation is Add +" +countAdd );
                }else if((countDivide > countAdd) && (countDivide > countMultiply) && (countDivide > countSubtract)){

                    maximum.setText("Maximum used operation is Divide /" +countDivide );
                }else if((countMultiply > countAdd) && (countMultiply > countDivide) && (countMultiply > countSubtract)){
                    maximum.setText("Maximum used operation is Multiply * " +countMultiply );
                }else if((countSubtract > countAdd) && (countSubtract > countDivide) && (countSubtract > countMultiply)){
                    maximum.setText("Maximum used operation is Subtract - " +countSubtract );

                }


                    String fNumber = first.getText().toString();
                    String sNumber = second.getText().toString();

                    int number1 = Integer.parseInt(fNumber);
                    int number2 = Integer.parseInt(sNumber);

                    int addTextResult = number1 + number2;
                    result.setText("Result is: " + addTextResult);

                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please enter a valid option", Toast.LENGTH_SHORT).show();
                }


            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countSubtract = countSubtract +1;

                try {

                if((countAdd > countDivide) && (countAdd > countMultiply) && (countAdd > countSubtract)){
                    maximum.setText("Maximum used operation is Add +" +countAdd );
                }else if((countDivide > countAdd) && (countDivide > countMultiply) && (countDivide > countSubtract)){

                    maximum.setText("Maximum used operation is Divide /" +countDivide );
                }else if((countMultiply > countAdd) && (countMultiply > countDivide) && (countMultiply > countSubtract)){
                    maximum.setText("Maximum used operation is Multiply * " +countMultiply );
                }else if((countSubtract > countAdd) && (countSubtract > countDivide) && (countSubtract > countMultiply)){
                    maximum.setText("Maximum used operation is Subtract - " +countSubtract );

                }

                    String fNumber = first.getText().toString();
                    String sNumber = second.getText().toString();

                    int number1 = Integer.parseInt(fNumber);
                    int number2 = Integer.parseInt(sNumber);

                    int subtractTextResult = number1 - number2;
                    result.setText("Result is: " + subtractTextResult);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please enter a valid option", Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countMultiply = countMultiply +1;


                try {
                if((countAdd > countDivide) && (countAdd > countMultiply) && (countAdd > countSubtract)){
                    maximum.setText("Maximum used operation is Add +" +countAdd );
                }else if((countDivide > countAdd) && (countDivide > countMultiply) && (countDivide > countSubtract)){

                    maximum.setText("Maximum used operation is Divide /" +countDivide );
                }else if((countMultiply > countAdd) && (countMultiply > countDivide) && (countMultiply > countSubtract)){
                    maximum.setText("Maximum used operation is Multiply * " +countMultiply );
                }else if((countSubtract > countAdd) && (countSubtract > countDivide) && (countSubtract > countMultiply)){
                    maximum.setText("Maximum used operation is Subtract - " +countSubtract );

                }


                    String fNumber = first.getText().toString();
                    String sNumber = second.getText().toString();

                    int number1 = Integer.parseInt(fNumber);
                    int number2 = Integer.parseInt(sNumber);

                    int multiplyTextResult = number1 * number2;
                    result.setText("Result is: " + multiplyTextResult);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please enter a valid option", Toast.LENGTH_SHORT).show();
                }

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                countDivide = countDivide +1;


                try {
                if((countAdd > countDivide) && (countAdd > countMultiply) && (countAdd > countSubtract)){
                    maximum.setText("Maximum used operation is Add +" +countAdd );
                }else if((countDivide > countAdd) && (countDivide > countMultiply) && (countDivide > countSubtract)){

                    maximum.setText("Maximum used operation is Divide /" +countDivide );
                }else if((countMultiply > countAdd) && (countMultiply > countDivide) && (countMultiply > countSubtract)){
                    maximum.setText("Maximum used operation is Multiply * " +countMultiply );
                }else if((countSubtract > countAdd) && (countSubtract > countDivide) && (countSubtract > countMultiply)){
                    maximum.setText("Maximum used operation is Subtract - " +countSubtract );

                }

                    String fNumber = first.getText().toString();
                    String sNumber = second.getText().toString();

                    int number1 = Integer.parseInt(fNumber);
                    int number2 = Integer.parseInt(sNumber);

                    int divideTextResult = number1 / number2;
                    result.setText("Result is: " + divideTextResult);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please enter a valid option", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}
