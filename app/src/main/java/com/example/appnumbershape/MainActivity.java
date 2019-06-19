package com.example.appnumbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isTriangular() {

            int x = 1;
            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number) {

                return true;

            } else {

                return false;

            }
        }

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }
        }
    }


    public void testButton (View view) {

        String makeText;

        EditText userNumber = (EditText) findViewById(R.id.userNumber);

        if (userNumber.getText().toString().isEmpty()) {

            makeText = ("Please enter a number");

        }

        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(userNumber.getText().toString());

        if (myNumber.isTriangular()) {

            if (myNumber.isSquare()) {

                makeText= (myNumber.number + " is a triangular and square number!");

            } else {

                makeText = (myNumber.number + " is a triangular but not a square number.");

            }

        } else {

            if (myNumber.isSquare()) {

                makeText = (myNumber.number + " is a square but not triangular number!");

            } else {

                makeText = (myNumber.number + " is not a triangular or square number.");

            }
        }


            Toast.makeText(MainActivity.this, makeText, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
