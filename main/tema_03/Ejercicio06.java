package tema_03;
/**
 * @author Ángel Linero Cano
 * Calcular el área de un triángulo.
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    String linea;
    System.out.println("Introduce la base del triángulo: ");
    linea = System.console().readLine();
    double base;
    base=Double.parseDouble(linea);
    System.out.println("Introduce la altura del triángulo: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble(linea);
    System.out.println("El área del triángulo es: " + ((base*altura)/2));
  }
}
