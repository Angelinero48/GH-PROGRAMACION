package tema_04_parte03;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Programa que te diga cuantas cifras tiene un número introducido por teclado.
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un número por teclado: ");
    int n;
    n=s.nextInt();
    if (n<0)
      n=-n;
    if (n<10){
      System.out.println("Este número tiene 1 cifra");
    }
    if ((n>=10)&&(n<100)){
      System.out.println("Este número tiene 2 cifras");
    }
    if ((n>=100)&&(n<1000)){
      System.out.println("Este número tiene 3 cifras");
    }
    if ((n>=1000)&&(n<10000)){
      System.out.println("Este número tiene 4 cifras");
    }
    if ((n>=10000)&&(n<1000000)){
      System.out.println("Este número tiene 5 cifras");
    }
  }
}
