package tema_04_parte_04;

/**
 * @author Angel Linero Cano
 */
import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println("¡Vamos a crear tu bandera y personalizarla! \nSigue los pasos que se muestran a continuación.");
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = s.nextInt();
    System.out.print("Ahora, la anchura: ");
    int anchura = s.nextInt();
    System.out.print("¿Quiere escudo bordado?(Responde con si o no): ");
    boolean conEscudo = ((s.next()).toLowerCase()).equals("si");
    String escudo;
    double precioEscudo;
    if (conEscudo) {
      escudo = "Con escudo";
      precioEscudo = 2.50;
    }else {
      escudo = "Sin escudo";
      precioEscudo = 0;
    }
    System.out.println("Aqui tiene los datos que usted ha seleccionado.");
    System.out.printf("Bandera de %3d cm2: %5.2f €\n", anchura * altura, (double)anchura * altura / 100);
    System.out.printf("%s: %3.2f €\n", escudo, precioEscudo);
    System.out.printf("Gastos de envío: %3.2f €\n", 3.25);
    System.out.printf("Total: %3.2f €\n", (double)anchura * altura / 100 + precioEscudo + 3.25);

  }
}
