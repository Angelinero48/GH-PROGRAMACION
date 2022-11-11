package Tema_03_Scanner;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 * Multiplicación de dos números que ha introducido el usuario por teclado, utilizando Scanner.
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce dos números separados por un espacio: ");
    int primernum;
    primernum= s.nextInt();
    int segundonum;
    segundonum=s.nextInt();
    System.out.println("La multiplicación de los dos números elegidos es: " + (primernum*segundonum));
  }
}
