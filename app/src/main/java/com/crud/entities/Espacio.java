package com.crud.entities;
import java.io.Serializable;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class Espacio implements Serializable {
    int IdEspacio;
    String TipoEspacio;
    Boolean Disponible;

    public int getIdEspacio() {
        return IdEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        IdEspacio = idEspacio;
    }

    public String getTipoEspacio() {
        return TipoEspacio;
    }

    public void setTipoEspacio(String tipoEspacio) {
        TipoEspacio = tipoEspacio;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean disponible) {
        Disponible = disponible;
    }
}
