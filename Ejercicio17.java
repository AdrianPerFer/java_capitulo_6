/*
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * Ejemplo:
 * Por favor, introduzca la altura de la pecera (como mínimo 4): 4
 * Ahora introduzca la anchura (como mínimo 4): 7
 * * * * * * * *
 * *           *
 * * &         *
 * * * * * * * *
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.println("Introduce el ancho: ");
        int ancho = sc.nextInt();
        int pececito = 0;
        int random = (int)(Math.random()*(altura - 2)*(ancho - 2));
        System.out.println(random);
        for ( int i = 1 ; i <= altura ; i++ ) {
            for ( int i2 = 1 ; i2 <= ancho ; i2++ ) {
                if (i == 1 || i2 == 1 || i2 == ancho || i == altura) {
                    System.out.print("* ");
                } else if (pececito == random) {
                    System.out.print("& ");
                } else {
                    System.out.print("  ");
                }
                pececito++;
            }
            System.out.println();
        }
        sc.close();
    }
}
