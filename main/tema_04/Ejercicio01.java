package tema_04;
/**
 * @author Ángel Linero Cano
 * Programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día
 */
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el día de la semana de lunes a viernes: ");
    String dia;
    dia = s.nextLine();
    if ("lunes".equals(dia)) {
      System.out.println("El lunes a primera hay Sistemas Informáticos");
    }
    if ("martes".equals(dia)) {
      System.out.println("El martes a primera hay Programación");
    }
    if ("miercoles".equals(dia)) {
      System.out.println("El miércoles a primera hay Sistemas Informáticos");
    }
    if ("jueves".equals(dia)) {
      System.out.println("El jueves a primera hay Programación");
    }
    if ("viernes".equals(dia)) {
      System.out.println("El viernes a primera hay Programación");
    }
  }
}