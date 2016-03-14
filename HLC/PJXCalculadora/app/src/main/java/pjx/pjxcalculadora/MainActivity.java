package pjx.pjxcalculadora;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button acercade, salir, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sumar, restar, multiplicar, dividir, resultado, reset;
    private int total;
    private TextView visor;
    private String operando1, operando2, operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = (TextView) findViewById(R.id.textView);
        acercade = (Button) findViewById(R.id.acercade);
        acercade.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Pedro J. Ramos. 2ºDAW. 2015/2016";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        salir = (Button) findViewById(R.id.salir);
        salir.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });
        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(0);
            }
        });
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(1);
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(2);
            }
        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(3);
            }
        });
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(4);
            }
        });
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(5);
            }
        });
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(6);
            }
        });
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(7);
            }
        });
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(8);
            }
        });
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                lanzarN(9);
            }
        });
        sumar = (Button) findViewById(R.id.sumar);
        sumar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                operando1 = visor.getText().toString();
                operacion="S";
                visor.setText("0");
            }
        });
        restar = (Button) findViewById(R.id.restar);
        restar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                operando1 = visor.getText().toString();
                operacion="R";
                visor.setText("0");
            }
        });
        multiplicar = (Button) findViewById(R.id.multiplicar);
        multiplicar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                operando1 = visor.getText().toString();
                operacion="M";
                visor.setText("0");
            }
        });
        dividir = (Button) findViewById(R.id.dividir);
        dividir.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                operando1 = visor.getText().toString();
                operacion="D";
                visor.setText("0");
            }
        });
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                visor.setText("0");
            }
        });
        resultado = (Button) findViewById(R.id.resultado);
        resultado.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                operando2 = visor.getText().toString();
                switch (operacion){
                    case "S":
                        total = Integer.parseInt(operando1) + Integer.parseInt(operando2);
                        break;
                    case "R":
                        total = Integer.parseInt(operando1) - Integer.parseInt(operando2);
                        break;
                    case "M":
                        total = Integer.parseInt(operando1) * Integer.parseInt(operando2);
                        break;
                    case "D":
                        total = Integer.parseInt(operando1) / Integer.parseInt(operando2);
                }
                operando1 = "";
                operando2 = "";
                operacion = "";
                visor.setText(Integer.toString(total));
            }
        });
    }

    public void lanzarN(int n) {
        String numero=visor.getText().toString();
        if (numero.equals("0"))
            numero="";
        visor.setText(numero + String.valueOf(n));
    }
}
