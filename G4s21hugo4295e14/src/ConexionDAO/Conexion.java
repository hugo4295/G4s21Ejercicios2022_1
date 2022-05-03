/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.Datos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hugo4295
 */
public class Conexion {
    
    Connection conexion;
    List<Datos> listaDatos = new ArrayList<Datos>();
    
    public void Abrir(){
        String user="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/G4s21?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insertar(Datos datos){
        boolean estado = true;
        
        try{
            Abrir();
            PreparedStatement ps = conexion.prepareStatement("insert into Datos(nombre,edad,correo) values (?,?,?)");
            ps.setString(1, datos.getNombre());
            ps.setInt(2, datos.getEdad());
            ps.setString(3, datos.getCorreo());
            ps.execute();            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }        
        return estado;        
    }
    
    public boolean actualizar(Datos datos){
        boolean estado = true;
        try{
            Abrir();
            PreparedStatement ps = conexion.prepareCall("update Datos set nombre = ?, edad = ?, correo = ? where id = ?");
            ps.setString(1, datos.getNombre());
            ps.setInt(2, datos.getEdad());
            ps.setString(3, datos.getCorreo());
            ps.setInt(4, datos.getId());
            ps.executeUpdate();            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
    
    public boolean consultartodos(){
        boolean estado = true;
        try{
            
            Abrir();
            PreparedStatement ps = conexion.prepareStatement("select * from Datos");
            ResultSet rs = ps.executeQuery();
            Datos datos;
            
            while(rs.next()){
                datos = new Datos(rs.getString("nombre"),rs.getInt("edad"),rs.getString("correo"),rs.getInt("id"));
                //datos.setNombre(rs.getString("nombre"));
                listaDatos.add(datos);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
    
    public List<Datos> getListaDatos(){
        return listaDatos;
    }
    
    public boolean borrar(int id){
        boolean estado = true;
        try{
            Abrir();
            PreparedStatement ps = conexion.prepareStatement("delete from Datos where id = ?");
            ps.setInt(1, id);
            ps.execute();            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
}
