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
import com.crud.entities.Implemento;
import com.example.sergiorodriguez.venalau_app.R;

import java.util.List;
/**
 * Created by gfghfh on 22/04/2018.
 */

public class ImplementoAdapter extends ArrayAdapter<Implemento> {

    private List<Implemento> datos;
    private Context context;

    public ImplementoAdapter(List<Implemento> datos, Context context) {
        super(context, R.layout.activity_implementos, datos);
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.activity_detalle_evento, parent, false);

        Implemento evento = this.datos.get(position);
        TextView textViewImplemento = view.findViewById(R.id.txtIdImplemento);
        textViewImplemento.setText(evento.getIdImplemento());
        textViewImplemento.setTextColor(Color.RED);

        TextView textViewApellido = view.findViewById(R.id.txtDeporte);
        textViewApellido.setText(evento.getDeporte());
        textViewApellido.setTextColor(Color.RED);

        return  view;
    }

}
