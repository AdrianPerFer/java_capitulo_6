/*
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja esta dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Guardamos los valores de los switches para imprimirlo
        String palo = "";
        String carta = "";
        // Cambiamos el valor numérico por el nombre del palo
        int numeroPalo = (int)(Math.random()*4 + 1);
        switch (numeroPalo) {
            case 1:
                palo = "Picas";
                break;
            case 2:
                palo = "Corazones";
                break;
            case 3:
                palo = "Diamantes";
                break;
            case 4:
                palo = "Tréboles";
                break;
            default:
        }
        // Solo los valores que cambiamos de número a letra, los ponemos
        // En el switch, en default, el valor de carta será el número.
        // Como solo nos pide indicar el valor de carta, todo entra en
        // default, si tuviéramos que hacer algún cambio en cada carta
        // tendríamos que indicarlo en el switch como un new case.
        int numeroCarta = (int)((Math.random()*13) + 1);
        switch (numeroCarta) {
            case 1:
                carta = "AS";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta + " de " + palo);
    }
}