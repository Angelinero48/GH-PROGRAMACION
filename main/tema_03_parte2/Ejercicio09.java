package tema_03_parte2;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 * Programa que calcule el volumen de un cono según la fórmula V = 1/3 πr2h
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    final double PI = 3.141592654;
    System.out.println("Volumen de un cono");
    System.out.print("Por favor, introduzca la altura (cm): ");
    double h;
    h=s.nextDouble();
    System.out.print("Introduzca el radio (cm): ");
    double r;
    r=s.nextDouble();
    double v = (1.0/3.0) * PI * r * r * h;
    System.out.println("El volumen del cono es de " + v + " cm³");
  }
}

