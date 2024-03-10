package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVoltar;
    private ImageView imageMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        buttonVoltar = findViewById(R.id.buttonVoltar);
        imageMoeda = findViewById(R.id.imageMoeda);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0) {
            imageMoeda.setImageResource(R.drawable.moeda_cara);

        } else {
            imageMoeda.setImageResource(R.drawable.moeda_coroa);

        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }
}