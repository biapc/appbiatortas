package com.example.beatriz.biatortas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.content.Context;

public class CardapioActivity extends AppCompatActivity {
    ImageButton button_torta1;
    ImageButton button_torta2;
    ImageButton button_torta3;
    ImageButton button_torta4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        button_torta1 = (ImageButton) findViewById(R.id.imageButton_torta1);
        button_torta2 = (ImageButton) findViewById(R.id.imageButton_torta2);
        button_torta3 = (ImageButton) findViewById(R.id.imageButton_torta3);
        button_torta4 = (ImageButton) findViewById(R.id.imageButton_torta4);

        button_torta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), DetalheTorta1Activity.class));
            }
        });

        button_torta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Detalhe2Activity.class));
            }
        });

        button_torta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Detalhe3Activity.class));
            }
        });

        button_torta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Detalhe4Activity.class));
            }
        });
    }
}
