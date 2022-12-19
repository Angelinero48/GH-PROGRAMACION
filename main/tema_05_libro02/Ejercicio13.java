package tema_05_libro02;
/**
 * @author Ángel Linero Cano
 */
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce 10 numeros enteros: ");
    int contp;
    contp=0;
    int contn;
    contn=0;
    for(int a=0;a<10;a++){
      if(s.nextInt()<0){
        contn++;
      }else{contp++;
      }
    }
    System.out.println("Ha introducido "+contp+" números positivos y " + contn + " números negativos");
  }
}
