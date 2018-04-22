package com.crud.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.crud.entities.Evento;
import com.example.sergiorodriguez.venalau_app.R;

import java.util.List;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class EventoAdapter extends ArrayAdapter<Evento>{

    private List<Evento> datos;
    private Context context;

    public EventoAdapter(List<Evento> datos, Context context) {
        super(context, R.layout.activity_detalle_evento, datos);
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.activity_detalle_evento, parent, false);

        Evento evento = this.datos.get(position);
        TextView textViewNombre = view.findViewById(R.id.txtEvento);
        textViewNombre.setText(evento.getNombre());
        textViewNombre.setTextColor(Color.RED);

        TextView textViewApellido = view.findViewById(R.id.txtFecha);
        textViewApellido.setText(evento.getLugar());
        textViewApellido.setTextColor(Color.RED);

        return  view;
    }

    /*private List<Evento> eventos;
    private Context context;

    public EventoAdapter(List<Evento> eventos, Context context) {
        super(context, R.layout.activity_detalle_evento, eventos);
        this.eventos =eventos;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.activity_detalle_evento, parent, false);

        Evento eventos = this.eventos.get(position);
        TextView textViewNombre =view.findViewById(R.id.txtEvento);
        textViewNombre.setText(eventos.getNombre());
        textViewNombre.setTextColor(Color.BLACK);

        TextView textViewFecha = view.findViewById(R.id.txtFecha);
        textViewFecha.setText(eventos.getApellido());
        textViewFecha.setTextColor(Color.BLACK);

        return  view;
    }*/
}

