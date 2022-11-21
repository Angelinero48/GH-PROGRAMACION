package tema_04;
/**
 * @author Ángel Linero Cano
 * Realizar un programa que de la media de tres notas.
 */
import java.util.Scanner;
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("¿Qué nota has sacado en el primer examen?");
    double notaUno;
    notaUno=s.nextDouble();
    System.out.println("¿Qué nota has sacado en el segundo examen?");
    double notaDos;
    notaDos=s.nextDouble();
    System.out.println("¿Y en el tercer examen?");
    double notaTres;
    notaTres=s.nextDouble();
    System.out.println("Tu media de los tres exámentes es: " + ((notaUno+notaDos+notaTres)/3));
  }
}
