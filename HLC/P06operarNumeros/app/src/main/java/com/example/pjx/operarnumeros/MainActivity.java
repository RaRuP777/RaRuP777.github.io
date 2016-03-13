package com.example.pjx.operarnumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int n1, n2, resultado;
    private EditText cn1, cn2;
    private TextView cresultado;
    private Button btSuma, btResta, btMultiplica, btDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cn1 = (EditText) findViewById(R.id.editText);
        cn2 = (EditText) findViewById(R.id.editText2);
        btSuma = (Button) findViewById(R.id.button);
        btResta = (Button) findViewById(R.id.button2);
        btMultiplica = (Button) findViewById(R.id.button3);
        btDivide = (Button) findViewById(R.id.button4);
        cresultado = (TextView) findViewById(R.id.textView3);

        btSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(cn1.getText().toString());
                n2 = Integer.parseInt(cn2.getText().toString());
                resultado = n1 + n2;
                cresultado.setText(Integer.toString(resultado));
            }
        });

        btResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(cn1.getText().toString());
                n2 = Integer.parseInt(cn2.getText().toString());
                resultado = n1 - n2;
                cresultado.setText(Integer.toString(resultado));
            }
        });

        btMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(cn1.getText().toString());
                n2 = Integer.parseInt(cn2.getText().toString());
                resultado = n1 * n2;
                cresultado.setText(Integer.toString(resultado));
            }
        });

        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(cn1.getText().toString());
                n2 = Integer.parseInt(cn2.getText().toString());
                resultado = n1 / n2;
                cresultado.setText(Integer.toString(resultado));
            }
        });
    }
}
