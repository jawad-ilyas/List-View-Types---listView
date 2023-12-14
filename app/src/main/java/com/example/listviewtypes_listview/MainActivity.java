package com.example.listviewtypes_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvPeople = findViewById(R.id.lvPeople);
        // we can work with array and array list both when we worked with list view

        ArrayList<String> arrPeople = new ArrayList<>();

        arrPeople.add("Jawad");
        arrPeople.add("Ilyas");
        arrPeople.add("Mughal");
        arrPeople.add("Ahmad");


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.activity_list_item, arrPeople);
        lvPeople.setAdapter(adapter);

    }
}