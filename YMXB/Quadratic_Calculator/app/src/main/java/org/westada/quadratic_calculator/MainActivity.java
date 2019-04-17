package org.westada.quadratic_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextView Result = (TextView) findViewById(R.id.ResultTextView);
                EditText X1Text = (EditText) findViewById(R.id.X1);
                EditText X2Text = (EditText) findViewById(R.id.X2);
                EditText X3Text = (EditText) findViewById(R.id.X3);
                EditText Y1Text = (EditText) findViewById(R.id.Y1);
                EditText Y2Text = (EditText) findViewById(R.id.Y2);
                EditText Y3Text = (EditText) findViewById(R.id.Y3);
                double X1 = Double.parseDouble(X1Text.getText().toString());
                double X2 = Double.parseDouble(X2Text.getText().toString());
                double X3 = Double.parseDouble(X3Text.getText().toString());
                double Y1 = Double.parseDouble(Y1Text.getText().toString());
                double Y2 = Double.parseDouble(Y2Text.getText().toString());
                double Y3 = Double.parseDouble(Y3Text.getText().toString());
                double a,b,c;
                a = ((X1*(Y3-Y2)) + (X2*(Y1-Y3))+(X3*(Y2-Y1)));
                a = a/((X1-X2)*(X1-X3)*(X2-X3));
                b = (Y2-Y1);
                b = b/((X2-X1)-a*(X1+X2));
                c = Y1 - a*Math.pow(X1, 2) - b*X1;
                Result.setText(a + "X^2" + " " + "+" + " " + b + "X" + " " + "+" + " " + c );
            }
        });
}}
