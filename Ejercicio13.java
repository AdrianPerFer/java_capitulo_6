/*
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        int i1 = 0;
        do {
            dado1 = (int)((Math.random()*6)+1);
            dado2 = (int)((Math.random()*6)+1);
            i1++;
            System.out.println("|--------------------------------|");
            System.out.printf("|Dado 1: %d\t|\tDado 2: %d|\n", dado1, dado2);
            System.out.println("|--------------------------------|");
            System.out.println();
        } while (dado1 != dado2);
        System.out.println("Tras " + i1 + " intentos, lo tenemos!" );
    }
}
