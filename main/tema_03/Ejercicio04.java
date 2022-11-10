package tema_03;
/**
 * @author Ángel Linero Cano
 * Introducir dos numeros por teclado y realizar la suma, resta multiplicación y división de ambos
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    String linea;
    System.out.println("Introduce el primer número: ");
    linea = System.console().readLine();
    double primernum;
    primernum= Double.parseDouble(linea);
    System.out.println("Introduce el segundo número ");
    linea=System.console().readLine();
    double segundonum;
    segundonum= Double.parseDouble(linea);
    System.out.println("La suma de tus números es: " + (primernum+segundonum));
    System.out.println("La resta es: " + (primernum-segundonum));
    System.out.println("La multiplicación es: " + (primernum*segundonum) );
    System.out.println("Y la división: " + (primernum/segundonum));
  }
}
