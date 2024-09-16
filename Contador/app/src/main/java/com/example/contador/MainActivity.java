package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView numero;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.textView);
        numero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView numero = (TextView) view;
                numero.setText("0");
                contador++;
                numero.setText(Integer.toString(contador));

            }
        });

        button = findViewById(R.id.button);
        button.setText("Click aqui");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                b.setText("0");
                contador++;
                numero.setText(Integer.toString(contador));
            }
        });
    }
}