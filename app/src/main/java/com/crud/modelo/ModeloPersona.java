package com.crud.modelo;

import com.crud.entities.Evento;
import com.crud.entities.Persona;

import org.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class ModeloPersona {

    private String BASE_URL = "http://venalau.azurewebsites.net/api/persona/";
    private RestTemplate restTemplate = new RestTemplate();

    public boolean create(Persona datos){
        try{
            Map<String,String> values = new HashMap<String,String>();
            values.put("IdPersona", String.valueOf(datos.getIdPersona()));
            values.put("TipoVinculo", datos.getTipoVinculo());
            values.put("Nombre", datos.getNombre());
            values.put("Apellido", datos.getApellido());
            values.put("Correo", datos.getCorreo());
            values.put("Contraseña", datos.getContraseña());
            values.put("CantidadMultas", String.valueOf(datos.getCantidadMultas()));
            //values.put("edad", String.valueOf(datos.getEdad()));
            JSONObject jsonObject = new JSONObject(values);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<String>(jsonObject.toString(), headers);
            restTemplate.postForEntity(BASE_URL + "create", entity, null);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
