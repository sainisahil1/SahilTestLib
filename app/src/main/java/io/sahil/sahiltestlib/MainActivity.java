package io.sahil.sahiltestlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.sahil.sahillib.SahilLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("TAG", "add " + SahilLib.add(4, 5.5));

        try {
            Log.e("Tag", "division " + SahilLib.divide(4, 0));
        } catch (Exception e) {
            Log.e("TAG", e.getMessage());
        }
    }
}