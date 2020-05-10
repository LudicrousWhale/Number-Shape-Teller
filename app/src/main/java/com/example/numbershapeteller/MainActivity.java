package com.example.numbershapeteller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        Log.i("info if pressed", "the button was pressed");
        EditText theNumber = (EditText) findViewById(R.id.enteredNumberInput);

        class Number {
            int theNumber1;
            public boolean isTriangular() {
                int x = 1;
                int triangularNumber = 1;
                while (triangularNumber < theNumber1) {
                    x++;
                    triangularNumber += x;
                }
                if (triangularNumber == theNumber1) {
                    return true;
                }
                else {
                    return false;
                }
            }

            public boolean isSquareNumber() {
                double sqr;
                sqr = Math.sqrt(theNumber1);
                if (sqr - Math.floor(sqr) == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }

        Number numberToCheck = new Number();
        numberToCheck.theNumber1 = Integer.parseInt(theNumber.getText().toString());

        if (numberToCheck.isSquareNumber()) {
            Toast.makeText(this, "The number is a SQUARE number", Toast.LENGTH_SHORT).show();
        }
        else if (numberToCheck.isTriangular()) {
            Toast.makeText(this, "The number is a TRIANGULAR number", Toast.LENGTH_SHORT).show();
        }
        else if (numberToCheck.isTriangular() && numberToCheck.isSquareNumber()) {
            Toast.makeText(this, "The number is both Square and Triangular in nature", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "You have entered a random number", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
