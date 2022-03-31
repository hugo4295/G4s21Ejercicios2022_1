/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Informacion.Datos;
import com.google.gson.Gson;

/**
 *
 * @author hugo4295
 */
public class Conversiones {
    
    public String cjson(Datos datos){
        Gson gson = new Gson();
        return gson.toJson(datos);
    }
    
    public Datos cDTA(String cadena){
        Gson gson = new Gson();
        return gson.fromJson(cadena, Datos.class);
    }    
}
