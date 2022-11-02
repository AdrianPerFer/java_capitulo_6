/*
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = ((int)((Math.random()*100) + 1));
        int numero2 = 0;
        int i = 1;
        System.out.println(numero);
        do {
            System.out.print("Intento " + i + ", introduce un número: ");
            numero2 = sc.nextInt();
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
