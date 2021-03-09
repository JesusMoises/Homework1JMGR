package com.example.homework1jmgr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // creamos objeto intent y usamos el método getIntent el cual devuelve un intent si es que hay alguno disponible
        Intent intent = getIntent();
        //Obtenemos mediante la primera activity el mensaje de nuestra variable clave-valor el cual es el id del mensaje adicional
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //Obtenemos la referencia de nuestro textView
        TextView textView = findViewById(R.id.txt_count_second);
        //colocamos el mensaje que se ha recibido mediante la clave-valor de nuestra priemra Activity y lo colocamos en el TextView
        textView.setText(message);
    }
}