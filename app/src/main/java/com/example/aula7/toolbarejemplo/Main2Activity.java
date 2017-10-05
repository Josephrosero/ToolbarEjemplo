package com.example.aula7.toolbarejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        toolbar = (Toolbar)findViewById(R.id.id_toolbar);


        showToolbar(getResources().getString(R.string.sttr_tb_p2), true);
    }

    public void showToolbar (String title, boolean upButton ){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled( upButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu2, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        showPantalla();

        return super.onOptionsItemSelected(item);
    }

    public  void  showPantalla (){
        Intent ListSong = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(ListSong);

    }

}
