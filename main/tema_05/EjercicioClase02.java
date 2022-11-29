package tema_05;
import java.util.Scanner;

public class EjercicioClase02 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Introduce un número: ");
    int n;
    n=s.nextInt();
    int sum;
    sum=0;
    for (int i=0;i<=n;i++){
      sum=sum+i;
    }
    System.out.println("La suma de números hasta el que has introducido es: "+sum);
  }
}
