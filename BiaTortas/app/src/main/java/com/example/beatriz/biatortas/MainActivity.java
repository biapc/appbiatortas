package com.example.beatriz.biatortas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl = (RelativeLayout)findViewById(R.id.relative_layout);
        rl.setBackgroundResource(R.drawable.background);

        Button button_cardapio = (Button) findViewById(R.id.button_cardapio);
        Button button_contato = (Button) findViewById(R.id.button_contato);
        Button button_historia = (Button) findViewById(R.id.button_historia);

        button_cardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_cardapio);
            }
        });

        button_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_contato);
            }
        });

        button_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_historia);
            }
        });
    }
}
