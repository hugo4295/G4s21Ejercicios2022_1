/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author hugo4295
 */
public class Almacen {
    
    public void grabar(String cadena){
        try{
            FileWriter  archivo = new FileWriter("datos.txt",true);
            BufferedWriter almacena = new BufferedWriter(archivo);
            almacena.write(cadena+"\n");
            almacena.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String> leer(){
        ArrayList<String> informacion = new ArrayList<String>();
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String lineas;
            while ((lineas = datos.readLine()) != null){
                informacion.add(lineas);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return informacion;
    }
    
}
