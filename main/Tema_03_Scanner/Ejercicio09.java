package Tema_03_Scanner;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * calcule el volumen de un cono según la fórmula V = 1/3 πr2h
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce el radio y la altura del cono, separados por un espacio: ");
    double r;
    r= s.nextDouble();
    double h;
    h=s.nextDouble();
    System.out.println("El volumen es: " + ((1/3)*(3.14*(r*r)*h)));
  }
}
