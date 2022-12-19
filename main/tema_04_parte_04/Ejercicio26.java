package tema_04_parte_04;

/**
 * @author Angel Linero Cano
 */
import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Entradas para el Cine (CineCampa). \nSigue los pasos a continuación para obtener tus entradas.");
    System.out.print("Número de entradas: ");
    int entrada = s.nextInt();
    System.out.print("Día de la semana: ");
    String dia = s.next();
    System.out.print("¿Tiene la tarjeta del cine? (responde con si o no: ");
    boolean Tarjeta = ((s.next()).toLowerCase()).equals("si");
    int entradasUno = entrada;
    double precioEntradaUno = 8;
    int entradasDos = 0;
    double total = 0;
    double descuento = 0;
    double aPagar = 0;
    switch (dia) {
      case "miercoles":
        precioEntradaUno = 5;
      case "jueves":
        entradasDos = entrada / 2;
        entradasUno = entrada % 2;
    }
    total = precioEntradaUno * entradasUno;
    total += 11 * entradasDos;
    if(Tarjeta) {
      descuento = total * 0.1;
    }
    aPagar = total - descuento;
    System.out.println("Tus entradas: ");
    if (entradasDos > 0) {
      System.out.printf("Entradas de pareja %2d\n", entradasDos);
      System.out.printf("Precio por entrada de pareja %5.2f €\n", 11.0);
    }
    if (entradasUno > 0) {
      System.out.printf("Entradas individuales %2d\n", entradasUno);
      System.out.printf("Precio por entrada individual %5.2f €\n", precioEntradaUno);
    }
    System.out.printf("Total %3.2f €\n", total);
    System.out.printf("Descuento %3.2f €\n", descuento);
    System.out.printf("A pagar %3.2f €\n", aPagar);

    }
}
