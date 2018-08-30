package com.example.trash.funnybirds.Core;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Birds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }
}
