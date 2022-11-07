/*
 * 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 * Ejemplo:
 * Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
 *  @
 *  *
 * *
 *  *
 *  *
 *   *
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = sc.nextInt();
        for ( int i = 1 ; i < 13 ; i++ ) {
            System.out.print(" ");
        }
        System.out.println("@");
        for ( int j = 1 ; j <= longitud ; j++ ) {
            int numeroSerpenteo = (int)(Math.random()*3);
            switch (numeroSerpenteo) {
                case 0:
                    for ( int i = 1 ; i < 13 - 1 ; i++ ) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    break;
                case 1:
                    for ( int i = 1 ; i < 13 ; i++ ) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    break;
                case 2:
                    for ( int i = 1 ; i <= 13 ; i++ ) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    break;
                default:
            }
        }
        sc.close();
    }
}
