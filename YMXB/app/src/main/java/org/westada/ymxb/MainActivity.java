package org.westada.ymxb;

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
                TextView MResult = (TextView) findViewById(R.id.MResultView);
                TextView BResult = (TextView) findViewById(R.id.BResultView);
                EditText X1Text = (EditText) findViewById(R.id.X1Text);
                EditText X2Text = (EditText) findViewById(R.id.X2Text);
                EditText Y1Text = (EditText) findViewById(R.id.Y1Text);
                EditText Y2Text = (EditText) findViewById(R.id.Y2Text);
                Double X1 = Double.parseDouble(X1Text.getText().toString());
                Double X2 = Double.parseDouble(X2Text.getText().toString());
                Double Y1 = Double.parseDouble(Y1Text.getText().toString());
                Double Y2 = Double.parseDouble(Y2Text.getText().toString());
                Double Y3 = Y2-Y1;
                Double X3 = X2-X1;
                Double M = Y3/X3;
                Double B = Y1 - (M*X1);
                MResult.setText(M + "");
                BResult.setText(B + "");

            }
        });
    }
}
