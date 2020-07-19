package com.example.demoapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public void convert(View view){
    EditText dollar = (EditText) findViewById(R.id.dollar);
    Log.i("info",dollar.getText().toString());
    Double dollarDouble = Double.parseDouble(dollar.getText().toString());
    Double euro = dollarDouble*0.87;
    Toast.makeText(this, String.format("%.2f",euro) + "€", Toast.LENGTH_LONG).show();
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}