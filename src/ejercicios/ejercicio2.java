package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {

    /*
     * Realiza un programa que pida 10 números por teclado y que los almacene en un array. Seguidamente, el programa
     * eliminará los números no primos.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = new int[10];
        int indice = 0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros en el array: ");
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = sc.nextInt();
        }

        System.out.println("Array original: " + Arrays.toString(tabla));

        while (indice < tabla.length) {

            if (esPrimo(tabla[indice])) {   //Si se encuentra en la tabla un número impar.

                //Desplazamos los elementos a la derecha del elemento eliminado una posición a la izquierda.
                System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);

                //Indicamos que la nueva tabla tiene una posición menos con un Array.copyOf
                tabla = Arrays.copyOf(tabla, tabla.length - 1);

                //En caso de que sean pares, aumentamos en 1 la posición, para que haga otro bucle.
            } else {

                indice++;
            }
        }

        System.out.println(Arrays.toString(tabla));

    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        if (n == 0 || n == 1) {
            primo = false;
        }
        for (int i = 2; i < n ; i++) {
            primo = true;
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
