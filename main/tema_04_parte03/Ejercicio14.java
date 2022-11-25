package tema_04_parte03;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 * Programa que nos diga si el número introducido es par y/o dividido entre 5.
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int n;
    n=s.nextInt();
    if (n % 2 == 0){
      if (n % 5 == 0){
        System.out.println("Es par y divisible entre 5.");
      }else {
        System.out.println("Es par y no es divisible entre 5.");
      }
    }else {
      System.out.println("Este numero no es par.");
    }
  }
}
//n%10 --> ultima cifra
//n/10 --> primera cifra
