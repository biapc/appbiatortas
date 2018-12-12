package com.example.beatriz.biatortas;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalheTorta1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_torta1);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        ImageAdaptor adapter = new ImageAdaptor(this);
        viewPager.setAdapter(adapter);
    }
}
