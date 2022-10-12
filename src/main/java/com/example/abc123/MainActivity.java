package com.example.abc123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapterUzytkownicy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText nowyuser = findViewById(R.id.editTextTextPersonName);
        ListView userListView=findViewById(R.id.listView);
        ArrayList<String> uzytkownicy = new ArrayList<>();

        uzytkownicy.add("Jan Kowalski");
        uzytkownicy.add("Dawid Nowak");

        adapterUzytkownicy = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                uzytkownicy
        );
        userListView.setAdapter(adapterUzytkownicy);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String tekst = nowyuser.getText().toString();
            uzytkownicy.add(tekst);
            adapterUzytkownicy.notifyDataSetChanged();
            }
        });
    }
}