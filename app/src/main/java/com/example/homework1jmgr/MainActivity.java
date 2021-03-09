package com.example.homework1jmgr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    //mensaje mediante clave-valor definida public para poder usarla tambien en la SecondActivity
    public static final String EXTRA_MESSAGE = "com.example.homework1.extra.MESSAGE";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obtenemos la referencia que fue escrito en nuestra primera activity EditText y lo guardamos en mMessageEditText
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        //obtenemos la cadena que tiene nuestra variable mShowCount
        String message = mShowCount.getText().toString();

        /*creamos objeto Intent para segunda activity, en el primer parámetro hacemos referencia a la clase actual y el segundo a
        la clase a la que vamos en este caso nuestra SecondActivity*/
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        //lanzamos nuestra SecondActivity
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}