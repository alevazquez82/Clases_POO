
package com.mycompany.clase02;


public class Clase02 {

    public static void main(String[] args) {
        System.out.println("Comentarios! y datos primitivos");
// Comentario de una linea.
        /* 
        Comentario
        de
        multiples
        lineas.
        */
        byte entero = 12;// tamaño 8, rango -128 a 127;
        short enteroShort = 12456;//tamaño 16, rango -32.768 a 32.7678;
        int enteroInt = 1245656;//tamaño 32, rango -2.147.483.648 a 2.147.483.647;
        long enteroLong = 1245656785;//tamaño 64, rango -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807;
        float decimalFloat = 3.45f;//tamaño 32, rango 1.4e-045 a 3.4e+038;
        double decimalDouble = 3.4523421;//tamaño 64, rango 4.9e-324 a 1.8e+308;
        char caracter = 'A';
        boolean decision = true;
        System.out.println("El numero byte es: " + entero);
        System.out.println("El numero short es: " + enteroShort);
        System.out.println("El numero int es: " + enteroInt);
        System.out.println("El numero long es: " + enteroLong);
        System.out.println("El numero float es:" + decimalFloat);
        System.out.println("El numero double es:" + decimalDouble);
        System.out.println("El caracter char es: " + caracter);
        System.out.println("El booleano decicion es :" + decision);
    
        System.out.println("Tipos de datos no primitivos y cadenas");
        Integer numero = null;
        String palabra = "Programacion en Java";
        System.out.println("El numero Integer es: " + numero);
        System.out.println("La cadena String es: " + palabra);
        
    }
}
