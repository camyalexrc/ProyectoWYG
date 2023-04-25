/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consulta;
import Modelo.Usuario;
import Vista.crearCuenta;



public class contCrearCuenta {
    
private Usuario u;
private Consulta con;

public contCrearCuenta (Usuario u, Consulta con, crearCuenta cc){
    this.u = u;
    this.con = con;
}


public boolean crearUsuario(Usuario u){
    return con.crearUsuario(u);
}


      
}
