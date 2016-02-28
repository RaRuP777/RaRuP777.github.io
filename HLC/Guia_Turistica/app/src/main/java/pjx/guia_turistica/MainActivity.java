package pjx.guia_turistica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton b1,b2,b3;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (ImageButton) findViewById(R.id.imageButton1);
        b1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mostrar(1);
            }
        });

        b2 = (ImageButton) findViewById(R.id.imageButton2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mostrar(2);
            }
        });

        b3 = (ImageButton) findViewById(R.id.imageButton3);
        b3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mostrar(3);
            }
        });

    }

    private void mostrar (int i) {
        switch (i) {
            case 1:
                intent = new Intent(MainActivity.this, mezquita.class);
                break;
            case 2:
                intent = new Intent(MainActivity.this, puente.class);
                break;
            case 3:
                intent = new Intent(MainActivity.this, alcazar.class);
        }
        startActivity(intent);
    }
}
