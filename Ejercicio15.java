/*
 * 
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
 * la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * Ejemplo 1:
 * do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 * Ejemplo 2:
 * la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        boolean multiplo = false;
        String primero = "";
        String notaLetra = "";
        int notas;
        int melodia;
        do {
            melodia = (int)((Math.random()*28 - 4 + 1) + 4);
            if (melodia % 4 == 0) {
                multiplo = true;
            }
        } while (!multiplo);
        for ( int i2 = 1 ; i2 <= melodia ; i2++ ) {
            for ( int i = 1 ; i <= 4 ; i++ ) {
                notas = (int)(Math.random()*7);
                switch (notas) {
                    case 0:
                        notaLetra = "do";
                        break;
                    case 1:
                        notaLetra = "re";
                        break;
                    case 2:
                        notaLetra = "mi";
                        break;
                    case 3:
                        notaLetra = "fa";
                        break;
                    case 4:
                        notaLetra = "sol";
                        break;
                    case 5:
                        notaLetra = "la";
                        break;
                    case 6:
                        notaLetra = "si";
                        break;
                    default:
                }
                if ( i2 == 1 && i == 1) {
                    primero = notaLetra;
                } else if ( i2 == melodia && i == 4 ) {
                    notaLetra = primero;
                }
                System.out.print(notaLetra + " ");
                if ( i2 == melodia && i == 4) {
                    System.out.print("|");
                }
            }
            System.out.print("| ");
        }
    }
}
