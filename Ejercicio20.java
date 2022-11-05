/*
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * Ejemplo:
 * Por favor, indique la capacidad de la cuba en litros: 3
 * *    *
 * *====*
 * *====*
 * ******
 * La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *  
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = sc.nextInt();
        int relleno = (int)(Math.random()*capacidad);
        boolean siRelleno = false;
        // parte del medio del cubo
        for ( int j = capacidad ; j >= 1 ; j-- ) {
            for ( int i = 1 ; i <= 6 ; i++ ) {
                if (i == 1 || i == 6) {
                    System.out.print("*");
                } else if (j == relleno || siRelleno) {
                    siRelleno = true;
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("******");
        System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + relleno + " litros de agua.");
        sc.close();
    }
}
