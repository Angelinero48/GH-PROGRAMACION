package tema_04_parte03;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un número de máxino 5 cifras: ");
    int n;
    n=s.nextInt();
    int primCifra;
    if ((n<0))
      n=-n;
    if ((n>0)&&(n<100)){
      primCifra = n / 10;
      System.out.println("La primera cifra de tu número es: " + primCifra);
    }
    if((n>=100)&&(n<999)) {
    primCifra=n/100;
      System.out.println("La primera cifra de tu número es: " + primCifra);
    }
    if ((n>=1000)&&(n<9999)){
      primCifra=n/1000;
      System.out.println("La primera cifra de tu número es: " + primCifra);
    }
    if ((n>=10000)&&(n<99999)){
      primCifra=n/10000;
      System.out.println("La primera cifra de tu número es: " + primCifra);
    }
  }
}
