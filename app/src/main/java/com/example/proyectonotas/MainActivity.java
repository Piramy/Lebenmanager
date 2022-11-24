package com.example.proyectonotas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickHacer(View view) {
        Intent i = new Intent(this, MainNota.class);
        startActivity(i);
    }

    public void ClickProgramar(View view) {
        Intent i = new Intent(this, MainNota.class);
        startActivity(i);
    }

    public void ClickDelegar(View view) {
        Intent i = new Intent(this, MainNota.class);
        startActivity(i);
    }

    public void ClickEliminar(View view) {
        Intent i = new Intent(this, MainNota.class);
        startActivity(i);
    }

}