package com.zachrawi.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn0Clicked(View view) {
        Toast.makeText(this, "Btn 0 diklik", Toast.LENGTH_SHORT).show();
    }

    public void btn1Clicked(View view) {
        Toast.makeText(this, "Btn 1 diklik", Toast.LENGTH_SHORT).show();
    }

    public void btn2Clicked(View view) {
        Toast.makeText(this, "Btn 2 diklik", Toast.LENGTH_SHORT).show();
    }

    public void btn3Clicked(View view) {
        Toast.makeText(this, "Btn 3 diklik", Toast.LENGTH_SHORT).show();
    }

    public void btn4Clicked(View view) {

    }

    public void btn5Clicked(View view) {

    }

    public void btn6Clicked(View view) {

    }

    public void btn7Clicked(View view) {

    }

    public void btn8Clicked(View view) {

    }

    public void btn9Clicked(View view) {

    }

    public void btnDivideClicked(View view) {

    }

    public void btnMultiplyClicked(View view) {

    }

    public void btnMinusClicked(View view) {

    }

    public void btnPlusClicked(View view) {

    }

    public void btnClearClicked(View view) {

    }

    public void btnEqualClicked(View view) {

    }
}
