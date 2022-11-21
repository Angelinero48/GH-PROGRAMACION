package tema_03_parte2;
/**
 * @author Ángel Linero Cano
 * Programa para pasar de Kb a Mb.
 */

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s =new Scanner (System.in);
    System.out.println("Introduce los Kb que quieres transformar a Mb: ");
    double kb;
    kb= s.nextDouble();
    double conv;
    conv = kb / 1024;
    System.out.println(kb + " Kb, son " + conv + " Mb");
  }
}
