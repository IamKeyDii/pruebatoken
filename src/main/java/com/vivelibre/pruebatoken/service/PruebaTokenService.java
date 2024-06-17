package com.vivelibre.pruebatoken.service;

import com.vivelibre.pruebatoken.constant.PruebaTokenConstant;
import com.vivelibre.pruebatoken.consumer.PruebaTokenConsumer;
import com.vivelibre.pruebatoken.model.PruebaTokenResponse;
import com.vivelibre.pruebatoken.util.PruebaTokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PruebaTokenService {
    
    public PruebaTokenUtils pruebaTokenUtils = new PruebaTokenUtils();
    
    public PruebaTokenConstant pruebaTokenConstant = new PruebaTokenConstant();
    
    @Autowired
    public PruebaTokenConsumer pruebaTokenConsumer = new PruebaTokenConsumer();
    
    public PruebaTokenResponse obtenerToken(){

        PruebaTokenResponse pruebaTokenResponse = new PruebaTokenResponse();
        pruebaTokenResponse.setDate(pruebaTokenUtils.formatDate(
                pruebaTokenConstant.getFORMATO_MMMM_d_YYYY(),
                LocalDate.now()));
        
        //Llamada a obtener el token por servicio externo
        pruebaTokenResponse.setAuthViveLibreToken(pruebaTokenConsumer.llamadaToken());
        
        return pruebaTokenResponse;
    }
}
