/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21hugo4295e15;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author hugo4295
 */
public class G4s21hugo4295e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PdfWriter pdfwriter = null;
        try {
            // TODO code application logic here
            String nombrearch = "mipdf.pdf";
            File file = new File(nombrearch);
            pdfwriter = new PdfWriter(file);
            
            String cadena = "este es otro parrafo el cual contendra mas informacion de lo debido ya que estamos probando que se pueda escribir dentro del archivo pdf";
            
            PdfDocument pdfDocument = new PdfDocument(pdfwriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph("Sera mi primer linea de mi pdf la cual puede contener texto");
            document.add(paragraph);
            paragraph = new Paragraph(cadena);
            document.add(paragraph);
            PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
            
            cadena = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.";
            paragraph = new Paragraph(cadena);
            paragraph.setFont(font);
            Color myColor = new DeviceRgb(255, 100, 20);
            paragraph.setFontColor(myColor);
            paragraph.setFirstLineIndent(100);
            paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            document.add(paragraph);
            pdfDocument.close();
            pdfwriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
    }
    
}
