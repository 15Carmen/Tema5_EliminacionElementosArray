package ejercicios.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos {

    /*
     * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y eliminará todas las
     * apariciones de V del array.
     */

    //Declaramos las variables
    static int[] array = new int[10];

    //Declaramos el scanner para poder leer por consola
    static Scanner sc = new Scanner(System.in);

    public static void mostrarValores() {
        System.out.println(Arrays.toString(array));
    }

    public static void eliminarValores() {
        int V;
        int indiceBorrar;

        System.out.println();
        System.out.println("Introduzca el valor que de sea introducir: ");
        V = sc.nextInt();

        indiceBorrar = Arrays.binarySearch(array, V);

        if (indiceBorrar>=0){
            System.arraycopy(array, indiceBorrar + 1,  array, indiceBorrar, array.length - indiceBorrar - 1);
            array = Arrays.copyOf(array, array.length-1);
        }else {
            System.out.println("No se encuentra el elemento a eliminar");
        }

    }
}
