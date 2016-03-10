package pjx.gridlayouts;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton b1,b2,b3;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (ImageButton) findViewById(R.id.imageButton1);
        b1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                reproducirSonido(1);
            }
        });

        b2 = (ImageButton) findViewById(R.id.imageButton2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                reproducirSonido(2);
            }
        });

        b3 = (ImageButton) findViewById(R.id.imageButton3);
        b3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                reproducirSonido(3);
            }
        });
    }

    private void reproducirSonido(int valor){
        switch (valor){
            case 1:
                mp = MediaPlayer.create(getBaseContext(), R.raw.vaca);
                break;
            case 2:
                mp = MediaPlayer.create(getBaseContext(), R.raw.pato);
                break;
            case 3:
                mp = MediaPlayer.create(getBaseContext(), R.raw.oveja);
        }
        mp.seekTo(0);
        mp.start();
    }
}
