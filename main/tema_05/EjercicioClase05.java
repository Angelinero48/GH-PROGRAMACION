package tema_05;
/**
 * @author Angel Linero Cano
 */

import java.util.Scanner;

public class EjercicioClase05 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Vamos a calcular una potencia, para ello introduce la base: ");
    int base;
    base=s.nextInt();
    System.out.println("Y ahora el exponente: ");
    int exp;
    exp=s.nextInt();
    double pot;
    pot=1;
    if (exp>0){
      for(int i=0;i<exp;i++){
        pot *=base;
      }
    }
    if (exp<0){
      for(int i=0;i<-exp;i++){
        pot*=base;
      }
      pot=1/pot;
    }
    if(exp==0){
      pot=1;
    }
    System.out.println("Para la base "+base+"y el exponente: " + exp+"el resultado es: " + pot);
  }
}
