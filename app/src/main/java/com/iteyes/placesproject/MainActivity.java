package com.iteyes.placesproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);

        final ArrayList<String> places = new ArrayList<>();
        places.add("PLACES OF POSITIVE CASES:");
        places.add("Pooja Biraia\n"+"Ghazipur, Uttar Pradesh, 233226"+"\n" +"Ghazipur India");
        places.add("Aditi Kapoor\n"+"Buxar Sasaram Road, Chausa, Bihar, 802132\n" + "Chausa India");
        places.add("Raghav Mehrotra\n"+"Sagri, Uttar Pradesh, 276141\n" +"Sagri India");
        places.add("Hitarthi Vora\n"+"Varanasi, Uttar Pradesh, 221005\n" +
                "Bhagwanpur Varanasi India");
        places.add("Palavi Gupta\n"+"Lalganj, Uttar Pradesh, 276202\n" +
                "Lalganj India");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,places);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),TravelHistory.class);
                intent.putExtra("LocationInfo",i);
                startActivity(intent);
            }
        });

    }
}
