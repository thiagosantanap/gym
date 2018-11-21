package com.cursoandroid.gymplus.gymplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityAbaConfig extends AppCompatActivity {

    private TextView botaoPerfil;
    private TextView encontrePersonal;
    private TextView quemSomos;
    private TextView filtrarBusca;
    private TextView config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaconfig);

        botaoPerfil = (TextView) findViewById(R.id.botaoPerfilId);

        botaoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivityAbaConfig.this, activity_perfil.class);
                startActivity(intent1);
            }
        });

        encontrePersonal = (TextView) findViewById(R.id.encontreP);

        encontrePersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivityAbaConfig.this, MainActivity_localizacao.class);
                startActivity(intent2);
            }
        });

        quemSomos = (TextView) findViewById(R.id.quemsomosId);

        quemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivityAbaConfig.this, MainActivity_QuemSomos.class);
                startActivity(intent3);
            }
        });

        filtrarBusca = (TextView) findViewById(R.id.filtrarBusca);

        filtrarBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivityAbaConfig.this, activity_filtrar_busca.class);
                startActivity(intent4);
            }
        });

        config = (TextView) findViewById(R.id.configId);

        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivityAbaConfig.this, MainActivity_Configuracao.class);
                startActivity(intent5);
            }
        });
    }
}
