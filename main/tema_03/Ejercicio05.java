package tema_03;
/**
 * @author Ángel Linero Cano
 * Calcular el área de un rectángulo
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    String linea;
    System.out.println("Introduce el ancho del rectángulo en metros: ");
    linea = System.console().readLine();
    double ancho;
    ancho = Double.parseDouble(linea);
    System.out.println("Introduce el largo del rectángulo en metros: ");
    linea = System.console().readLine();
    double largo;
    largo = Double.parseDouble(linea);
    System.out.println("El área del rectangulo sería: " + (ancho * largo) + " metros");
  }
}
