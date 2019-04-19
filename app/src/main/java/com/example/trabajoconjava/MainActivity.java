package com.example.trabajoconjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int valor=0;
    TextView txtNumero;

    private Button btnSumar;
    private Button btnRestar;
    private Button btnZoomMas;
    private Button btnZoomMenos;
    private Button btnReset;
    private Button btnOcultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNumero=findViewById(R.id.txtNumero);

        txtNumero.setText(String.valueOf(valor));
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restar();
            }
        });



    }

    private void Sumar(){
        valor++;
        txtNumero.setText(String.valueOf(valor));
    }

    private void Restar(){
        if(valor>0){
            valor--;
            txtNumero.setText(String.valueOf(valor));
        } else{
            Toast.makeText(this, "NO se permiten valores negativos", Toast.LENGTH_SHORT).show();
        }

    }

    private void ZoomMas(View v){
        txtNumero.setTextSize(txtNumero.getTextSize()+(6));
    }


    private void ZoomMenos(View v){
        txtNumero.setTextSize(txtNumero.getTextSize()-(6));
    }

    private void Ocultar(View v){
        txtNumero.setVisibility(View.INVISIBLE);
    }

    private void Reset(View v){
        txtNumero.setText("0");
        txtNumero.setVisibility(View.VISIBLE);
    }
/*
    @Override
    protected void onStart() {
        super.onStart();

        // Muestro por pantalla un mensaje

        Toast.makeText(this, "ON Start se ejecuto", Toast.LENGTH_SHORT).show();

        // muestro en consola "logcat" un mensaje
        Log.i("CICLO_VIDA", "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // Muestro por pantalla un mensaje

        Toast.makeText(this, "ON Restart se ejecuto", Toast.LENGTH_SHORT).show();

        // muestro en consola "logcat" un mensaje
        Log.i("CICLO_VIDA", "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Muestro por pantalla un mensaje

        Toast.makeText(this, "ON Pause se ejecuto", Toast.LENGTH_SHORT).show();

        // muestro en consola "logcat" un mensaje
        Log.i("CICLO_VIDA", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Muestro por pantalla un mensaje

        Toast.makeText(this, "ON Resume se ejecuto", Toast.LENGTH_SHORT).show();

        // muestro en consola "logcat" un mensaje
        Log.i("CICLO_VIDA", "onResume: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Muestro por pantalla un mensaje

        Toast.makeText(this, "ON Stop se ejecuto", Toast.LENGTH_SHORT).show();

        // muestro en consola "logcat" un mensaje
        Log.i("CICLO_VIDA", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Muestro por pantalla un mensaje

        Toast.makeText(this, "ON Destroy se ejecuto", Toast.LENGTH_SHORT).show();

        // muestro en consola "logcat" un mensaje
        Log.i("CICLO_VIDA", "onDestroy: ");
    }

    */
}
