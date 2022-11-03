/*
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        int numero = 0;
        int maxPar = 0;
        int sumaTotal = 0;
        int minImpar = 313;
        int i = 0;
        for ( i = 1 ; i <= 50 ; i++ ) {
            numero = (int)((Math.random()*301) -100);
            System.out.print(numero + " ");
            if (numero % 2 == 0) {
                if (numero > maxPar) {
                    maxPar = numero;
                }
            } else if (numero % 2 == 1) {
                if (numero < minImpar) {
                    minImpar = numero;
                }
            }
            sumaTotal += numero;
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50){
                System.out.println();
            }
        }
        System.out.println();
        double media = (double)sumaTotal / i;
        System.out.println("Número máximo par: " + maxPar);
        System.out.println("Número mínimo impar: " + minImpar);
        System.out.printf("Media total: %.2f\n ", media);
    }
}
