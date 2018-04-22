package com.crud.entities;
import java.io.Serializable;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class TipoImplemento implements Serializable {

    int IdTipoImplemento;
    String TipoImplemento;
    int Cantidad;
    Implemento IdImplemento;

    public int getIdTipoImplemento() {
        return IdTipoImplemento;
    }

    public void setIdTipoImplemento(int idTipoImplemento) {
        IdTipoImplemento = idTipoImplemento;
    }

    public String getTipoImplemento() {
        return TipoImplemento;
    }

    public void setTipoImplemento(String tipoImplemento) {
        TipoImplemento = tipoImplemento;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Implemento getIdImplemento() {
        return IdImplemento;
    }

    public void setIdImplemento(Implemento idImplemento) {
        IdImplemento = idImplemento;
    }
}
