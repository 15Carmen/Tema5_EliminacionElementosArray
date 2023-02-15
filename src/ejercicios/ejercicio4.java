package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    /*
     * Escribir un programa que genere 20 números enteros aleatorios entre 0 y 10 y los almacene en una tabla. A
     * continuación, debe solicitar al usuario un número entero. El programa debe eliminar de la tabla todos los
     * números que sean mayores que un número dado. La tabla no está ordenada ni hay que ordenarla.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int[] tabla = new int[20];      //Array donde vamos a guardar los numeros generados aleatoriamente
        int indice = 0;                 //Variable contador con el que vamos a llevar la cuenta de las vueltas del bucle while
        int num;                        //Variable donde vamos a guardar el numero introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Rellenamos el array con 20 numeros aleatorios
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
        }

        //Imprimimos el array original
        System.out.println("Array original: " + Arrays.toString(tabla));

        //Le pedimos al usuario que introduzca un numero entero
        System.out.println("Introduzca un numero entero: ");
        num = sc.nextInt();


        //Mientras el indice sea menor que la longitud del array
        while (indice < tabla.length) {

            if (tabla[indice] > num) {   //Si se encuentra en la tabla un número impar.

                //Desplazamos los elementos a la derecha del elemento eliminado una posición a la izquierda.
                System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);

                //Indicamos que la nueva tabla tiene una posición menos con un Array.copyOf
                tabla = Arrays.copyOf(tabla, tabla.length - 1);

                //En caso de que sean pares, aumentamos en 1 la posición, para que haga otro bucle.
            } else {

                indice++;
            }
        }

        //Imprimimos el nuevo array con los elementos eliminados
        System.out.println("Nuevo array: " + Arrays.toString(tabla));
    }
}
