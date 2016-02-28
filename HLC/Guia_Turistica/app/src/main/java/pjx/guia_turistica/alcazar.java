package pjx.guia_turistica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by PJX on 28/02/2016.
 */
public class alcazar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alcazar);
    }

    public void cerrar(View view) {
        finish();
    }
}
