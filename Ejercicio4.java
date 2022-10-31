/*
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        for ( int i = 1 ; i <= 20 ; i++ ) {
            System.out.print((int)(Math.random()*11) + " ");
        }
    }
}
