/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hugo4295
 */
public class Almacen {
        public void grabar(Datos datos){
        try{
            FileWriter  archivo = new FileWriter("datos.txt",true);
            BufferedWriter almacena = new BufferedWriter(archivo);
            almacena.write(datos.getNombre() +"\n");
            almacena.write(String.valueOf(datos.getEdad()) +"\n");
            almacena.write(datos.getCorreo() +"\n");
            almacena.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List<Datos> leer(){
        List<Datos> informacion = new ArrayList<Datos>();
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String nombre;
            while ((nombre = datos.readLine()) != null){
                int edad = Integer.valueOf(datos.readLine());
                String correo = datos.readLine();
                Datos usuario = new Datos(nombre,edad,correo);
                informacion.add(usuario);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return informacion;
    }
    
}
