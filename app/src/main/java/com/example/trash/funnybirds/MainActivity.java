package com.example.trash.funnybirds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trash.funnybirds.Core.Birds;
import com.example.trash.funnybirds.Core.GameView;

public class MainActivity extends AppCompatActivity {

    Intent startIntent;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startIntent = new Intent(this, Birds.class);

        startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startIntent);
            }
        });
    }
}
