package prueba;

/**
 * @author Ángel Linero Cano
 * Realizar un programa para pasar de euros a pesetas, y el resultado por pantalla realizarlo con la salida formateada
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    double euros;
    euros=564.25;
    int conv;
    conv= (int) (euros * 166.386);
    System.out.printf("%.2f euros son %d pesetas", euros, conv);
  }
}
