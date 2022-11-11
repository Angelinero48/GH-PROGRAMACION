package Tema_03_Scanner;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Calcular el área de un rectángulo
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce el ancho y el largo del rectángulo, separado de un espacio: ");
    double a;
    a= s.nextDouble();
    double b;
    b=s.nextDouble();
    System.out.println("El área del rectángulo es: " + (a*b));
  }
}
