package tema_03_parte2;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Calcular salario semanal en base a las horas trabajadas
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("¿Cúantas horas ha trabajado esta semana?");
    int horas;
    horas= s.nextInt();
    int salario;
    salario= horas*12;
    System.out.println("Tu salario acorde a las horas es: " + salario + " euros");
  }
}
