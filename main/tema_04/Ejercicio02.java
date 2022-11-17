package tema_04;

/**
 * @author Ángel Linero Cano
 * Realizar un programa que al introducir la hora por teclado, nos diga buenos dias, buenas tardes o buenas noches
 */
import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce tu hora, con dos números (Ej: si son las seis de la mañana, deberas introducir 06): ");
    int hora;
    hora=s.nextInt();
    if ((hora>=06) && (hora<=12)){
      System.out.println("¡Buenos dias!");
    }
    if ((hora>=13)&&(hora<=20)){
      System.out.println("¡Buenas tardes!");
    }
    if ((hora>=21)&&(hora<=23) || (hora>=00)&&(hora<=05)){
      System.out.println("¡Buenas noches!");
    }
  }
}
