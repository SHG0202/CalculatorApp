package com.shg.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView data, output;
    Button Num0, Num1, Num2, Num3, Num4, Num5, Num6, Num7, Num8, Num9;
    Button Multiplication, Division, Addition, Subtraction, Percentage;
    Button Delete, Clear, Result;
    Button Decimal, Power;
    float val1, val2;
    boolean flaga, flags, flagm, flagd, flagp, flagr, flagn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.data);
        output = findViewById(R.id.output);
        Num0 = findViewById(R.id.Num0);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
        Num3 = findViewById(R.id.Num3);
        Num4 = findViewById(R.id.Num4);
        Num5 = findViewById(R.id.Num5);
        Num6 = findViewById(R.id.Num6);
        Num7 = findViewById(R.id.Num7);
        Num8 = findViewById(R.id.Num8);
        Num9 = findViewById(R.id.Num9);
        Multiplication = findViewById(R.id.Multiplication);
        Division = findViewById(R.id.Division);
        Addition = findViewById(R.id.Addition);
        Subtraction = findViewById(R.id.Subtraction);
        Percentage = findViewById(R.id.Percentage);
        Delete = findViewById(R.id.Delete);
        Clear = findViewById(R.id.Clear);
        Result = findViewById(R.id.Result);
        Decimal = findViewById(R.id.Decimal);
        Power = findViewById(R.id.Power);

        Num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                if(data.getText() != "") {
                    data.setText(data.getText() + "0");
                }
            }
        });
        Num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "1");
            }
        });
        Num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "2");
            }
        });
        Num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "3");
            }
        });
        Num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "4");
            }
        });
        Num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "5");
            }
        });
        Num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "6");
            }
        });
        Num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText()+ "7");
            }
        });
        Num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "8");
            }
        });
        Num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagr == true)
                    flagr = false;
                if(flagn == true){
                    data.setText("");
                    flagn = false;
                }
                data.setText(data.getText() + "9");
            }
        });
        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagn == true)
                    flagn = false;
                if(flagr == true) {
                    val1 = Float.parseFloat(output.getText() + "");
                    flagr = false;
                }
                else
                    val1 = Float.parseFloat(data.getText() + "");
                flaga = true;
                data.setText("");
            }
        });
        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagn == true)
                    flagn = false;
                if(flagr == true) {
                    val1 = Float.parseFloat(output.getText() + "");
                    flagr = false;
                }
                else
                    val1 = Float.parseFloat(data.getText() + "");
                flags = true;
                data.setText("");
            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagn == true)
                    flagn = false;
                if(flagr == true) {
                    val1 = Float.parseFloat(output.getText() + "");
                    flagr = false;
                }
                else
                    val1 = Float.parseFloat(data.getText() + "");
                flagm = true;
                data.setText("");
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagn == true)
                    flagn = false;
                if(flagr == true) {
                    val1 = Float.parseFloat(output.getText() + "");
                    flagr = false;
                }
                else
                    val1 = Float.parseFloat(data.getText() + "");
                flagd = true;
                data.setText("");
            }
        });
        Percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagn == true)
                    flagn = false;
                if(flagr == true) {
                    val1 = Float.parseFloat(output.getText() + "");
                    flagr = false;
                }
                else
                    val1 = Float.parseFloat(data.getText() + "");
                flagp = true;
                data.setText("");
            }
        });

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(data.getText() + "");

                if (flaga == true) {
                    output.setText(val1 + val2 + "");
                    flaga = false;
                }

                if (flags == true) {
                    output.setText(val1 - val2 + "");
                    flags = false;
                }

                if (flagm == true) {
                    output.setText(val1*val2 + "");
                    flagm = false;
                }

                if (flagd == true) {
                    output.setText(val1/val2 + "");
                    flagd = false;
                }

                if(flagp == true){
                    output.setText((val1/100)*val2 + "");
                    flagp = false;
                }
                data.setText("");
                flagr = true;
                flagn = true;
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("");
                output.setText("00");
            }
        });
    }
}
