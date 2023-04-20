
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conexion;
    
    //credenciales
    String correo="root";
    String contrasena="";
    String bd="proyectowyg";
    String ip="localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    //metodo de validación de conexión
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(cadena, correo, contrasena);
            //JOptionPane.showMessageDialog(null,"Conexión exitosa!");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Problemas de conexion"+ e.toString());
        }
        return conexion;
    }
}
