/*
 * 
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 406783
 * 7
 * 
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 406783
 * 3
 * 
 * Ejemplo 3:
 * Por favor, introduzca un número entero positivo: 406783
 * 0
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        long numero = sc.nextInt();
        // Contamos el número para saber cuantos números generar aleatoriamente
        int contadorDigito = 0;
        long aux = numero;
        while (aux > 0) {
            aux /= 10;
            contadorDigito++;
        }
        int selector = (int)((Math.random()*contadorDigito));
        // 10 elevado al contador - el número generado y % 10
        // Con esto establecemos a posición en la que queremos hacer el módulo
        System.out.println((numero / (long)(Math.pow(10, contadorDigito - selector))) % 10);
        sc.close();
    }
}
