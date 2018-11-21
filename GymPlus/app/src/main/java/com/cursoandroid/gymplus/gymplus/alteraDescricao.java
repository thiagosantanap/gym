package com.cursoandroid.gymplus.gymplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class alteraDescricao extends AppCompatActivity {

    private Button confirmaAlteraDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera_descricao);


        confirmaAlteraDesc = (Button) findViewById(R.id.confirmarId2);

        confirmaAlteraDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(alteraDescricao.this,"Descrição Alterada!" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
