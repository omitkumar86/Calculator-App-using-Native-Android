package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7,
            btn8, btn9, btnSum, btnSub, btnMulti,
            btnDiv, btnDot, btnReset, btnEqual;
    EditText eT;
    Float valueOne, valueTwo, Result;
    boolean Sum, Sub, Multi, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btnZero);
        btn1 = (Button) findViewById(R.id.btnOne);
        btn2 = (Button) findViewById(R.id.btnTwo);
        btn3 = (Button) findViewById(R.id.btnThree);
        btn4 = (Button) findViewById(R.id.btnFour);
        btn5 = (Button) findViewById(R.id.btnFive);
        btn6 = (Button) findViewById(R.id.btnSix);
        btn7 = (Button) findViewById(R.id.btnSeven);
        btn8 = (Button) findViewById(R.id.btnEight);
        btn9 = (Button) findViewById(R.id.btnNine);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        eT = (EditText) findViewById(R.id.eTNumber);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText() + ".");
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText("");
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(eT.getText().toString());
                Sum = true;
                eT.setText(null);
                //eT.setText(eT.getText() + "+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(eT.getText().toString());
                Sub = true;
                eT.setText(null);
                //eT.setText(eT.getText() + "-");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(eT.getText().toString());
                Multi = true;
                eT.setText(null);
                //eT.setText(eT.getText() + "×");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Float.parseFloat(eT.getText().toString());
                Div = true;
                eT.setText(null);
                //eT.setText(eT.getText() + "÷");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo = Float.parseFloat(eT.getText().toString());

                if (Sum == true) {
                    Result = valueOne + valueTwo;
                    eT.setText(String.valueOf(Result));
                    Sum = false;
                }
                if (Sub == true) {
                    Result = valueOne - valueTwo;
                    eT.setText(String.valueOf(Result));
                    Sub = false;
                }
                if (Multi == true) {
                    Result = valueOne * valueTwo;
                    eT.setText(String.valueOf(Result));
                    Multi = false;
                }
                if (Div == true) {
                    Result = valueOne / valueTwo;
                    eT.setText(String.valueOf(Result));
                    Div = false;
                }
            }
        });
    }
}