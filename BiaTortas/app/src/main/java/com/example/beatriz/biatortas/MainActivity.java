package com.example.beatriz.biatortas;

import android.support.v7.app.ActionBar;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle(getResources().getString(R.string.app_name));

        Button button_cardapio = (Button) findViewById(R.id.button_cardapio);
        Button button_contato = (Button) findViewById(R.id.button_contato);
        Button button_historia = (Button) findViewById(R.id.button_historia);
        Button button_change_language = (Button) findViewById(R.id.button_change_language);

        button_cardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), CardapioActivity.class));
                //setContentView(R.layout.activity_cardapio);
            }
        });

        button_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), ContatoActivity.class));
                //setContentView(R.layout.activity_contato);
            }
        });

        button_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), HistoriaActivity.class));
                //setContentView(R.layout.activity_historia);
            }
        });

        button_change_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangeLanguageDialog();
            }
        });
    }

    private void showChangeLanguageDialog() {
        final String[] list_items = { "Português", "English", "Español"};
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);
        mbuilder.setTitle("Altere a linguagem...");
        mbuilder.setSingleChoiceItems(list_items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (i == 0) {
                    setLocale("pt");
                    recreate();
                }
                else if (i == 1) {
                    setLocale("en");
                    recreate();
                }
                else if (i == 2) {
                    setLocale("es");
                    recreate();
                }
                dialog.dismiss();
            }
        });
        AlertDialog mdialog = mbuilder.create();
        mdialog.show();
    }

    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }

    public void loadLocale() {
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language);
    }
}
