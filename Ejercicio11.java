/*
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        double nota;
        int auxNota;
        for ( int i = 1 ; i <= 20 ; i++ ) {
            nota = (float)(Math.random()*11);
            auxNota = (int)nota;
            switch (auxNota) {
                case 0:
                    System.out.printf("Suspenso con %.2f\n", nota);
                    suspensos++;
                    break;
                case 1:
                    System.out.printf("Suspenso con %.2f\n", nota);
                    suspensos++;
                    break;
                case 2:
                    System.out.printf("Suspenso con %.2f\n", nota); 
                    suspensos++;
                    break;
                case 3:
                    System.out.printf("Suspenso con %.2f\n", nota);
                    suspensos++;
                    break;
                case 4:
                    System.out.printf("Suspenso con %.2f\n", nota);
                    suspensos++;
                    break;
                case 5:
                    System.out.printf("Suficiente con %.2f\n", nota);
                    suficientes++;
                    break;
                case 6:
                    System.out.printf("Bien con %.2f\n", nota);
                    bienes++;
                    break;
                case 7:
                    System.out.printf("Notable con %.2f\n", nota);
                    break;
                case 8:
                    System.out.printf("Notable con %.2f\n", nota);
                    break;
                case 9:
                    System.out.printf("Sobresaliente con %.2f\n", nota);
                    break;
                case 10:
                    System.out.println("Sobresaliente con " + auxNota);
                    break;
                default:
            }
        }
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Número de suficientes: " + suficientes);
        System.out.println("Número de bienes: " + bienes);
    }
}
