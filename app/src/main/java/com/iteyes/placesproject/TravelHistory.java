package com.iteyes.placesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TravelHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_history);
        ListView listView = (ListView) findViewById(R.id.listview);

        final ArrayList<String> places = new ArrayList<>();
        places.add("Name:- Pooja Biraia");
        places.add("Gender-Female");
        places.add("Age-45");
        places.add("Status-Corona positive[hospitalized]");
        places.add("Travelled Places...");
        places.add("Ghazipur - Mau Road, Sahadatpura, Chak Mehdi, Mau, Uttar Pradesh 233001");
        places.add("Prakash Hospital Sahadatpura, Mau, Uttar Pradesh 275101");
        places.add("Hotel Madhav Mau, Sahadatpura, Mau, Uttar Pradesh 275101");
        places.add("Paniara Hault,Utter Pradesh 275101");
        places.add("State Bank of India,Taranpur, Utter Pradesh 233305");
        places.add("Raoolpur Post Office,Rasukhpur T. Shakhpur,Utter Pradesh 233305");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,places);
        listView.setAdapter(arrayAdapter);
    }
}
