package com.cursoandroid.gymplus.gymplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_perfil extends AppCompatActivity {

    private Button perfil;
    private Button formprofissional;
    private Button abaconfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);


        perfil = (Button) findViewById(R.id.buttonPerfil);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(activity_perfil.this, activity_descricao.class);
                startActivity(intent1);
            }
        });

        formprofissional = findViewById(R.id.buttonFProf);

        formprofissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(activity_perfil.this, activity_op_formprofissional.class);
                startActivity(intent2);
            }
        });

        abaconfig = (Button) findViewById(R.id.buttonMenu);

        abaconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(activity_perfil.this, MainActivityAbaConfig.class);
                startActivity(intent3);
            }
        });

    }
}
