/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consulta;
import Modelo.Usuario;
import Vista.crearCuenta;
import Vista.index;
import Vista.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//Recibimos las acciones de los btn
public class ContIndex implements ActionListener{
    
    private Usuario u;
    private Consulta con;
    private index in;
    private login l;
    private crearCuenta cc;

    public ContIndex(Usuario u, Consulta con, index in) {
        this.u = u;
        this.con = con;
        this.in = in;
        this.l = l;
        this.cc = cc;
        
        this.in.btnIniciarSesion.addActionListener((ActionListener) this);
        this.in.btnCrearCuenta.addActionListener((ActionListener) this);
    }

    //Método visual
    public void iniciar() {
        in.setTitle("Index");
        in.setLocationRelativeTo(null);
    }

    // Funcion de botones de la interfaz
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == in.btnCrearCuenta){
            cc.setVisible(true);
            in.dispose();
        }
        if(e.getSource()==in.btnIniciarSesion){
            l.setVisible(true);
            in.dispose();
        }
    }

    
    
    
    
    
}
