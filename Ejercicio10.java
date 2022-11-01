/*
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int caracter;
        int longitud;
        for ( int i = 1 ; i <= 10 ; i++) {
            longitud = (int)((Math.random()*40) + 1);
            caracter = (int)(Math.random()*6);
            for ( int i2 = 1 ; i2 <= longitud ; i2++) {
                switch (caracter) {
                    case 0:
                        System.out.print("*");
                        break;
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("=");
                        break;
                    case 3:
                        System.out.print(".");
                        break;
                    case 4:
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print("@");
                        break;
                    default:
                }
            }   
            System.out.println();
        }    
    }
}
