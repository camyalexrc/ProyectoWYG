/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.indexSesion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    
    public void validarUsuario(JTextField correo, JPasswordField contrasena){
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            Modelo.Conexion  objetoConexion= new Modelo.Conexion();
            
            String consulta = "select * from persona where persona.correo = (?) and persona.contrasena = (?);";
            ps = objetoConexion.establecerConexion().prepareStatement(consulta);
            //transformo contraseña a cadena de texto
            String pass = String.valueOf(contrasena.getPassword());
            
            ps.setString(1,correo.getText());
            ps.setString(2, pass);
            //ejecutamos la consulta
            rs = ps.executeQuery();
            
            //validamos
            if(rs.next()){
                indexSesion objetoSesion = new indexSesion();
                objetoSesion.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null,"Correo o contraseña incorrecta, intentelo nuevamente");
                
            }
            
        }catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
    }
}
