package com.example.andy.currencyconverter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    public void convert (View v){
       //find id for EditText
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);

        //find id for Button
        Button covert = (Button) findViewById(R.id.convert);

        //Convert enter dollar amount into double
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());


        //convert Canadian dollars to American dollars
        Double poundAmount = 0.76 * dollarAmountDouble;

        //Shows converted amount
        Toast.makeText(this, poundAmount.toString(), Toast.LENGTH_SHORT).show();
        
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }
}
