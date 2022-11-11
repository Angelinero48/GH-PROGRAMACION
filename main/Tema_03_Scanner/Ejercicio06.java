package Tema_03_Scanner;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 * Calcular el área de un triángulo, con datos introducidos por teclado
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Introduce la base del triángulo, y seguido de un espacio, la altura: ");
    double a;
    a= s.nextDouble();
    double b;
    b=s.nextDouble();
    System.out.println("El área del triángulo es: "+((a*b)/2));
  }
}
