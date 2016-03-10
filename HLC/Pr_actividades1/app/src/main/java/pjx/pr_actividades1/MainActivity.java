package pjx.pr_actividades1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "";
    private EditText editText;
    private String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        editText = (EditText) findViewById(R.id.editText);
        mensaje = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,mensaje);
        startActivity(intent);
    }
}
