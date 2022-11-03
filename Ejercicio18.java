/*
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio18 {
    public static void main(String[] args) {
    int op1;
    int op2;
    int op3;
    do {
        op1 = (int)(Math.random()*6);
        op2 = (int)(Math.random()*6);
        op3 = (int)(Math.random()*6);
    } while (op1 == op2 || op2 == op3 || op3 == op1);
        switch (op1) {
            case 0:
                System.out.print("Rojo ");
                break;
            case 1:
                System.out.print("Azul ");
                break;
            case 2:
                System.out.print("Verde ");
                break;
            case 3:
                System.out.print("Amarillo ");
                break;
            case 4:
                System.out.print("Violeta ");
                break;
            case 5:
                System.out.print("Naranja ");
                break;
            default:
        }
        switch (op2) {
            case 0:
                System.out.print("Rojo ");
                break;
            case 1:
                System.out.print("Azul ");
                break;
            case 2:
                System.out.print("Verde ");
                break;
            case 3:
                System.out.print("Amarillo ");
                break;
            case 4:
                System.out.print("Violeta ");
                break;
            case 5:
                System.out.print("Naranja ");
                break;
            default:
        }
        switch (op3) {
            case 0:
                System.out.print("Rojo ");
                break;
            case 1:
                System.out.print("Azul ");
                break;
            case 2:
                System.out.print("Verde ");
                break;
            case 3:
                System.out.print("Amarillo ");
                break;
            case 4:
                System.out.print("Violeta ");
                break;
            case 5:
                System.out.print("Naranja ");
                break;
            default:
        }
    }
}

