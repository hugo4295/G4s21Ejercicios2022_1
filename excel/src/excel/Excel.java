/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excel;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author hugo4295
 */
public class Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Workbook wb = new HSSFWorkbook();
        try ( OutputStream fileOut = new FileOutputStream("miarchivo.xls")) {
            Sheet sheet1 = wb.createSheet("Primer Hoja");
            Sheet sheet2 = wb.createSheet("Segunda Hoja");
            Sheet sheet = wb.createSheet("Tercer Hoja");
            Row row = sheet.createRow(0); //crear fila. se establece el indice a 0 hasta N                           
            row.createCell(0).setCellValue("Num"); // Columna A  
            row.createCell(1).setCellValue("Nombre"); // Columna B   
            row.createCell(2).setCellValue("Edad");// Columna C  
            row.createCell(3).setCellValue("Correo"); // Columna D 

            row = sheet.createRow(1); //crear fila 2
            row.createCell(0).setCellValue(1); // Columna A  
            row.createCell(1).setCellValue("Fernando Gomez"); // Columna B   
            row.createCell(2).setCellValue(35);// Columna C  
            row.createCell(3).setCellValue("fer@gmail.com"); // Columna D 
            
            row = sheet.createRow(2); //crear fila 3
            row.createCell(0).setCellValue(2); // Columna A  
            row.createCell(1).setCellValue("Alma Sanchez"); // Columna B   
            row.createCell(2).setCellValue(22);// Columna C  
            row.createCell(3).setCellValue("alma15@gmail.com"); // Columna D
            
            row = sheet.createRow(3); //crear fila 2
            row.createCell(0).setCellValue(3); // Columna A  
            row.createCell(1).setCellValue("Javier Luna"); // Columna B   
            row.createCell(2).setCellValue(25);// Columna C  
            row.createCell(3).setCellValue("javier120@gmail.com"); // Columna D
            
            
            wb.write(fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
