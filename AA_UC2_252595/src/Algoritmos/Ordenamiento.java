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

    public static void insercion(int[] a) {
        for (int i = 1; i < a.length; i++) { // (n-1)
            int key = a[i]; // 1
            int j = i - 1; // 1
            while (j >= 0 && a[j] > key) { // i
                a[j + 1] = a[j]; // 1
                j--; // 1
            }
            a[j + 1] = key; // 1
        }
    } // O(n^2)

    public static void seleccion(int[] a) {
        int n = a.length; // 1
        for (int i = 0; i < n - 1; i++) { // n
            int minIndex = i; // 1
            for (int j = i + 1; j < n; j++) { // n-1
                if (a[j] < a[minIndex]) { // 1
                    minIndex = j; // 1
                }
            }
            int aux = a[minIndex]; // 1
            a[minIndex] = a[i]; // 1
            a[i] = aux; // 1
        } // 1+(n+1)+(n-1)+1+1+1+1+1
    } // O(n^2)

    public static int particionar(int[] a, int inicio, int fin) {
        int pivote = a[fin]; // 1
        int i = inicio; // 1
        for (int actual = inicio; actual < fin; actual++) { // n
            if (a[actual] < pivote) { // 1
                int aux = a[i]; // 1
                a[i] = a[actual]; // 1
                a[actual] = aux; // 1
                i++; // 1
            }
        }
        int temp = a[i]; // 1
        a[i] = a[fin]; // 1
        a[fin] = temp; // 1

        return i; // 1
    }

    public static void quickSort(int[] a, int inicio, int fin) {
        if (inicio < fin) { // 1.
            int pivote = particionar(a, inicio, fin); // n
            quickSort(a, inicio, pivote - 1); // n/2 
            quickSort(a, pivote + 1, fin); // n/2
        }
    } // O(n^2)
}
