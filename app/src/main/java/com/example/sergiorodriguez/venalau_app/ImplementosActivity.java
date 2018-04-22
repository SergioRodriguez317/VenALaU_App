package com.example.sergiorodriguez.venalau_app;

import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import com.crud.adapters.ImplementoAdapter;
import com.crud.entities.Implemento;
import com.crud.modelo.ModeloImplemento;

import java.util.List;

public class ImplementosActivity extends AppCompatActivity {

    private ListView ListViewDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_implementos);
            List<Implemento> datos = new ImplementosActivity.HttpRequestDataList().execute().get();
            ListViewDatos = findViewById(R.id.lvImplementos);
            ListViewDatos.setAdapter(new ImplementoAdapter(datos, getApplicationContext()));

        }
        catch (Exception e)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage(e.getMessage());
            builder.create().show();
        }
    }

    private class HttpRequestDataList extends AsyncTask<Void, Void, List<Implemento>> {

        @Override
        protected List<Implemento> doInBackground(Void... voids) {
            ModeloImplemento datosModel = new ModeloImplemento();
            return datosModel.findAll();
        }


        @Override
        protected void onPostExecute(List<Implemento> datos) {
            super.onPostExecute(datos);
        }
    }
}
