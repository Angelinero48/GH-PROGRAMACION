package tema_04;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Crear una ruta entre dos ciudades, y el usuario puede elegir montarse en cualquier ciudad que este entre estas dos
 */
public class CircuitoCiudades {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("¡Bienvenido a la ruta de interior que conecta Málaga y Ciudad Real! \nPulsa intro para acceder al menú.");
    String intro;
    intro=s.nextLine();
    System.out.println("Estas son las estaciones disponibles para montarse al tren: \n 1- Málaga \n 2- Granada \n 3- Jaén");
    System.out.println("¿En qué estacion desea montarse? (Introduce el numero de la ciudad): ");
    int ciudad;
    ciudad=s.nextInt();
    System.out.println("Las localidades que usted va a visitar son las siguientes: ");
    switch (ciudad){
      case 1:
        System.out.println("- De la zona de Málaga pasariamos por: Málaga Capital, Casabermeja, Villanueva del Trabuco, Archidona.");
      case 2:
        System.out.println("- De la parte de Granada cruzaríamos: Loja, Santa Fe, Granada capital y Piñar. ");
      case 3:
        System.out.println("- De la zona de Jaén atravesamos: Huelma, Jaén Capital, Baeza y Linares");
        System.out.println("- Y hasta llegar a Ciuad Real pasaríamos por: Puerto Llano, Almagro y terminaríamos en Ciudad Real. ");
    }
  }
}
