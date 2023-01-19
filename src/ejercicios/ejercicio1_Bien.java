package ejercicios;

import java.util.Arrays;

public class ejercicio1_Bien {
    /*
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
     * El programa debe eliminar todos los números impares. No se debe cambiar el orden en el que están insertados
     * los elementos.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = new int[20];
        int indice = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100+1);
        }

        System.out.println("Array original: " + Arrays.toString(tabla));

        while (indice< tabla.length){

            if (tabla[indice]%2!=0) {   //Si se encuentra en la tabla un número impar.

                //Desplazamos los elementos a la derecha del elemento eliminado una posición a la izquierda.
                System.arraycopy(tabla, indice+1, tabla, indice, tabla.length-indice-1);

                //Indicamos que la nueva tabla tiene una posición menos con un Array.copyOf
                tabla= Arrays.copyOf(tabla, tabla.length-1);

                //En caso de que sean pares, aumentamos en 1 la posición, para que haga otro bucle.
            } else {

                indice++;
            }
        }

    }
}
