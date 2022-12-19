package tema_05_libro02;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Vamos a calcular el cuadrado y el cubo de los 5 numeros enteros a partir del que introduzcas por teclado");
    int num;
    num=s.nextInt();
    for(int a=num;a<num+5;a++){
      int cuad;
      cuad=a*a;
      int cub;
      cub=a*a*a;
      System.out.printf("%6d %6d %6d\n",a,cuad,cub);
    }
  }
}
