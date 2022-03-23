/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21hugo4295e6;

import java.util.ArrayList;

/**
 *
 * @author hugo4295
 */
public class G4s21hugo4295e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Fernando");
        lista.add("Monica");
        lista.add("Aranceli");
        lista.add("Federico");
        lista.add("Armando");
        
        for (int i=0; i<lista.size();i++){
            System.out.println("valor en posicion ["+i+"] = " + lista.get(i));
        }
        int a=0;
        for (String cadena : lista){
            System.out.println("valor de la lista en posicion ["+ a + "] = "+ cadena);
            a++;
        }
        
        a=0;
        lista.forEach(cadena ->{
            System.out.println("valor de la lista " + cadena);
        });
        
        lista.stream().forEach(cadena ->{
            System.out.println("valor de la lista por medio de stream " + cadena);
        });
        
    }
    
}
