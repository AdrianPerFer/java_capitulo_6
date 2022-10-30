/*
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int sumaTotal = 0;
        for (int i = 1 ; i <= 3 ; i++) {
            int mano = (int)(Math.random()*3);
            System.out.println("Dado número " + i + " contiene el valor: " + mano);
            sumaTotal += mano;
        }
        System.out.println("La suma total de los dados es de: " + sumaTotal);
    }
}