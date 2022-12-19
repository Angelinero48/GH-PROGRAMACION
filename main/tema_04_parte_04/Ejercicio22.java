package tema_04_parte_04;

/**
 * @author Angel Linero Cano
 */
import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String diaString = s.next();
    int dia = 0;
    switch(diaString) {
      case "lunes":
        dia= 0;
        break;
      case "martes":
        dia =1;
        break;
      case "miercoles":
        dia =2;
        break;
      case "jueves":
        dia= 3;
        break;
      case "viernes":
        dia=4;
        break;
    }
    System.out.println("A continuación introduzca la hora y minutos.");
    System.out.print("Hora: ");
    int horas;
    horas= s.nextInt();
    System.out.print("Minutos: ");
    int minutos;
    minutos=s.nextInt();
    int minutosTot = (4 * 24 * 60) + (15 * 60);
    int min = (dia * 24 * 60) + (horas * 60) + minutos;
    System.out.print("Quedan "+(minutosTot- min)+ " minutos para el fin de semana.");
    }
}
