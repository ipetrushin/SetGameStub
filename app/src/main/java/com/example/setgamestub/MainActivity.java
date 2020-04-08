package com.example.setgamestub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Request req = Request.RegisterRequest("Petya");
        SetServerTask task = new SetServerTask();
        task.execute(req);
    }

    class SetServerTask extends AsyncTask<Request, Void, Response> {
        public Response requestToSetServer(Request req) {
            Gson gson = new Gson();
            // TODO: указывайте нужный порт
            String API_URL = "http://194.176.114.21:8050";
            try {
                URL url = new URL(API_URL);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setDoOutput(true); // setting POST method
                OutputStream out = urlConnection.getOutputStream();
                // сериализованный объект-запрос пишем в поток
                out.write(gson.toJson(req).getBytes());
                InputStream stream = urlConnection.getInputStream();
                Response response = gson.fromJson(new InputStreamReader(stream), Response.class);
                return response;

            } catch (IOException e) { return null; }

        }

        @Override
        protected Response doInBackground(Request... requests) {
            Request r = requests[0];
            return requestToSetServer(r);
        }

        @Override
        protected void onPostExecute(Response response) {
            Log.d("mytag", "token: " + response.token);
        }
    }
}
