package com.example.sergiorodriguez.venalau_app;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.crud.adapters.EventoAdapter;
import com.crud.modelo.ModeloEventos;

import com.crud.entities.Evento;

import java.util.List;

public class EventosActivity extends AppCompatActivity {


    private ListView ListViewDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eventos);
            List<Evento> datos = new HttpRequestDataList().execute().get();
            ListViewDatos = findViewById(R.id.lvEventos);
            ListViewDatos.setAdapter(new EventoAdapter(datos, getApplicationContext()));





        }
        catch (Exception e)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage(e.getMessage());
            builder.create().show();
        }
    }

    private class HttpRequestDataList extends AsyncTask<Void, Void, List<Evento>>{

        @Override
        protected List<Evento> doInBackground(Void... voids) {
            ModeloEventos datosModel = new ModeloEventos();
            return datosModel.findAll();
        }


        @Override
        protected void onPostExecute(List<Evento> datos) {
            super.onPostExecute(datos);
        }
    }

   /* public void OnClickBotonAdd(View v) {
        Intent intencion = new Intent(getApplicationContext(), ImplementosActivity.class);

        startActivity(intencion);
    }*/


    /*private ListView lvEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eventos);
            List<Evento> eventos = new HttpRequestDataList().execute().get();
            lvEventos = findViewById(R.id.lvEventos);
            lvEventos.setAdapter(new EventoAdapter(eventos, getApplicationContext()));




        }
        catch (Exception e)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage(e.getMessage());
            builder.create().show();
        }
    }
    private class HttpRequestDataList extends AsyncTask<Void, Void, List<Evento>> {

        @Override
        protected List<Evento> doInBackground(Void... voids) {
            ModeloEventos datosModel = new ModeloEventos();
            return datosModel.findAll();
        }
        @Override
        protected void onPostExecute(List<Evento> eventos) {
            super.onPostExecute(eventos);
        }
    }
    }*/






}
