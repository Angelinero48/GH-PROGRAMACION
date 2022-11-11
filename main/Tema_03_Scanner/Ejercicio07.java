package Tema_03_Scanner;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Calcular el total de un producto, a traves de la base imponible, introducida por teclado
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Introduce la base imponible del producto: ");
    double baseimponible;
    baseimponible=s.nextDouble();
    double total;
    total= baseimponible*1.21;
    System.out.printf("El total del producto con el iva es %.2f eurosjf", total);
  }
}
