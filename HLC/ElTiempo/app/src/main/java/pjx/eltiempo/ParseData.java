package pjx.eltiempo;

/**
 * Created by PJX on 13/03/2016.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by rafael on 01/03/2016.
 */
public class ParseData {
    private URL rssUrl;
    private Ciudad ciudad;

    public ParseData(String url)
    {
        try
        {
            this.rssUrl = new URL(url);
        }
        catch (MalformedURLException e)
        {
            ciudad = null;
        }
    }

    public Ciudad parse()
    {
        //Instanciamos la fábrica para DOM
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        ciudad = new Ciudad();

        try
        {
            //Creamos un nuevo parser DOM
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Realizamos lalectura completa del XML
            Document dom = builder.parse(this.getInputStream());

            //Localizamos todos los elementos <item>
            NodeList items = dom.getElementsByTagName("current");

            //Obtenemos todos los datos de la ciudad seleccionada
            Node item = items.item(0);

            ciudad.setCiudad(item.getChildNodes().item(0).getAttributes().item(1).getNodeValue());

            int celsius = Integer.parseInt(item.getChildNodes().item(1).getAttributes().item(0).getNodeValue().substring(0,3)) - 274;

            ciudad.setTemperatura(String.valueOf(celsius) + "ºC");

            ciudad.setHumedad(item.getChildNodes().item(2).getAttributes().item(0).getNodeValue() + "%");

            ciudad.setClima(item.getChildNodes().item(8).getAttributes().item(2).getNodeValue());

        }
        catch (Exception ex)
        {
            ciudad = null;
        }

        return ciudad;
    }

    private String obtenerTexto(Node dato)
    {
        StringBuilder texto = new StringBuilder();
        NodeList fragmentos = dato.getChildNodes();

        for (int k=0;k<fragmentos.getLength();k++)
        {
            texto.append(fragmentos.item(k).getNodeValue());
        }

        return texto.toString();
    }

    private InputStream getInputStream()
    {
        try
        {
            return rssUrl.openConnection().getInputStream();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
