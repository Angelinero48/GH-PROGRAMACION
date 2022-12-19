package tema_05_libro02;
/**
 * @author Ángel Linero Cano
 * programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 */

import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce dos números separados de un espacio. Primer número: ");
    int primernum;
    primernum=s.nextInt();
    System.out.println("Y ahora el segundo número: ");
    int segundonum;
    segundonum=s.nextInt();
    if (primernum != segundonum){
      for (int i=primernum;i<=segundonum;i=i+7){
        System.out.println(i);
      }
    }else{
      System.out.println("Estos números son iguales.");
    }

  }
}
