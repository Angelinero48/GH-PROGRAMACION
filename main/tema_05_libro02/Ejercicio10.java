package tema_05_libro02;
import java.util.Scanner;
/**
 * @author Ángel Linero Cano
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Vamos a realizar la media de los números que introduzcas (para parar introduce un num negativo); ");
    double cont;
    cont=0;
    double num;
    num=0;
    double suma;
    suma=0;
    while (num>0){
      num=s.nextDouble();
      cont++;
      suma=suma+num;
    }
    System.out.println("La media de los números introducidos es: "+ (suma/cont));
  }
}
