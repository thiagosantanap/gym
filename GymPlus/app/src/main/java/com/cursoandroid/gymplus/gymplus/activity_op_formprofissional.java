package com.cursoandroid.gymplus.gymplus;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

public class activity_op_formprofissional extends AppCompatActivity {

    private EditText editTextInfo;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_formprofissional);

        /*editTextInfo = (editTextInfo) findViewById(R.id.editTextInfo);

        editTextInfo.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(200)
        });*/
    }
}
