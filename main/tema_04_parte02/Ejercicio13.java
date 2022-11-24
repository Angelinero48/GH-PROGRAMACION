package tema_04_parte02;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Introducir tres números por teclado, y mostrar el mayor.
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a ver cual es el valor más grande de los 3 que introduces.");
    System.out.println("Introduce el valor de a: ");
    int a;
    a = s.nextInt();
    System.out.println("Introduce el valor de b: ");
    int b;
    b = s.nextInt();
    System.out.println("Introduce el valor de c: ");
    int c;
    c = s.nextInt();
    if (a > b) {
      if (a > c) {
        System.out.println("El mayor es " + a);
      }
    }
    if (b > a) {
      if (b > c) {
        System.out.println("El mayor es " + b);
      }
    }
    if (c > a) {
      if (c > b) {
        System.out.println("El mayor es " + c);
      }
    }
  }
}
