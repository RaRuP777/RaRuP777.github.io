package com.example.pjx.pr2_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.myButton);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView myTextView = (TextView) findViewById(R.id.myTextView);
                myTextView.setText("Botón Pulsado");
            }
        });
    }
}
