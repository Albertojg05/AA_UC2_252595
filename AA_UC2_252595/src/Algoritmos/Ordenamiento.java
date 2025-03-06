/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author Alberto Jimenez
 */
public class Ordenamiento {

    public static void burbuja(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i; j++) {
                // Comparación
                if (a[j] > a[j + 1]) {
                    // Intercambio
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
}
