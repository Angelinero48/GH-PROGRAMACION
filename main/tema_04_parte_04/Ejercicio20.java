package tema_04_parte_04;
/**
 * @author Ángel Linero Cano
 *
 */
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    int num;
    boolean capicua = false;
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    num = s.nextInt();
    if (num < 10) {
      capicua = true;
    }
    if ((num>= 10) && (num<100)) {
      if ((num/10)==(num %10)) {
        capicua = true;
      }
    }
    if ((num>=100)&& (num< 1000)){
      if ((num /100) ==(num %10)){
        capicua=true;
      }
    }
    if ((num>=1000) &&(num<10000)){
      if (((num/1000)==(num % 10)) && (((num /100)%10)== ((num /10)%10))){
        capicua = true;
      }
    }
    if (num >= 10000){
      if (((num/10000)==(num%10))&&((((num/1000)% 10))==((num/10)%10))) {
        capicua = true;
      }
    }
    if (capicua) {
      System.out.println(num +" es capicúa.");
    } else {
      System.out.println(num+" no es capicúa.");
    }
    }
    }

