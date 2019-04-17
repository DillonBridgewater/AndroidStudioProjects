package org.westada.homepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("org.westada.HomePage2.Something")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String Text = getIntent().getExtras().getString("org.westada.HomePage2.Something");
            tv.setText(Text);
        }
    }
}
