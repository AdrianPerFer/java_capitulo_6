/*
 * 
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 * da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 * de la tableta.
 * 
 * Ejemplo 1:
 * Introduzca la anchura de la tableta: 6
 * Introduzca la altura de la tableta: 4
 * ******
 * *****
 * ******
 * ******
 * 
 * Ejemplo 2:
 * Introduzca la anchura de la tableta: 7
 * Introduzca la altura de la tableta: 3
 * *******
 * *******
 * ******
 * 
 * Ejemplo 3:
 * Introduzca la anchura de la tableta: 5
 * Introduzca la altura de la tableta: 5
 * ** **
 * *****
 * *****
 * *****
 * *****
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = sc.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = sc.nextInt();
        int numero = (int)(Math.random()*(anchura * 2 + (altura - 2) * 2));
        System.out.println(numero);
        int contador = 0;
        for ( int i = 0 ; i < altura ; i++ ){
            for ( int j = 0 ; j < anchura ; j++ ) {
                boolean esBorde = (i == 0) || (i == altura - 1) || j == 0 || (j == anchura - 1);
                if ((contador == numero) && esBorde) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (esBorde) {
                    contador++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
