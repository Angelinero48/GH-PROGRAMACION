package tema_05;

/**
 * @author Angel Linero Cano
 */
public class EjercicioClase03 {
  public static void main(String[] args) {
    int sum;
    sum=0;
    int i;
    for (i=1;i<=10;i++){
      sum=sum+i;
    }
    System.out.println("La suma de los primeros diez numero naturales es: " + sum);
    int mul;
    mul=1;
    for (int a=1;a<=10;a++){
      mul=mul*a;
    }
    System.out.println("la multiplicacion de los 10 primeros naturales es: " + mul);
  }
}
