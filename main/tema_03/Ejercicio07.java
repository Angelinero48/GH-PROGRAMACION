package tema_03;

/**
 * @author Ánge Linero Cano
 * Calcular el precio de un producto a partir de su base imponible
 */
public class Ejercicio07 {
  public static void main(String[] args) {
   String linea;
    System.out.println("Introduce la base imponible de este producto: ");
    linea = System.console().readLine();
    double baseimponible;
    baseimponible = Double.parseDouble(linea);
    double total;
    total= baseimponible*1.21;
    System.out.printf("El total de la base imponible junto con el iva es %.2f", total);
  }
}
