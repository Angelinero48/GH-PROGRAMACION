package tema_04_parte_04;
/**
 * @author Angel Linero Cano
 */
import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a jugar al famoso jeugo: Piedra, papel o tijera");
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada1 = s.next();
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada2 = s.next();
    if (jugada1.equals(jugada2)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch (jugada1) {
        case "piedra":
          if (jugada2.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (jugada2.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (jugada2.equals("papel")) {
            ganador = 1;
          }
          break;
      }
      System.out.println("El ganador es...........");
      System.out.println("..............");
      System.out.println("Con ustedes el mejor jugador de este juego y por supuesto el claro ganador...");
      System.out.println(" " + ganador);

    }
  }
  }
