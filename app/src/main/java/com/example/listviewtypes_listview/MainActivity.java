package com.example.listviewtypes_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_activated_1, arrPeople);
        lvPeople.setAdapter(adapter);


        lvPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    Toast.makeText(MainActivity.this, "You Clicked on First Item", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}