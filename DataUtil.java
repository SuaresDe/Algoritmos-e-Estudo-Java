/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ugf030
 */
public class DataUtil {
    
    public static String ConverterDateParaDataEHora(Date data){
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        
        return formatador.format(data);   
}
    
public static String ConverterDateParaData(Date data){
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatador.format(data);   
}

 public static String ConverterDateParaHora(Date data){
        
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        
        return formatador.format(data);   
}
    
}
