package org.westada.peachlist;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] items;
    String[] prices;
    String[] descriptions;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        ListView myListview = findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);
        prices = res.getStringArray(R.array.prices);
        descriptions = res.getStringArray((R.array.descriptions));


        ItemAdapter itemAdapter = new ItemAdapter(this, items, prices, descriptions);
        myListview.setAdapter(itemAdapter);
        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity =
                        new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("butterfield.mentorschools.org.ITEM_INDEX", i);
                startActivity(showDetailActivity);
            }
        });


    }
}
