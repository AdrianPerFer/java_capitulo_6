/*
 * 
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * Ejemplo:
 * 2 céntimos - cara
 * 20 céntimos - cruz
 * 50 céntimos - cruz
 * 1 euro - cruz
 * 2 euros - cara
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        String posicion = "";
        String moneda = "";
        for ( int i = 1 ; i <= 5 ; i++ ) {
            int numeroPosicion = (int)(Math.random()*2+1);
            switch (numeroPosicion){
                case 1:
                    posicion = "cara";
                    break;
                case 2:
                    posicion = "cruz";
                    break;
                default:
            }
            int numeroMoneda = (int)(Math.random()*8+1);
            switch (numeroMoneda) {
                case 1:
                    moneda = "1 céntimo";
                    break;
                case 2:
                    moneda = "2 céntimos";
                    break;
                case 3:
                    moneda = "5 céntimos";
                    break;
                case 4:
                    moneda = "10 céntimos";
                    break;
                case 5:
                    moneda = "20 céntimos";
                    break;
                case 6:
                    moneda = "50 céntimos";
                    break;
                case 7:
                    moneda = "1 euro";
                    break;
                case 8:
                    moneda = "2 euros";
                    break;
                default:
            }
            System.out.println(moneda + " - " + posicion);
        }
    }
}
