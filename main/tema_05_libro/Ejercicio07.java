package tema_05_libro;
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int intentos = 4;
    int combinacion;
    boolean acertado = false;

    do {
      System.out.print("Introduzca la combinación: ");
      combinacion=s.nextInt();
      if (combinacion == 4848) {
        acertado = true;
      } else {
        System.out.println("Lo sentimos, esta no es la combinación.");
      }
      intentos--;
    } while((intentos > 0) && (!acertado));
    if (acertado) {
      System.out.println("La caja fuerte ha sido abierta.");
    } else {
      System.out.println("Se acabaron las oportunidades");
    }
  }
}
