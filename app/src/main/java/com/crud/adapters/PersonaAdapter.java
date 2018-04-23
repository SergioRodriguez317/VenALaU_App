package com.crud.adapters;
import android.content.Context;

import com.crud.entities.Evento;
import com.crud.entities.Persona;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.sergiorodriguez.venalau_app.R;
import java.util.List;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class PersonaAdapter extends ArrayAdapter<Persona>{
    private List<Persona> datos;
    private Context context;

    public PersonaAdapter(List<Persona> datos, Context context) {
        super(context, R.layout.activity_registro, datos);
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.activity_registro, parent, false);

        return  view;
    }
}
