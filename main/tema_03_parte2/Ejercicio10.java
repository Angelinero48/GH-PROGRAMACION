package tema_03_parte2;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Realizar un conversor de Mb a Kb
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s =new Scanner (System.in);
    System.out.println("Introduce los Mb que quieres transformar a Kb: ");
    double mb;
    mb= s.nextDouble();
    double conv;
    conv = mb *1024;
    System.out.println(mb + " Mb, son " + conv + " Kb");
  }
}
