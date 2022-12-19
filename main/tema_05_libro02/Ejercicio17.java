package tema_05_libro02;

/**
 * @author Angel Linero Cano
 * Programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado
 */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int num;
    num=s.nextInt();
    int suma;
    suma=num;
    for(int i=num;i<=(num+100);i++){
      suma=suma+i;
    }
    System.out.println(suma);
  }
}
