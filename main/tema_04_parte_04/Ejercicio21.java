package tema_04_parte_04;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("¿Cuánto has sacado en el primer examen?: ");
    double notaUno;
    notaUno=s.nextDouble();
    System.out.println("¿Y en el segundo examen?: ");
    double notaDos;
    notaDos=s.nextDouble();
    double media;
    media=(notaUno+notaDos)/2;
    if (media>=5){
      System.out.println("¡Enhorabuena, has aprobado! Tu media es: " + media);
    }
    if (media<5){
      System.out.println("¿Cuál ha sido tu resultado en la recuperación? Responde con Apto/No apto: ");
      String resultado;
      resultado=s.next();
      if ("Apto".equals(resultado)){
        System.out.println("¡Enhorabuena, tu media es un 5.");
      }
      if("No".equals(resultado)){
        System.out.println("Lo siento, tu media es " + media);
      }
    }
  }
}
