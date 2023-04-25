/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Consulta {
    
    //Método de registro de usuario
    public boolean crearUsuario (Usuario u){
        System.out.println(u);
        PreparedStatement ps = null;
        Modelo.Conexion  con= new Modelo.Conexion();
        String sql = "insert * into persona (rut, nombre, edad, estatura, peso, telefono, correo, contrasena) values (?,?,?,?,?,?,?,?)";
        
        /*try {
            ps = con.establecerConexion().prepareStatement(sql);
            ps.setInt(1,u.getRut());
            ps.setString(2, u.getNombre());
            ps.setInt(3,u.getEdad());
            ps.setInt(4,u.getEstatura());
            ps.setInt(5,u.getPeso());
            ps.setInt(6,u.getTelefono());
            ps.setString(7, u.getCorreo());
            ps.setString(8, u.getContrasena());
            return true;
        }catch (SQLException e){
            System.out.println(e);
            return false;
            
        }*/
        return (true);
        
    }
    //Metodo modificar datos de usuario
    public boolean modificarUsuario (Usuario u){
        
        PreparedStatement ps = null;
        Modelo.Conexion  con= new Modelo.Conexion();
        String sql = "update persona set codigo rut=?, nombre=?, edad=?, estatura=?, peso=?, telefono=?, correo=?, contrasena=?, where rut=?";
        
        try {
            ps = con.establecerConexion().prepareStatement(sql);
            ps.setInt(1,u.getRut());
            ps.setString(2, u.getNombre());
            ps.setInt(3,u.getEdad());
            ps.setInt(4,u.getEstatura());
            ps.setInt(5,u.getPeso());
            ps.setInt(6,u.getTelefono());
            ps.setString(7, u.getCorreo());
            ps.setString(8, u.getContrasena());
            return true;
        }catch (SQLException e){
            System.out.println(e);
            return false;
            
        }
    }
    //Metodo eliminar cuenta de usuario
     public boolean eliminarUsuario (Usuario u){
        
        PreparedStatement ps = null;
        Modelo.Conexion  con= new Modelo.Conexion();
        String sql = "delete from persona where rut=?";
        
        try {
            ps = con.establecerConexion().prepareStatement(sql);
            ps.setInt(1,u.getRut());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.out.println(e);
            return false;
            
        }
    }
     
     //Metodo buscar usuario
      public boolean buscarUsuario (Usuario u){
        
        PreparedStatement ps = null;
        Modelo.Conexion  con= new Modelo.Conexion();
        //dentro de rs asigno el usuario que se visualiza en pantalla
        ResultSet rs = null;
        String sql = "select * from persona where rut=?";
        
        try {
            ps = con.establecerConexion().prepareStatement(sql);
            ps.setInt(1,u.getRut());
            ps.setString(2, u.getNombre());
            ps.setInt(3,u.getEdad());
            ps.setInt(4,u.getEstatura());
            ps.setInt(5,u.getPeso());
            ps.setInt(6,u.getTelefono());
            ps.setString(7, u.getCorreo());
            ps.setString(8, u.getContrasena());
            rs = ps.executeQuery();
            if(rs.next()){
                u.setRut(Integer.parseInt(rs.getString("rut")));
                u.setNombre(rs.getString("nombre"));
                u.setEdad(rs.getInt("edad"));
                u.setEstatura(rs.getInt("estatura"));
                u.setPeso(rs.getInt("peso"));
                u.setTelefono(rs.getInt("telefono"));
                u.setCorreo(rs.getString("correo"));
                u.setContrasena(rs.getString("contrasena"));
                return true;
            }
            return false;
        }catch (SQLException e){
            System.out.println(e);
            return false;
            
        }
    }
    
}
