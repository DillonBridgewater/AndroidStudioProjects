package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumberEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

    }
}
