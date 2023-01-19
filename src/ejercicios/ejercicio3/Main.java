package ejercicios.ejercicio3;

import java.util.Arrays;

public class Main {
    /*
    Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
       a. Mostrar valores.
       b. Eliminar valor.
       c. Salir.
    La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y eliminará todas las
    apariciones de V del array. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
    terminará el programa.

     */
    public static void main(String[] args) {

        for (int i = 0; i < Metodos.array.length; i++) {
            Metodos.array[i]=(int) (Math.random() * 100+1);
        }
        Arrays.sort(Metodos.array);
        Menu.menu();
    }
}
