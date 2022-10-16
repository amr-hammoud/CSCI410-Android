package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edX = findViewById(R.id.edX);
        EditText edY = findViewById(R.id.edY);
        Button bt = findViewById(R.id.button);
        TextView tv = findViewById(R.id.result);

        bt.setOnClickListener(view -> {
            try {
                int x = Integer.parseInt(edX.getText().toString());
                int y = Integer.parseInt(edY.getText().toString());
                int sum = x + y;
                tv.setText("The sum is " + sum);
            }
            catch (Exception ex) {
                Toast.makeText(this, "please fill all fields", Toast.LENGTH_SHORT).show();
            }
        });
    }
}