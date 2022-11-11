package Tema_03_Scanner;

import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Pasar de euros a pesetas, utilizando Scanner.
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cantidad de euros que quieres pasar a pesetas: ");
    double euros;
    euros = s.nextDouble();
    int conv;
    conv = (int)(euros * 166.386);
    System.out.println("La cantidad de " + euros + " euros, hacen un total de: " + conv + " pesetas");
  }
}
