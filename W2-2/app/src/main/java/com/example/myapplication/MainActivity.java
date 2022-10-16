package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void function1(View v) {
        TextView res1 = findViewById(R.id.result);
        Spinner sp1 = findViewById(R.id.spinner);

        String s = String.valueOf(sp1.getSelectedItem());
        res1.setText(s);
    }
}