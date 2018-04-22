package com.crud.modelo;

import com.crud.entities.Evento;
import com.crud.entities.Implemento;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by gfghfh on 22/04/2018.
 */

public class ModeloImplemento {

    private String BASE_URL = "http://venalau.azurewebsites.net/api/implementos/";
    private RestTemplate restTemplate = new RestTemplate();

    public List<Implemento> findAll(){
        try
        {
            return restTemplate.exchange(
                    BASE_URL + "findall", HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Implemento>>() {
                    }
            ).getBody();

        }
        catch(Exception e){
            return null;
        }

    }
}
