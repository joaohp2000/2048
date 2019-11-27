package App_2048.teste;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Http_setas extends AsyncTask< Void, Void, String> {

    public String movimento;

    public Http_setas(String movimento)
    {
        this.movimento=movimento;
        System.out.println(this.movimento);
        }


    @Override
    protected String doInBackground(Void... voids) {


        if (this.movimento != null && this.movimento.length() <= 8) {
            // realizar busca

            try {
                URL url = new URL("http://192.168.43.71:8080/WebServer_2048/webresources/ws_2048/inserir");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoOutput(true);
                connection.setDoInput(true);

                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-type", "application/json");
               // connection.setRequestProperty("Accept", "application/json");

               // connection.setConnectTimeout(5000);
               //connection.connect();


                //send post

                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
                writer.write(movimento);
                writer.flush();
                int statusCode = connection.getResponseCode();
                System.out.println(statusCode);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null;
    }
}

