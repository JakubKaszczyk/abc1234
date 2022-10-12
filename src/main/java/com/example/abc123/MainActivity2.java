package com.example.abc123;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spinner = findViewById(R.id.spinner);
        ImageView zdjecie = findViewById(R.id.imageView);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    zdjecie.setImageResource(R.drawable.android);
                }
                if(i==1){
                    zdjecie.setImageResource(R.drawable.bank);
                }
                if (i==2){
                    zdjecie.setImageResource(R.drawable.zegar);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}