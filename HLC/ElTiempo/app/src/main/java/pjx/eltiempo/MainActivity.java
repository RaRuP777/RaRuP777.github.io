package pjx.eltiempo;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ParseData parseDom;
    Button boton;
    TextView localizacion, humedad, temperatura;
    EditText ciudadBuscada;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        boton = (Button)findViewById(R.id.idBoton);
        localizacion = (TextView)findViewById(R.id.idInfoLocalizacion);
        humedad = (TextView)findViewById(R.id.idInfoHumedad);
        temperatura = (TextView)findViewById(R.id.idInfoTemperatura);
        ciudadBuscada = (EditText)findViewById(R.id.idCiudad);
        imagen = (ImageView)findViewById(R.id.idImagen);

        parseDom = new ParseData("http://api.openweathermap.org/data/2.5/weather?q=Cordoba,es&mode=xml&appid=44db6a862fba0b067b1930da0d769e98");
        Ciudad ciudad = parseDom.parse();
        pintarInfo(ciudad);
        boton.setOnClickListener(this);
    }

    public void pintarInfo(Ciudad ciudad){
        localizacion.setText(ciudad.getCiudad());
        humedad.setText(ciudad.getHumedad());
        temperatura.setText(ciudad.getTemperatura());
        ciudadBuscada.setText(ciudad.getCiudad());

        switch (ciudad.getClima()){
            case "01d":
            case "01n":
                imagen.setImageResource(R.drawable.clear_sky);
                break;
            case "02d":
            case "02n":
                imagen.setImageResource(R.drawable.few_clouds);
                break;
            case "03d":
            case "03n":
                imagen.setImageResource(R.drawable.scattered_clouds);
                break;
            case "04d":
            case "04n":
                imagen.setImageResource(R.drawable.broken_clouds);
                break;
            case "09d":
            case "09n":
                imagen.setImageResource(R.drawable.shower_rain);
                break;
            case "10d":
            case "10n":
                imagen.setImageResource(R.drawable.rain);
                break;
            case "11d":
            case "11n":
                imagen.setImageResource(R.drawable.thunderstorm);
                break;
            case "50d":
            case "50n":
                imagen.setImageResource(R.drawable.mist);
                break;
            case "13d":
            case "13n":
                imagen.setImageResource(R.drawable.snow);
                break;
            default:
                imagen.setImageResource(R.drawable.few_clouds);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        if(ciudadBuscada.getText().toString().trim().length() <= 0){
            Toast toastCampoVacio = Toast.makeText(getApplicationContext(), "Debe seleccionar una ciudad", Toast.LENGTH_SHORT);
            toastCampoVacio.show();
        }
        else{
            parseDom = new ParseData("http://api.openweathermap.org/data/2.5/weather?q="+ciudadBuscada.getText().toString()+"&mode=xml&appid=44db6a862fba0b067b1930da0d769e98");
            Ciudad ciudad = parseDom.parse();
            if(ciudad == null){
                Toast toastCiudadErronea = Toast.makeText(getApplicationContext(), "La ciudad seleccionada no existe", Toast.LENGTH_SHORT);
                toastCiudadErronea.show();
                ciudadBuscada.setText("");
            }
            else {
                pintarInfo(ciudad);
            }
        }
    }
}
