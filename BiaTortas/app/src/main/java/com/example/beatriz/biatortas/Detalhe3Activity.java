package com.example.beatriz.biatortas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Detalhe3Activity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_torta3);

        int[] images = new int[] {R.drawable.ninhotrufado, R.drawable.morango, R.drawable.alema, R.drawable.cheesecakeoreo};
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ImageAdaptor adapter = new ImageAdaptor(this, images);
        viewPager.setAdapter(adapter);

        Button contactar = (Button) findViewById(R.id.button_contactar);

        contactar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsApp(v);
            }
        });
    }

    public void openWhatsApp(View view){
        try {
            String text = "Olá, gostaria de encomendar a Torta de Leite Ninho com Nutella! Aguardo retorno. ";

            String toNumber = "+55 21979143339";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
