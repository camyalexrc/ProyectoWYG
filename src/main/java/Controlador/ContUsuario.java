/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consulta;
import Modelo.Login;
import Modelo.Usuario;
import Vista.crearCuenta;
import Vista.index;
import Vista.indexSesion;
import Vista.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//Recibimos las acciones de loss btn
public class ContUsuario implements ActionListener{
    
    private Usuario u;
    private Consulta con;
    private Login log;
    private crearCuenta cc;
    private index in;
    private indexSesion is;
    private login l;

    public ContUsuario(Usuario u, Consulta con, Login log, crearCuenta cc, index in, indexSesion is, login l) {
        this.u = u;
        this.con = con;
        this.log = log;
        this.cc = cc;
        this.in = in;
        this.is = is;
        this.l = l;
        this.in.btnIniciarSesion.addActionListener((ActionListener) this);
        this.in.btnCrearCuenta.addActionListener((ActionListener) this);
        this.l.btnIngresar.addActionListener((ActionListener) this);
        this.cc.btnCrear.addActionListener((ActionListener) this);
        this.is.btnPrincipiante.addActionListener((ActionListener) this);
        this.is.btnIntermedio.addActionListener((ActionListener) this);
        this.is.btnAvanzado.addActionListener((ActionListener) this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Usuario creado con exito!");
        if (e.getSource() == cc.btnCrear){
            u.setRut(Integer.parseInt(cc.txtRut.getText()));
            u.setNombre(cc.txtNombre.getText());
            u.setEdad(Integer.parseInt(cc.txtEdad.getText()));
            u.setEstatura(Integer.parseInt(cc.txtEstatura.getText()));
            u.setPeso(Integer.parseInt(cc.txtPeso.getText()));
            u.setTelefono(Integer.parseInt(cc.txtTelefono.getText()));
            u.setCorreo(cc.txtCorreo.getText());
            u.setContrasena(cc.txtContrasena.getText());
            if(con.crearUsuario(u)){
                JOptionPane.showMessageDialog(null, "Usuario creado con exito!");
            }else {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }
        }
    }
    
    
    
    
    
    
}
