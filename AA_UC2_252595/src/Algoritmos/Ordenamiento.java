package Algoritmos;

/**
 *
 * @author Alberto Jimenez
 */
public class Ordenamiento {

    public static void burbuja(int[] a) {
        for (int i = 1; i < a.length - 1; i++) { //(n - 1)
            for (int j = 0; j < a.length - i; j++) { // (n - i)
                // Comparación
                if (a[j] > a[j + 1]) { // (n - i)
                    // Intercambio
                    int aux = a[j]; // 1
                    a[j] = a[j + 1]; // 1
                    a[j + 1] = aux; // 1
                } // (n - i)
            } // (n - i)
        } // (n - 1)
    } // O(n^2)
}
