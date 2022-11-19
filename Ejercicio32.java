/*
 * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 * el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
 * del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
 * espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
 * la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 * Por cada metro de sendero - representado por una línea - puede que haya un
 * obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
 * es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
 * sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
 * O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
 * habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 * 
 * Ejemplo 1:
 * Introduzca la longitud del sendero en metros: 7
 * |  * |
 *  |   O|
 *  |    |
 * | *  |
 *  |*   |
 *  |  O  |
 *   |     |
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del sendero en metros: ");
        int longitud = sc.nextInt();
        int anchura = 6;
        int giro;
        int espacio = 12;
        String obstaculo = "";
        for (int i = 0; i < longitud; i++) {
            int numero_obstaculo = (int)(Math.random()*2);
            int posicion_obstaculo = (int)(Math.random()*4);
            switch (numero_obstaculo) {
                case 0:
                    obstaculo = "*";
                    break;
                case 1:
                    obstaculo = "O";
                    break;
                default:
            }
            giro = (int)(Math.random()*2);
            if (giro == 0) {
                espacio--;
            } else if (giro == 1) {
                espacio++;
            }
            for (int j = 0; j < espacio; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < anchura - 2; j++) {
                if (posicion_obstaculo == j) {
                    System.out.print(obstaculo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        sc.close();
    }
}
