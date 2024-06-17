package com.vivelibre.pruebatoken.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PruebaTokenUtils {
    
    public String formatDate(String format, LocalDate dateToFormat){
        return dateToFormat.format(DateTimeFormatter.ofPattern(format));
    }
    
}
