package com.vivelibre.pruebatoken.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Component
public class PruebaTokenUtils {
    
    public String formatDate(String format, LocalDate dateToFormat){
        return dateToFormat.format(DateTimeFormatter.ofPattern(format));
    }
    
}
