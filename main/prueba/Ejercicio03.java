package prueba;
/**
 * @author Ángel Linero Cano
 * Realizar un programa que te pregunte tu nombre y edad, y mostrarlo por pantalla
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    String nombre;
    System.out.println("Por favor, dime tu nombre y edad separados de un espacio: ");
    nombre = System.console().readLine();
    int edad;
    edad= Integer.parseInt(nombre);
    System.out.println("Mi nombre es: " + nombre + "y tengo " + edad + "años");
  }
}
