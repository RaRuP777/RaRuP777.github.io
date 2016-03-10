package pjx.spinner2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblEtiqueta;
    private ListView lstOpciones;

    private Titular[] datos =
            new Titular[]{
                    new Titular("DWESE", "Jose Aguilera"),
                    new Titular("DWECL", "Lourdes Magarin"),
                    new Titular("DIWEB", "Jaime Rabasco"),
                    new Titular("DAWEB", "Jose Ramon"),
                    new Titular("HLC", "Jose Aguilera")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblEtiqueta = (TextView)findViewById(R.id.LblEtiqueta);
        lstOpciones = (ListView)findViewById(R.id.LstOpciones);

         //Adaptador
        AdaptadorTitulares adaptador =
                new AdaptadorTitulares(this, datos);

        lstOpciones.setAdapter(adaptador);

        //Eventos
        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                String opcionSeleccionada =
                        ((Titular)a.getItemAtPosition(position)).getTitulo();

                lblEtiqueta.setText("Opción seleccionada: " + opcionSeleccionada);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class AdaptadorTitulares extends ArrayAdapter<Titular> {

        AdaptadorTitulares(Context context, Titular[] datos) {
            super(context, R.layout.listitem_titular, datos);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            View item = convertView;
            ViewHolder holder;

            if(item == null)
            {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                item = inflater.inflate(R.layout.listitem_titular, null);

                holder = new ViewHolder();
                holder.titulo = (TextView)item.findViewById(R.id.LblTitulo);
                holder.subtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);

                item.setTag(holder);
            }
            else
            {
                holder = (ViewHolder)item.getTag();
            }

            holder.titulo.setText(datos[position].getTitulo());
            holder.subtitulo.setText(datos[position].getSubtitulo());

            return(item);
        }
    }

    static class ViewHolder {
        TextView titulo;
        TextView subtitulo;
    }
}
