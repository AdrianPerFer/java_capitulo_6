/*
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * Ejemplo 1:
 * diamante diamante limón
 * Bien, ha recuperado su moneda
 * Ejemplo 2:
 * herradura campana diamante
 * Lo siento, ha perdido
 * Ejemplo 3:
 * corazón corazón corazón
*  Enhorabuena, ha ganado 10 monedas
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int tirada1 = 0;
        int tirada2 = 0;
        int tirada3 = 0;
        int numeroTirada = 0;
        for ( int i = 1 ; i <= 3 ; i++ ) {
            numeroTirada = (int)(Math.random()*5);
            switch (numeroTirada) {
                case 0:
                    System.out.print("Corazón ");
                    break;
                case 1:
                    System.out.print("Diamante ");
                    break;
                case 2:
                    System.out.print("Herradura ");
                    break;
                case 3:
                    System.out.print("Campana ");
                    break;
                case 4:
                    System.out.print("Limón ");
                    break;
                default:
            }
            switch (i) {
                case 1:
                    tirada1 = numeroTirada;
                    break;
                case 2:
                    tirada2 = numeroTirada;
                    break;
                case 3:
                    tirada3 = numeroTirada;
                    break;
                default:
            }
        }
        System.out.println();
        if (tirada1 == tirada2 && tirada2 == tirada3 && tirada3 == tirada1) {
            System.out.println("Enhorabuena, ha ganado 10 monedas.");
        } else if (tirada1 != tirada2 && tirada2 != tirada3 && tirada1 != tirada3) {
            System.out.println("Lo siento, ha perdido.");
        } else {
            System.out.println("Bien, ha recuperado su moneda.");
        }
    }
}
