package tema_04;

/**
 * @author Ángel Linero Cano
 * Practicar el Ejemplo1 del tema 4, con colores.
 */
import java.util.Scanner;
public class Ejemplo01 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("¿Cuál es tu color favorito?");
    String miColor;
    miColor = s.nextLine();
    if ("morado".equals(miColor)){
      System.out.println("iguales");
    } else {
      System.out.println("diferentes");
    }
  }
}
