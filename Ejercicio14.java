/*
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número en el que estás pensando: ");
        int numero = sc.nextInt();
        int numero2 = 0;
        int i = 1;
        do {
            numero2 = (int)(Math.random()*101);
            if (numero2 == numero) {
                System.out.println("Has adivinado el número");
                i = 6;
            } else if (numero2 > numero) {
                System.out.println(numero2 + " es mayor que el número a adivinar");
            } else if (numero2 < numero) {
                System.out.println(numero2 + " es menor que el número a adivinar");
            }
            i++;
        } while (i < 6);
        if ( i == 6) {
            System.out.println("Intentos agotados");
        }
        sc.close();
    }
}