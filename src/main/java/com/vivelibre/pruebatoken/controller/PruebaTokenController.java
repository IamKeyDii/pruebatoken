package com.vivelibre.pruebatoken.controller;

import com.vivelibre.pruebatoken.model.PruebaTokenResponse;
import com.vivelibre.pruebatoken.service.PruebaTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaTokenController {
    
    @Autowired
    private PruebaTokenService pruebaTokenService;
    @GetMapping("/get-token")
    public PruebaTokenResponse obtenerToken(){
        return pruebaTokenService.obtenerToken();
    }
}
