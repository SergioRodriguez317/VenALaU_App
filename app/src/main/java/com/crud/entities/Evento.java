package com.crud.entities;
import java.io.Serializable;

/**
 * Created by gfghfh on 21/04/2018.
 */

public class Evento implements Serializable {

    private int IdEvento;
    private String Nombre;
    private String TipoEvento;
    private String Fecha;
    private String Lugar;
    private String Detalle;

    public int getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(int idEvento) {
        IdEvento = idEvento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        TipoEvento = tipoEvento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }
}
