package tema_04;

/**
 * @author Ángel Linero Cano
 * Realizar un programa que nos de la media de tres examenes y nos diga si es insuficiente, suficiente, bien, notable o sobresaliente
 */
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("¿Qué nota has sacado en el primer examen?");
    double notaUno;
    notaUno = s.nextDouble();
    System.out.println("¿Qué nota has sacado en el segundo examen?");
    double notaDos;
    notaDos = s.nextDouble();
    System.out.println("¿Y en el tercer examen?");
    double notaTres;
    notaTres = s.nextDouble();
    double notaTotal;
    notaTotal=(notaUno + notaDos + notaTres) / 3;
    if ((notaTotal>0)&&(notaTotal<5)) {
      System.out.println("Tu media es un: " + notaTotal +  " || Insuficiente");
    }
    if ((notaTotal>=5)&&(notaTotal<6)){
      System.out.println("Tu media es un: " + notaTotal +  " || Suficiente");
    }
    if ((notaTotal>=6)&&(notaTotal<7)) {
      System.out.println("Tu media es un: " + notaTotal + " || Bien");
    }
    if ((notaTotal>=7)&&(notaTotal<9)){
      System.out.println("Tu media es un: " + notaTotal +  " || Notable");;
    }
    if ((notaTotal>=9)&&(notaTotal<=10)){
      System.out.println("Tu media es un: " + notaTotal +  " || Sobresaliente");
    }
  }
}
