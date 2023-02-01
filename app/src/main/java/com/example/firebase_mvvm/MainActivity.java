package com.example.firebase_mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtNom, mEtIngredients, mEtPreu;
    private Button mBtnAfegir, mBtnActualitzar, mBtnEsborrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicialitzarComponents();
    }

    private void InicialitzarComponents(){

        mEtNom = findViewById(R.id.ET_Nom);
        mEtIngredients = findViewById(R.id.ET_Ingredients);
        mEtPreu = findViewById(R.id.ET_Preu);
        mBtnAfegir = findViewById(R.id.BTN_Afegir);
        mBtnActualitzar = findViewById(R.id.BTN_Actualitzar);
        mBtnEsborrar = findViewById(R.id.BTN_Esborrar);
    }
}