package com.example.aula7.toolbarejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar = (Toolbar)findViewById(R.id.id_toolbar);
        setContentView(R.layout.activity_main2);


        showToolbar(getResources().getString(R.string.sttr_tb_p2));
    }

    public void showToolbar (String title ){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);

    }

}
