/*
 * 
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * Ejemplo 1:
 * Q J 7 J As
 * 
 * Ejemplo 2:
 * K 8 J As 7
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        for ( int i = 1 ; i <= 5 ; i++ ) {
            int numeroCaras = (int)(Math.random()*6);
            String cara = "";
            switch (numeroCaras) {
                case 0:
                    cara = "As";
                    break;
                case 1:
                    cara = "K";
                    break;
                case 2:
                    cara = "Q";
                    break;
                case 3:
                    cara = "J";
                    break;
                case 4:
                    cara = "7";
                    break;
                case 5:
                    cara = "8";
                    break;
                default:
            }
            System.out.print(cara + " ");
        }
    }
}
