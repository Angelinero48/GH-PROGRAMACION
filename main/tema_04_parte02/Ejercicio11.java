package tema_04_parte02;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Programa que dada una hora (En horas y minutos, nos diga los segundos que faltan para llegar a media noche.
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Introduce tu hora (horas y minutos, separados por un espacio): ");
    int hora;
    hora=s.nextInt();
    int minutos;
    minutos=s.nextInt();
    //pasamos estas horas y minutos a segundos, para poder hacer todas las operaciones más comodas.
    int horasseg;
    horasseg=hora * 3600;
    int minseg;
    minseg= minutos *60;
    int segundos;
    segundos=horasseg+minseg;
    int segundosdia;
    segundosdia=24*3600;
    int segrestantes;
    segrestantes=segundosdia - segundos;
    System.out.println("Dada tu hora, los segundo restantes hasta media noche son: " + segrestantes);
  }
}
