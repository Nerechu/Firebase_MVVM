package com.example.firebase_mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText mEtNom, mEtIngredients, mEtPreu;
    private Button mBtnAfegir, mBtnActualitzar, mBtnEsborrar;

    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicialitzarComponents();
        InicialitzarListeners();
    }

    private  void InicialitzarListeners(){
        mBtnAfegir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AfegirPizza();
                
            }
        });

        mBtnActualitzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                ActualitzarPizza();

            }
        });

        mBtnEsborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                EsborrarPizza();
                
            }
        });
    }

    private void EsborrarPizza() {
    }

    private void ActualitzarPizza() {
    }

    private void AfegirPizza() {
    }

    private void InicialitzarComponents(){

        mEtNom = findViewById(R.id.ET_Nom);
        mEtIngredients = findViewById(R.id.ET_Ingredients);
        mEtPreu = findViewById(R.id.ET_Preu);
        mBtnAfegir = findViewById(R.id.BTN_Afegir);
        mBtnActualitzar = findViewById(R.id.BTN_Actualitzar);
        mBtnEsborrar = findViewById(R.id.BTN_Esborrar);

        mDatabase = FirebaseDatabase.getInstance();
        mReference = mDatabase.getReference();
    }
}