package com.example.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView numero;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setText("Click aqui!");
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Random
                Random random = new Random();
                Button b = (Button) view;
                int nInicial=1;
                int nFinal=3;
                int nSorteado = random.nextInt(nFinal-nInicial)+nInicial;
                // pega o nmero final e tira o numero inicial, após isso soma com o inicial para ter o controle de manter entre o inicial e o final
                numero.setText(String.valueOf(nSorteado));
            }
        });
    }
}