package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn = (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double result = getNumberOne() + getNumberTwo();
                getResultView().setText(result + "");
            }
        });
        Button multBtn = (Button) findViewById(R.id.MultButton);
        multBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double result = getNumberOne() * getNumberTwo();
                getResultView().setText(result + "");
            }
        });
        Button subBtn = (Button) findViewById(R.id.SubButton);
        subBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double result = getNumberOne() - getNumberTwo();
                getResultView().setText(result + "");
            }
        });
        Button divBtn = (Button) findViewById(R.id.DivButton);
        divBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double result = getNumberOne() / getNumberTwo();
                getResultView().setText(result + "");
            }
        });
        Button powerBtn = (Button) findViewById(R.id.powerBtn);
        powerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double result = Math.pow(getNumberOne(), getNumberTwo());
                getResultView().setText(result + "");
            }
        });
        Button logBtn = (Button) findViewById(R.id.logBtn);
        logBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double result = (Math.log(getNumberTwo()))/Math.log(getNumberOne());
                getResultView().setText(result + "");
            }
        });
        // Methods
    }
        private double getNumberOne(){
            EditText firstNumEditText = (EditText) findViewById(R.id.firstNumberEditText);
            return Double.parseDouble(firstNumEditText.getText().toString());
        }
        private double getNumberTwo() {
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        return Double.parseDouble(secondNumEditText.getText().toString());
        }
        private TextView getResultView() {
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        return resultTextView;
        }




    }


