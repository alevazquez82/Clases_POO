/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class Clase3 {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Ingresar cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar entero: "));
        letra = JOptionPane.showInputDialog("Ingresar letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingresar decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena ingresada es: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero ingresado es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra ingresada es: " +letra);
        JOptionPane.showMessageDialog(null, "El decimal ingresado es: "+decimal);
        
    }
}
