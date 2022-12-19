package tema_05_libro_03;

/**
 * @author Angel Linero Cano
 * Programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo
 */
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce números separados por un espacio. Para parar introduce un número negativo: ");
    int num;
    num = s.nextInt();
    int i;
    do {
      i = 0;
      i++;
    } while (num > 0);
    System.out.println(i);
  }
}
