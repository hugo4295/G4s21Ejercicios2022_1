/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21hugo4295e11;

import com.google.gson.Gson;

/**
 *
 * @author hugo4295
 */
public class G4s21hugo4295e11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos datos = new Datos("Victor",42,"personal@personal.com");
        Gson gson = new Gson();
        String cadena = gson.toJson(datos);
        System.out.println("Nombre " + datos.getNombre());
        System.out.println("Edad " + String.valueOf(datos.getEdad()));
        System.out.println("Correo " + datos.getCorreo());
        
        System.out.println("La cadena contiene -> " + cadena);
        
        String cjson ="{\"nombre\":\"Javier\",\"edad\":22,\"correo\":\"sin correo\"}";
        
        Datos datos2 = gson.fromJson(cjson, Datos.class);
        
        System.out.println("Nombre " + datos2.getNombre());
        System.out.println("Edad " + String.valueOf(datos2.getEdad()));
        System.out.println("Correo " + datos2.getCorreo());
        
    }
    
}
