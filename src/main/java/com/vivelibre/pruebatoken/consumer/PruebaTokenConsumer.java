package com.vivelibre.pruebatoken.consumer;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PruebaTokenConsumer {

    private final RestTemplate restTemplate;
    
    public PruebaTokenConsumer(){
        this.restTemplate = new RestTemplate();
    }
    
    public String llamadaToken() {
        String url = "http://localhost:8080/token";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        //llevar a propiedades o similar
        String requestJson = "{ \"username\":\"auth-vivelibre\", \"password\":\"password\"}";
        HttpEntity<String> requestEntity = new HttpEntity<>(requestJson, headers);

        try {
            ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            return responseEntity.getBody();
        } catch (Exception e) { //Mejorar gestion de errores
            System.err.println("Ha habido un error: " + e.getMessage());
            return "TOKEN_ALTERNATIVO";
        } 
    }




}
