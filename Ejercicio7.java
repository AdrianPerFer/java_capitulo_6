/*
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int columnas = 3;
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%5d. |", i);
            if (i == 15) {
                columnas = 1;
            }
        int resultado;
        for (int i2 = 1; i2 <= columnas; i2++) {
            resultado = (int)((Math.random() * 3) + 1);
            switch(resultado) {
                case 1:
                    System.out.print("1  |");
                    break;
                case 2:
                    System.out.print("  2|");
                    break;
                case 3:
                    System.out.print(" X |");
                default:
                }
            }
        System.out.println();
        }
    }
}