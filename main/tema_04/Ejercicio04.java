package tema_04;

/**
 * @author Ángel Linero Cano
 * Crear un programa que calcule el salario semanal de un trabajador.
 */
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("¿Cuántas horas has trabajado esta semana?: ");
    int horas;
    horas=s.nextInt();
    if ((horas>0)&&(horas<40)){
      System.out.println("Tu salario esta semana es de : " + horas * 12+" euros");
    } else {
      System.out.println("Tu salario esta semana es de :" + horas*16 + " euros");
    }
  }

}
