package com.fiap.mob.calcproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumber1, edtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // (EditText) => explicit conversion
        edtNumber1 = (EditText) findViewById(R.id.edtNumber1); // pointing from XML file
        edtNumber2 = (EditText) findViewById(R.id.edtNumber2);
    }

    public void sum(View v) {
        int number1 = Integer.parseInt(edtNumber1.getText().toString());
        int number2 =  Integer.parseInt(edtNumber2.getText().toString());

        // TODO: validate BOTH fields in case they're null/undefined
        // TODO: integrate/validate DOUBLE types

        int total = number1 + number2;

        Toast.makeText(this, getString(R.string.lblTotal) + total, Toast.LENGTH_SHORT).show();
    }

}
