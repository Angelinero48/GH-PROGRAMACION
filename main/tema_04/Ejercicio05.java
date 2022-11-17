package tema_04;
/**
 * @author Ángel Linero Cano
 *
 */

import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Vamos a resolver la siguiente ecuación: ax + b = 0");
    System.out.println("Introduzca el valor de a: ");
    int a;
    a=s.nextInt();
    System.out.println("Ahora, el valor de b: ");
    int b;
    b=s.nextInt();
    if (a>0){
      double ecuacion = ((-b) / a);
      System.out.println("x= " + ecuacion);
    }else{
      System.out.println("Esta ecuación no tiene solucion real.");
    }
  }
}
