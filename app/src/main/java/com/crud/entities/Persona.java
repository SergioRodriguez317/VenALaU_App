package com.crud.entities;
import java.io.Serializable;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class Persona implements Serializable{
    int IdPersona;
    String TipoVinculo;
    String Nombre;
    String Apellido;
    String Correo;
    String Contraseña;
    int CantidadMultas;

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int idPersona) {
        IdPersona = idPersona;
    }

    public String getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        TipoVinculo = tipoVinculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public int getCantidadMultas() {
        return CantidadMultas;
    }

    public void setCantidadMultas(int cantidadMultas) {
        CantidadMultas = cantidadMultas;
    }
}
