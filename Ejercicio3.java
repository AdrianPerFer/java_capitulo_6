/*
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String palo = "";
        String carta = "";
        int numeroPalo = (int)(Math.random()*4 + 1);
        switch (numeroPalo) {
            case 1:
                palo = "Oros";
                break;
            case 2:
                palo = "Copas";
                break;
            case 3:
                palo = "Espadas";
                break;
            case 4:
                palo = "Bastos";
                break;
            default:
        }
        int numeroCarta = (int)((Math.random()*10) + 1);
        switch (numeroCarta) {
            case 1:
                carta = "AS";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta + " de " + palo);
    }
}
