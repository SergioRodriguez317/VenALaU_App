package com.crud.entities;
import java.io.Serializable;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class Reserva implements  Serializable{

    int IdReserva;
    int HoraReserva;
    int FechaReserva;
    Espacio IdEspacio;
    Persona IdPersona;

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int idReserva) {
        IdReserva = idReserva;
    }

    public int getHoraReserva() {
        return HoraReserva;
    }

    public void setHoraReserva(int horaReserva) {
        HoraReserva = horaReserva;
    }

    public int getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(int fechaReserva) {
        FechaReserva = fechaReserva;
    }

    public Espacio getIdEspacio() {
        return IdEspacio;
    }

    public void setIdEspacio(Espacio idEspacio) {
        IdEspacio = idEspacio;
    }

    public Persona getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Persona idPersona) {
        IdPersona = idPersona;
    }
}
