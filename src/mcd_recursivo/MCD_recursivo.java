/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd_recursivo;

import java.util.Scanner;

/**
 *
 * @author trini
 */
public class MCD_recursivo {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        
        int mcd = encontrarMCDRecursivo(num1, num2);
        
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }
    
    public static int encontrarMCDRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return encontrarMCDRecursivo(b, a % b);
        }
    }
}