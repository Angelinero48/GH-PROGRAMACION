package tema_03_parte2;
/**
 * @author Ángel Linero Cano
 * Programa que segun tu nota en el primer examen y la que quieras sacar de final, te muestra la nota necesaria en el segundo examen
 *
 */

import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Introduce la nota del primer examen: ");
    double nota1;
    nota1= s.nextDouble();
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaFinal;
    notaFinal=s.nextDouble();
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
  }
}


