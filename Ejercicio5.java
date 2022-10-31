/*
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int max = 0;
        int min = 213;
        int i = 0;
        int sumaTotal = 0;
        int numero = 0;
        for ( i = 1 ; i <= 50 ; i++ ) {
            numero = (int)((Math.random()*100) + 100);
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
            sumaTotal += numero;
            System.out.print(numero + " ");
        }
        double media = (double)sumaTotal / i;
        System.out.println();
        System.out.println("El número máximo fue " + max);
        System.out.println("El número mínimo fue " + min);
        System.out.printf("La media de los números fue %.2f", media);
    }
}
