/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Punto;
import javax.swing.JOptionPane;

/**
 *
 * @author BRENDA TAYUPANTA
 */
public class ClaseMain {
    public static void main(String[] args) {
        //IMPRIMIR UN PUNTO ENVIADO ATRAVEZ DEL CONSTRUCTOR "DATO QUEMADO"
        Punto OB_punto = new Punto(7, 5);
        OB_punto.imprimirPunto();
        //IMPRIMIR UN PUNTO 
        try {
            int ejex;
            int ejey;
            ejex = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ejex"));
            ejey = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ejey"));
            OB_punto.setX( ejex );
            OB_punto.setY( ejey );
            OB_punto.imprimirPunto();
        } catch (Exception e) {
            System.out.println("Debe ingresar numeros");
        }
       
    }
}