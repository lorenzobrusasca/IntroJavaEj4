/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    /*  Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese los grados C°");
        double grados = leer.nextDouble();
        
        System.out.println("Conversión a F° = " + (32 + (9*grados/5)) );
        
        
    }
    
}
