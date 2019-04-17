package org.westada.homepage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CalcBTN = (Button)(findViewById(R.id.CalcBTN));
        CalcBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage(("org.westada.myapplication"));
                startIntent.putExtra("org.westada.HomePage2.Something", "Hello World!");
                startActivity(startIntent);
            }
        });
        Button SlopeBTN = (Button)(findViewById(R.id.SlopeBTN));
        SlopeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage(("org.westada.ymxb"));
                startIntent.putExtra("org.westada.HomePage2.Something", "Hello World!");
                startActivity(startIntent);
            }
        });
        Button PeachBTN = (Button)(findViewById(R.id.PeachBTN));
        PeachBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage(("org.westada.listapp"));
                startIntent.putExtra("org.westada.HomePage2.Something", "Hello World!");
                startActivity(startIntent);
            }
        });

        // Attempt to launch an activity outside our app
        Button CreativeBTN = (Button)findViewById(R.id.CreativeBtn);
        CreativeBTN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage(("org.westada.listapp"));
                startIntent.putExtra("org.westada.HomePage2.Something", "Hello World!");
                startActivity(startIntent);
            }
        });
        Button QuadraticBTN = (Button)findViewById(R.id.QuadraticBTN);
        QuadraticBTN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage(("org.westada.quadratic_calculator"));
                startIntent.putExtra("org.westada.HomePage2.Something", "Hello World!");
                startActivity(startIntent);
            }
        });

    }
}
