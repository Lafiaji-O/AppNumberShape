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

        String makeText, suppliedNumber;

        EditText userNumber = findViewById(R.id.userNumber);

        suppliedNumber = userNumber.getText().toString();

        if (suppliedNumber.isEmpty()) {

            makeText = "Please enter a number";

        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(suppliedNumber);


            if (suppliedNumber.isEmpty()) {

                makeText = "Please enter a number";

            } else {

                if (myNumber.isSquare()) {

                    if (myNumber.isTriangular()) {

                        makeText = myNumber.number + " is both square and triangular!";

                    } else {

                        makeText = myNumber.number + " is square but not triangular.";

                    }

                } else {

                    if (myNumber.isTriangular()) {

                        makeText = myNumber.number + " is triangular but not square.";

                    } else {

                        makeText = myNumber.number + " is neither square nor triangular.";

                    }

                }

            }

        }

        Toast.makeText(MainActivity.this, makeText, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
