/*
 * 
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int columnas = 3;
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%5d. |", i);
            if (i == 15) {
                columnas = 1;
            }
        int resultado;
        for (int i2 = 1; i2 <= columnas; i2++) {
            resultado = (int)((Math.random() * 6) + 1);
            switch(resultado) {
                case 1:
                case 2:
                case 3:
                    System.out.print("1  |");
                    break;
                case 4:
                case 5:
                    System.out.print(" X |");
                    break;
                case 6:
                    System.out.print("  2|");
                default:
                }
            }
        System.out.println();
        }
    }
}