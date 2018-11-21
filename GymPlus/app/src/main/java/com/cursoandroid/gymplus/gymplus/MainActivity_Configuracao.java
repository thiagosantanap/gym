package com.cursoandroid.gymplus.gymplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_Configuracao extends AppCompatActivity {

    private Button alteraNomeUsuario;
    private Button alteraDescricao;
    private Button alteraFormcacaoProf;
    private Button confirmaNomeUsuario;
    private Button confirmaAlteraDesc;
    private Button confirmaAlteraFP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__configuracao);

        alteraNomeUsuario = (Button) findViewById(R.id.nomeUsuarioId);

        alteraNomeUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity_Configuracao.this, alteraNomeUsuario.class);
                startActivity(i1);
            }
        });

        alteraDescricao = (Button) findViewById(R.id.altDescId);

        alteraDescricao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity_Configuracao.this, alteraDescricao.class);
                startActivity(i2);
            }
        });

        alteraFormcacaoProf = (Button) findViewById(R.id.altFormPId);

        alteraFormcacaoProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity_Configuracao.this, alteraFormProfissional.class);
                startActivity(i3);
            }
        });

    }
}
