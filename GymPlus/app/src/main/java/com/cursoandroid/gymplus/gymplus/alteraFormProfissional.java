package com.cursoandroid.gymplus.gymplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class alteraFormProfissional extends AppCompatActivity {

    private Button confirmaAlteraFP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera_form_profissional);

        confirmaAlteraFP = (Button) findViewById(R.id.confirmarId3);

        confirmaAlteraFP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(alteraFormProfissional.this,"Formação Profissional Alterada!" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
