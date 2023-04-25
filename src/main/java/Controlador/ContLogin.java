/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.indexSesion;
import Vista.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Recibimos las acciones de los btn
public class ContLogin  implements ActionListener{
    
    private login l;
    private indexSesion is;
    
    public ContLogin (login l, indexSesion is){
        
        this.l = l;
        this.is = is;
        
        this.l.btnIngresar.addActionListener((ActionListener) this);
    }
    
    //Metodo Visual
    public void iniciar(){
        l.setTitle("Login");
        l.setLocationRelativeTo(null);
    }
    
    //Función de botón de la interfaz
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource()== l.btnIngresar){
            is.setVisible(true);
            l.dispose();
        }
    
    }
    
}
