package tema_05_libro;
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Dime un numero el cual quieras saber su tabla de multiplicación: ");
    int numero;
    numero=s.nextInt();
    for(int mul=0;mul<=10;mul++){
      System.out.println(numero+" x "+mul+" = "+numero*mul);
    }
  }
}
