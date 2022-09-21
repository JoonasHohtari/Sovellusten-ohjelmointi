package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Function to calculate given values into BMI
    public void calculateBMI(View view) {
        EditText heightText = findViewById(R.id.editTextNumberHeight);
        EditText weightText = findViewById(R.id.editTextNumberWeight);

        float height = Float.parseFloat(heightText.getText().toString());
        float weight = Float.parseFloat(weightText.getText().toString());
        float bmiResult = weight / (height/100 * height/100);

        TextView resultText = findViewById(R.id.textViewResult);
        resultText.setText("" + bmiResult);
    }
}