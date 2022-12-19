package tema_05_libro02;

/**
 * @author Angel Linero Cano
 */
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.print("Introduzca un número real como base: ");
    int base;
    base=s.nextInt();
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFin =s.nextInt();
    double potencia;
    int exponente;
    for (int i=1;i<=exponenteFin;i++){
      potencia=1;
      exponente=i;
      for (int a= 0; a < exponente; a++) {
        potencia *= base;
      }
      System.out.println(base+ "^" +i+" = "+ potencia);
    }
  }
}


