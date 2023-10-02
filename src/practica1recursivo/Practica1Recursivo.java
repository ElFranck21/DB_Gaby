/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1recursivo;

import java.util.Scanner;

/**
 *
 * @author trini
 */
public class Practica1Recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de y: ");
        int y = scanner.nextInt();

        System.out.print("Ingresa el valor de z: ");
        int z = scanner.nextInt();

        int sumaCuadrados = sumaCuadradosRecursiva(y, z);

        System.out.println("La sumatoria de los cuadrados es: " + sumaCuadrados);
    }

    public static int sumaCuadradosRecursiva(int y, int z) {
        if (y > z) {
            return 0;
        } else {
            int cuadrado = y * y;
            return cuadrado + sumaCuadradosRecursiva(y + 1, z);
        }
    }
}






            
    
