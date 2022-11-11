package Tema_03_Scanner;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Introducir dos numeros por teclado y realizar la suma, resta multiplicación y división de ambos, con Scanner.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce dos números, separados por un espacio: ");
    int a;
    a= s.nextInt();
    int b;
    b=s.nextInt();
    double div;
    div= a/b;
    System.out.println("La suma de ambos número es: " + (a+b) + ", la resta: " + (a-b) + ", la multiplicación: " + (a*b) + ", y la división: " + div);
  }
}
