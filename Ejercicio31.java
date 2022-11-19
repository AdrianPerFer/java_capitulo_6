/*
 * 
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
 * si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
 * da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
 * ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su apuesta: ");
        float apuesta = sc.nextFloat();
        int dado_1 = (int)(Math.random()*6 + 1);
        int dado_2 = (int)(Math.random()*6 + 1);
        System.out.println("Dado 1: " + dado_1);
        System.out.println("Dado 2: " + dado_2);
        System.out.println();
        int sumaDado_1 = dado_1 + dado_2;
        int sumaDado_2 = 0;
        boolean fin = false;
        if ((sumaDado_1) == 7 ||(sumaDado_1) == 11) {
            System.out.println("GANASTE!, ha ganado un total de: " + (apuesta * 2) + "€");
        } else if ((sumaDado_1) == 2 || (sumaDado_1) == 3 || (sumaDado_1) == 12) {
            System.out.println("HAS PERDIDO");
        } else {
            do {
                dado_1 = (int)(Math.random()*6 + 1);
                dado_2 = (int)(Math.random()*6 + 1);
                System.out.println("Dado 1: " + dado_1);
                System.out.println("Dado 2: " + dado_2);
                System.out.println();
                sumaDado_2 = dado_1 + dado_2;
                if (sumaDado_1 == sumaDado_2) {
                    System.out.println("GANASTE!, ha ganado un total de: " + (apuesta * 2) + "€");
                    fin = true;
                } else if (sumaDado_2 == 7) {
                    System.out.println("HAS PERDIDO");
                    fin = true;
                } else {
                    sumaDado_1 = sumaDado_2;
                }
            } while (!fin);
            sc.close();
        }
    }
}
