package Tema_03_Scanner;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Conversor de pesetas a euros, utilizando Scanner
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cantidad de pesetas que quieres pasar a euros: ");
    int pesetas;
    pesetas = s.nextInt();
    double conv;
    conv = (pesetas / 166.386);
    System.out.printf("La cantidad de %d pesetas, hace un total de: %.2f euros", pesetas, conv);
  }
}
