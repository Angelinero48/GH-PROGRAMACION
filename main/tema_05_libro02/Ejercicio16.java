package tema_05_libro02;

/**
 * @author Ángel Linero Cano
 */
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un número por pantalla y vamos a ver si es primo o no.\n Escriba el número: ");
    int num;
    num=s.nextInt();
    if((num%num==0)&&(num%1==0)){
      System.out.println("Este numero es primo");
    }
  }
}
