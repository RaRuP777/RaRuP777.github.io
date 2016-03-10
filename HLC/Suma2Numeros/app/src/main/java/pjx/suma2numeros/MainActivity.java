package pjx.suma2numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numero1, numero2, resultado;
    private EditText tnumero1, tnumero2;
    private TextView cresultado;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tnumero1 = (EditText) findViewById(R.id.numero1);
        tnumero2 = (EditText) findViewById(R.id.numero2);
        button = (Button) findViewById(R.id.button);
        cresultado = (TextView) findViewById(R.id.resultado);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numero1 = Integer.parseInt(tnumero1.getText().toString());
                numero2 = Integer.parseInt(tnumero2.getText().toString());
                resultado = numero1 + numero2;
                cresultado.setText(Integer.toString(resultado));
            }
        });
    }
}
