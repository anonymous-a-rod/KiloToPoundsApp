package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Declaring widgets
    EditText editText;
    TextView textView, textView2, textView4, valueInPounds;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instaniating Widgets

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueInPounds = findViewById(R.id.valueInPounds);

        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);

        // Adding a Click event for button (Executing the convert method)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Calling ConvertFromKiloToPound Method

                ConvertFromKiloToPounds();
            }
        });

    }

    private void ConvertFromKiloToPounds() {
        // This method will convert the values entered in EditText
        // From Kilo to pounds

        String valueEnteredInKilo = editText.getText().toString();

        // converting string to number
        double Kilo = Double.parseDouble(valueEnteredInKilo);

        // converting kilo to pounds formula
        double pounds = Kilo*2.205;
        pounds = ((double)(((int)(pounds*100)))/100);

        // Displaying the value resulted in textView
        valueInPounds.setText(" " + pounds);

    }
}