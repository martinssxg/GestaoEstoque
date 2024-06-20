/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoquecc;

import com.estoqueC.view.TelaPrincipal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAB 12
 */
public class Inicio {
    
  public static void main(String[] args) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
                
                
            }
        });
        
    }
}
