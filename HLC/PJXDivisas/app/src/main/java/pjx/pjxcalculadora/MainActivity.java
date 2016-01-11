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

    final private static double USD = 1.0888;
    final private static double JPY = 128.33;
    final private static double BGN = 1.9558;
    final private static double CZK = 27.021;
    final private static double DKK = 7.4603;
    final private static double GBP = 0.74705;
    final private static double HUF = 317.32;
    final private static double PLN = 4.3646;
    final private static double RON = 4.5305;

    /**
    <Cube currency="SEK" rate="9.2720"/>
    <Cube currency="CHF" rate="1.0863"/>
    <Cube currency="NOK" rate="9.6770"/>
    <Cube currency="HRK" rate="7.6455"/>
    <Cube currency="RUB" rate="81.9975"/>
    <Cube currency="TRY" rate="3.2872"/>
    <Cube currency="AUD" rate="1.5516"/>
    <Cube currency="BRL" rate="4.3786"/>
    <Cube currency="CAD" rate="1.5336"/>
    <Cube currency="CNY" rate="7.1554"/>
    <Cube currency="HKD" rate="8.4471"/>
    <Cube currency="IDR" rate="15076.42"/>
    <Cube currency="ILS" rate="4.2827"/>
    <Cube currency="INR" rate="72.7413"/>
    <Cube currency="KRW" rate="1309.12"/>
    <Cube currency="MXN" rate="19.4182"/>
    <Cube currency="MYR" rate="4.7655"/>
    <Cube currency="NZD" rate="1.6577"/>
    <Cube currency="PHP" rate="51.326"/>
    <Cube currency="SGD" rate="1.5607"/>
    <Cube currency="THB" rate="39.491"/>
    <Cube currency="ZAR" rate="18.0474"/>
    **/

    private Button  acercade, salir,
                    b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
                    reset, usd, jpy, bgn, czk, dkk, gbp, huf, pln, ron;
    private double total;
    private TextView visor;
    private String operando;

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
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                visor.setText("0");
            }
        });
        usd = (Button) findViewById(R.id.usd);
        usd.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("usd");
            }
        });
        jpy = (Button) findViewById(R.id.jpy);
        jpy.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("jpy");
            }
        });
        bgn = (Button) findViewById(R.id.bgn);
        bgn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("bgn");
            }
        });
        czk = (Button) findViewById(R.id.czk);
        czk.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("czk");
            }
        });
        dkk = (Button) findViewById(R.id.dkk);
        dkk.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("dkk");
            }
        });
        gbp = (Button) findViewById(R.id.gbp);
        gbp.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("gbp");
            }
        });
        huf = (Button) findViewById(R.id.huf);
        huf.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("huf");
            }
        });
        pln = (Button) findViewById(R.id.pln);
        pln.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("pln");
            }
        });
        ron = (Button) findViewById(R.id.ron);
        ron.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                calcularCambio("ron");
            }
        });
    }

    public void lanzarN(int n) {
        String numero=visor.getText().toString();
        if (numero.equals("0"))
            numero="";
        visor.setText(numero + String.valueOf(n));
    }

    public void calcularCambio(String moneda){
        operando = visor.getText().toString();
        switch (moneda) {
            case "usd":
                total = Integer.parseInt(operando) * USD;
                break;
            case "jpy":
                total = Integer.parseInt(operando) * JPY;
                break;
            case "bgn":
                total = Integer.parseInt(operando) * BGN;
                break;
            case "czk":
                total = Integer.parseInt(operando) * CZK;
                break;
            case "dkk":
                total = Integer.parseInt(operando) * DKK;
                break;
            case "gbp":
                total = Integer.parseInt(operando) * GBP;
                break;
            case "huf":
                total = Integer.parseInt(operando) * HUF;
                break;
            case "pln":
                total = Integer.parseInt(operando) * PLN;
                break;
            case "ron":
                total = Integer.parseInt(operando) * RON;
        }
        visor.setText(Double.toString(total));
    }

}
