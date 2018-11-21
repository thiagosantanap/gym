package com.cursoandroid.gymplus.gymplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class alteraNomeUsuario extends AppCompatActivity {

    private Button confirmaNomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera_nome_usuario);

        confirmaNomeUsuario = (Button) findViewById(R.id.confirmaId);

        confirmaNomeUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(alteraNomeUsuario.this,"Nome Alterado!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
