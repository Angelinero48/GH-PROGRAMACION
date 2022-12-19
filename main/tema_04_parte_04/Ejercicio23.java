package tema_04_parte_04;

/**
 * @author Angel Linero Cano
 */
import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.print("Introduzca el precio base del producto(sin iva): ");
    double baseImponible=s.nextInt();
    System.out.print("Introduzca el tipo de iva (general,reducido o superreducido): ");
    String tipoIva =s.next();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoProm=s.next();
    int tipoIVANum = 0;
    switch(tipoIva) {
      case "general":
        tipoIVANum = 21;
        break;
      case "reducido":
        tipoIVANum = 10;
        break;
      case "superreducido":
        tipoIVANum = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    double iva = baseImponible * tipoIVANum / 100;
    double precioNoDes = baseImponible + iva;

    double descuento = 0;
    switch(codigoProm) {
      case "nopro" :
        break;
      case "mitad" :
        descuento = precioNoDes/ 2;
        break;
      case "meno5":
        descuento=5;
        break;
      case "5porc":
        descuento=precioNoDes* 0.05;
        break;
    }
    double total = precioNoDes - descuento;
    System.out.printf("Base imponible %5.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%) %5.2f\n", tipoIVANum, iva);
    System.out.printf("Precio con IVA %5.2f\n", precioNoDes);
    System.out.printf("Cód. promo. (%6s) -%5.2f\n", codigoProm, descuento);
    System.out.printf("TOTAL %6.2f", total);
    }
}
