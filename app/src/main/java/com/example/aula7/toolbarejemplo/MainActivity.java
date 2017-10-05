package com.example.aula7.toolbarejemplo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.id_toolbar);

        showToolbar(getResources().getString(R.string.sttr_tb_p1));
    }



    // para mostrar la toolbar

    public void showToolbar (String title ){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        showPantalla();

        return super.onOptionsItemSelected(item);
    }

    public  void  showPantalla (){
        Intent ListSong = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(ListSong);

    }

}
