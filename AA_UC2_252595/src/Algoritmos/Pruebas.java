/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author Alberto Jimenez
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {10, 12, 13, 11, 20};
//        Ordenamiento.burbuja(a);
//        Ordenamiento.insercion(a);
//        Ordenamiento.seleccion(a);
        Ordenamiento.quickSort(a, 0, 4);
    }
}
