package prueba;
/**
 * @author Ángel Linero Cano
 * Realizar un programa que nos pregunte el día, mes y año de nacimiento y lo muestre por pantalla.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    String dia;
    System.out.println("Dime tu dia de nacimiento: ");
    dia= System.console().readLine();
    int dian;
    dian = Integer.parseInt(dia);
    String mes;
    System.out.println("Ahora dime tu mes, escrito (Ej: Mayo)");
    mes= System.console().readLine();
    String linea;
    System.out.println("Y por último tu año, con números");
    linea=System.console().readLine();
    int ano;
    ano=Integer.parseInt(linea);
    System.out.println("Mi fecha de nacimiento es: " + dian + "de" + mes + "del" + ano);
  }
}
