package tema_04_parte03;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 *Crear una pirámide rellena con un simbolo elegido por el usuario y el vertice apuntado según lo elegido por el usuario también
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Introduce la letra o símbolo con la cual quieres que se rellene la pirámide: ");
    String r;
    r= s.nextLine();
    System.out.println("Vértices posibles: \n1- Arriba \n2- Abajo \n3- Derecha \n4- Izquierda");
    System.out.println("¿Hacia dónde quieres que apunte el vértice de la pirámide?(Introduce el numero): ");
    int vertice;
    vertice=s.nextInt();
    switch (vertice){
      case 1:
        System.out.println("   "+r);
        System.out.println("  "+r+r+r);
        System.out.println(" "+r+r+r+r+r);
        System.out.println(""+r+r+r+r+r+r+r);
      case 2:
        System.out.println(""+r+r+r+r+r+r+r);
        System.out.println(" "+r+r+r+r+r);
        System.out.println("  "+r+r+r);
        System.out.println("   "+r);
      case 3:
        System.out.println(""+r);
        System.out.println(""+r+r+r);
        System.out.println(""+r+r+r+r);
        System.out.println(""+r+r+r+r+r+r);
        System.out.println(""+r+r+r+r);
        System.out.println(""+r+r+r);
        System.out.println(""+r);
      case 4:
        System.out.println("   "+r+r);
        System.out.println("  "+r+r+r);
        System.out.println(" "+r+r+r+r);
        System.out.println(""+r+r+r+r+r);
        System.out.println(" "+r+r+r+r);
        System.out.println("  "+r+r+r);
        System.out.println("   "+r+r);
    }
  }
}
