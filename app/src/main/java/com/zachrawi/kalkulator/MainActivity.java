package com.zachrawi.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvScreen;

    String screen = "0";
    long longScreen = 0;

    long holder = 0;

    String mode = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScreen = findViewById(R.id.tvScreen);
    }

    private void updateScreen(String value) {
        if (longScreen == 0) {
            longScreen = Long.valueOf(value);
        } else {
            longScreen = Long.valueOf(screen + value);
        }

        screen = String.valueOf(longScreen);
        tvScreen.setText(String.valueOf(longScreen));
    }

    private void clearScreen() {
        longScreen = 0;
        screen = "0";
        tvScreen.setText(screen);
    }

    public void btn0Clicked(View view) {
        updateScreen("0");
    }

    public void btn1Clicked(View view) {
        updateScreen("1");
    }

    public void btn2Clicked(View view) {
        updateScreen("2");
    }

    public void btn3Clicked(View view) {
        updateScreen("3");
    }

    public void btn4Clicked(View view) {
        updateScreen("4");
    }

    public void btn5Clicked(View view) {
        updateScreen("5");
    }

    public void btn6Clicked(View view) {
        updateScreen("6");
    }

    public void btn7Clicked(View view) {
        updateScreen("7");
    }

    public void btn8Clicked(View view) {
        updateScreen("8");
    }

    public void btn9Clicked(View view) {
        updateScreen("9");
    }

    public void btnDivideClicked(View view) {
        holder = longScreen;
        mode = "divide";
        longScreen = 0;
        screen = "0";
    }

    public void btnMultiplyClicked(View view) {
        holder = longScreen;
        mode = "multiply";
        longScreen = 0;
        screen = "0";
    }

    public void btnMinusClicked(View view) {
        holder = longScreen;
        mode = "minus";
        longScreen = 0;
        screen = "0";
    }

    public void btnPlusClicked(View view) {
        holder = longScreen;
        mode = "add";
        longScreen = 0;
        screen = "0";
    }

    public void btnClearClicked(View view) {
        clearScreen();
    }

    public void btnEqualClicked(View view) {
        long result = 0;

        if (mode == "add") {
            result = holder + longScreen;
        } else if (mode == "minus") {
            result = holder - longScreen;
        } else if (mode == "multiply") {
            result = holder * longScreen;
        } else if (mode == "divide") {
            result = holder / longScreen;
        }

        holder = result;
        longScreen = 0;
        screen = "0";

        tvScreen.setText(String.valueOf(result));
    }
}
