package ejercicios;

import java.util.Arrays;

public class ejercicio1 {
    /*
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
     * El programa debe eliminar todos los números impares. No se debe cambiar el orden en el que están insertados
     * los elementos.
     */
    public static void main(String[] args) {

        int[] tablaOriginal = new int[20];

        for (int i = 0; i < tablaOriginal.length; i++) {
            tablaOriginal[i] = (int) (Math.random() * 100+1);
        }

        System.out.println("Array original: " + Arrays.toString(tablaOriginal));

        quitarImpares(tablaOriginal);

    }

    public static void quitarImpares(int[] tabla){
        int[] tablaPares;
        int contadorPares = 0;

        //primero contamos cuantos numeros pares tiene el array
        for (int pares: tabla) {
            if (pares%2==0){
                contadorPares++;
            }
        }

        //Indicamos que el array de pares tenga el tamaño de la cantidad e pares contados
        tablaPares = new int[contadorPares++];

        //Volvemos a recorrer la tabla e indicamos que se inserte en la tabla de pares los elementos divisibles entre 2
        int indice = 0;
        for (int num : tabla) {
            if (num % 2 == 0) {
                tablaPares[indice++] = num;
            }
        }

        //Mostramos por pantalla el array sin impares
        System.out.println("Array sin impares: " + Arrays.toString(tablaPares));
    }
}
