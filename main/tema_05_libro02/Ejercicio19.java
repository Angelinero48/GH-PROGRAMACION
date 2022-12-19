package tema_05_libro02;

/**
 * @author Angel Linero Cano
 * programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 */
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura= s.nextInt();
    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();
    int planta=1;
    int longitudLin=1;
    int espacios = altura-1;
    while (planta <= altura){
      for (int i = 1; i <= espacios; i++){
        System.out.print(" ");

      }
      for (int i = 1; i <= longitudLin; i++) {
        System.out.print(relleno);
      }
      System.out.println();
      planta++;
      espacios--;
      longitudLin += 2;
    }
  }
}



