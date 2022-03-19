/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21hugo4295e5;

import java.util.ArrayList;

/**
 *
 * @author hugo4295
 */
public class G4s21hugo4295e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo = new int[]{1,4,6,7,8,9};
        int[] arreglo2 = new int[10];
        arreglo2[0]=11;
        arreglo2[1]=111;
        arreglo2[2]=112;
        arreglo2[3]=113;
        arreglo2[4]=114;
        arreglo2[5]=115;
        arreglo2[6]=116;
        arreglo2[7]=117;
        arreglo2[8]=118;
        arreglo2[9]=119;
        
        System.out.println("Valor de la variable en posicion 4 " + arreglo[3]);
        arreglo[3] = 10;
         System.out.println("valores del arreglo 2");
        int i=0;
        for(;;){
            System.out.println("arreglo2[" + i + "] = " + arreglo2[i]);
            i++;
            if (i > arreglo2.length-1) break;
        }
        for (i=0;i<arreglo2.length;i++){
            System.out.println("arreglo2[" + i + "] = " + arreglo2[i]);
        }
       ArrayList<Integer> objlista = new ArrayList<Integer>();
       objlista.add(15);
       objlista.add(10);
       objlista.add(22);
       
       
       
       for(i=0;i<objlista.size();i++){
       
           System.out.println("valores de lista " + String.valueOf(objlista.get(i)));
       }
       
    }
    
}
