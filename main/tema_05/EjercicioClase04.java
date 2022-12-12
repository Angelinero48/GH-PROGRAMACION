package tema_05;

/**
 * @author Angel Linero Cano
 */
public class EjercicioClase04 {
  public static void main(String[] args) {
    int sump;
    sump=100;
    for(int a=100;a<200;a=a+2){
      sump=sump+a;
    }
    System.out.println("La suma de los positivos es: "+sump);
    int sumn;
    sumn=101;
    for(int cont=101;cont<200;cont=cont+2){
      sumn=sumn+cont;
    }
    System.out.println("La suma de los negativos es: "+sumn);
  }
}
