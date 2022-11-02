/*
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int sumaTotal = 0;
        for (int i = 1 ; i <= 3 ; i++) {
            int mano = (int)(Math.random()*6 + 1);
            System.out.println("Dado número " + i + " contiene el valor: " + mano);
            sumaTotal += mano;
        }
        System.out.println("La suma total de los dados es de: " + sumaTotal);
    }
}