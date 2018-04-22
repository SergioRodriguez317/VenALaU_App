package com.crud.modelo;

import com.crud.entities.Evento;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * Created by gfghfh on 21/04/2018.
 */

public class ModeloEventos {

    private String BASE_URL = "http://venalau.azurewebsites.net/api/eventos/";
    private RestTemplate restTemplate = new RestTemplate();

    public List<Evento> findAll(){
        try
        {
            return restTemplate.exchange(
                    BASE_URL + "findall", HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Evento>>() {
                    }
            ).getBody();

        }
        catch(Exception e){
            return null;
        }

    }
}
