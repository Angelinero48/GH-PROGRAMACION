package tema_04;
import java.util.Scanner;
public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("¿Qué idioma se habla en España?");
    String idioma;
    idioma=s.nextLine();
    if (idioma.equals("español")){
      System.out.println("¡La respuesta es correcta!");
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta");
    }
  }

}
