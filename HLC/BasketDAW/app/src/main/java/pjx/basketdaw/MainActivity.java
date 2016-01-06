package pjx.basketdaw;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int total1, total2;
    private Button b11, b21, b31, b12, b22, b32, button, reset, salir;
    private TextView r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b11 = (Button) findViewById(R.id.b11);
        b21 = (Button) findViewById(R.id.b21);
        b31 = (Button) findViewById(R.id.b31);
        b12 = (Button) findViewById(R.id.b12);
        b22 = (Button) findViewById(R.id.b22);
        b32 = (Button) findViewById(R.id.b32);
        r1 = (TextView) findViewById(R.id.r1);
        r2 = (TextView) findViewById(R.id.r2);
        b11.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total1 = total1 + 1;
                r1.setText(Integer.toString(total1));
            }
        });
        b21.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total1 = total1 + 2;
                r1.setText(Integer.toString(total1));
            }
        });
        b31.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total1 = total1 + 3;
                r1.setText(Integer.toString(total1));
            }
        });
        b12.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total2 = total2 + 1;
                r2.setText(Integer.toString(total2));
            }
        });
        b22.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total2 = total2 + 2;
                r2.setText(Integer.toString(total2));
            }
        });
        b32.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total2 = total2 + 3;
                r2.setText(Integer.toString(total2));
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Pedro J. Ramos. 2ºDAW. 2015-2016";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total1 = 0;
                total2 = 0;
                r1.setText(Integer.toString(total1));
                r2.setText(Integer.toString(total2));
            }
        });
        salir = (Button) findViewById(R.id.salir);
        salir.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
