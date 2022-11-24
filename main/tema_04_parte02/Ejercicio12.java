package tema_04_parte02;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Realizar un cuestionario de 10 preguntas, cada respuesta acertada es un punto.
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Hola y bienvenido al cuestionario de 1º de DAM. \nTu nota saldrá automaticamente al final del cuestionario \nCuando estés listo, pulsa intro para empezar.");
    String empezar;
    empezar=s.nextLine();
    System.out.println("Aquí vamos con la primera pregunta\n\n");
    int nota;
    nota = 0;
    System.out.println("1. La variable para almacenar numeros enteros es: \na) double \nb) int \nc) char \nd) String");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaUno;
    respuestaUno = s.nextLine();
    if ("b".equals(respuestaUno)) {
      nota++;
    }
    System.out.println("2. ¿Qué tenemos que utilizar en una concatenacion para que la suma de char no nos de un entero?: \na) Dobles comillas \nb) Comillas simples \nc) Da igual, se suman los caracteres solos \nd) // ");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaDos;
    respuestaDos = s.nextLine();
    if ("a".equals(respuestaDos)) {
      nota++;
    }
    System.out.println("3. ¿Se puede empezar una variable por mayúscula según el estandar de Google?: \na) Si \nb) No");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaTres;
    respuestaTres = s.nextLine();
    if ("b".equals(respuestaTres)) {
      nota++;
    }
    System.out.println("4. ¿Qué etiqueta se utiliza para poner un párrafo en html?: \na) <p> \nb) <h1> \nc) <h2> \nd) <prf>");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaCuatro;
    respuestaCuatro = s.nextLine();
    if ("a".equals(respuestaCuatro)) {
      nota++;
    }
    System.out.println("5. ¿Para que sirve la etiqueta <h1>?: \na) Para poner un espacio \nb) No existe esta etiqueta \nc) Para añadir una altura de píxeles \nd) Para poner un encabezado");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaCinco;
    respuestaCinco = s.nextLine();
    if ("d".equals(respuestaCinco)) {
      nota++;
    }
    System.out.println("6. ¿Es cierto que una Entidad tiene que ser un verbo?: \na) Si \nb) No");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaSeis;
    respuestaSeis = s.nextLine();
    if ("b".equals(respuestaSeis)) {
      nota++;
    }
    System.out.println("7. ¿Cómo se llama el atributo que no se puede repetir? \na) Atributo principal \nb) Clave Foránea \nc) Clave principal \nd) Clave Not Null");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaSiete;
    respuestaSiete = s.nextLine();
    if ("c".equals(respuestaSiete)) {
      nota++;
    }
    System.out.println("8. ¿Puede un procesador tener grafica incluida en él?: \na) Si \nb) No");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaOcho;
    respuestaOcho = s.nextLine();
    if ("a".equals(respuestaOcho)) {
      nota++;
    }
    System.out.println("9. Es necesario crear una tabla intermedia, cuando la relación es de muchos a muchos: \na) Falso \nb) Verdadero");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaNueve;
    respuestaNueve = s.nextLine();
    if ("b".equals(respuestaNueve)) {
      nota++;
    }
    System.out.println("10. La palabra -casa-, ¿En que variable podríamos almacenarla? : \na) String \nb) char \nc) float \nd) double ");
    System.out.println("Tu respuesta es (Introduce la letra de la respuesta correcta): ");
    String respuestaDiez;
    respuestaDiez = s.nextLine();
    if ("a".equals(respuestaDiez)) {
      nota++;
    }
    if (nota>=5) {
      System.out.println("Tu nota es: " + nota + "/10 \n¡Enhorabuena, has aprobado!");
    }else {
      System.out.println("Tu nota es: " + nota + "/10 \nLo siento, no has superado la prueba.");
    }
  }
}

