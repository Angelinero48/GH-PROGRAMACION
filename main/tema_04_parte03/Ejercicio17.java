package tema_04_parte03;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 * Programa que diga cuál es la última cifra de un número entero introducido por teclado.
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Introduce un número por teclado: ");
    int n;
    n=s.nextInt();
    if (n<0)
      n=-n;
    int ultCifra;
    ultCifra= n%10;
    System.out.println("La última cifra de tu numero es "+ultCifra);
  }
}
