/*
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int numero = 0;
        int i = 0;
        do {
            numero = (int)(Math.random() *101);
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                i++;
            }
        } while ( numero != 24);
        System.out.println();
        System.out.print("Total de números generados: " + i);
    }
}
