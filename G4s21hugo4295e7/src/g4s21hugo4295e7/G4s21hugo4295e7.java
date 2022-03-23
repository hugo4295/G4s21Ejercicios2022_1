/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21hugo4295e7;

import Informacion.Datos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hugo4295
 */
public class G4s21hugo4295e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Datos> listadatos = new ArrayList<Datos>();
        Datos objdatos = new Datos("Fernado Gomez",23,"fer@gmail.com");
        listadatos.add(objdatos);
        objdatos = new Datos();
        objdatos.setNombre("Armando Sanchez");
        objdatos.setEdad(34);
        objdatos.setCorreo("armando@gmail.com");
        listadatos.add(objdatos);
        objdatos = new Datos("Wendy Sanchez",22,"wendy@gmail.com");
        listadatos.add(objdatos);
        
        for(Datos datos : listadatos){
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        }
        
        System.out.println("----------------------------------------");
        System.out.println("usando foreach");
        System.out.println("----------------------------------------");
                
        listadatos.forEach(datos->{
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        });
        
        System.out.println("----------------------------------------");
        System.out.println("usando stream foreach");
        System.out.println("----------------------------------------");
        
        listadatos.stream().forEach(datos->{
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        
        });
        

    }
    
}
