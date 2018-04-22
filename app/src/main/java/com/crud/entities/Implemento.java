package com.crud.entities;
import java.io.Serializable;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class Implemento implements Serializable {

    int IdImplemento;
    String Deporte;

    public int getIdImplemento() {
        return IdImplemento;
    }

    public void setIdImplemento(int idImplemento) {
        IdImplemento = idImplemento;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String deporte) {
        Deporte = deporte;
    }
}
