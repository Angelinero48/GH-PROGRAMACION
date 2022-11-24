package tema_04_parte02;
import java.util.Scanner;

/**
 * @author Ángel Linero Cano
 * Programa que según tu dia y mes de nacimiento, te de tu horóscopo.
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Vamos a ver cual es tu horóscopo, introduce tu mes de nacimiento (1-12): ");
    int mes;
    mes=s.nextInt();
    System.out.println("Y ahora tu día de nacimiento: ");
    int dia;
    dia=s.nextInt();
    switch (mes){
      case 1:
        if (dia<20){
          System.out.println("Tu horóscopo es Sagitario");
        }else{
          System.out.println("Tu horóscopo es Capricornio");
        }
        break;
      case 2:
        if (dia<16){
          System.out.println("Tu horóscopo es Capricornio");
        }else{
          System.out.println("Tu horóscopo es Acuario");
        }
        break;
      case 3:
        if (dia<11){
          System.out.println("Tu horóscopo es Acuario");
        }else{
          System.out.println("Tu horóscopo es Piscis");
        }break;
      case 4:
        if (dia<18){
          System.out.println("Tu horóscopo es Piscis");
        }else{
          System.out.println("Tu horóscopo es Aries");
        }break;
      case 5:
        if (dia<13){
          System.out.println("Tu horóscopo es Aries");
        }else{
          System.out.println("Tu horóscopo es Tauro");
        }break;
      case 6:
        if (dia<21){
          System.out.println("Tu horóscopo es Tauro");
        }else{
          System.out.println("Tu horóscopo es Géminis");
        }break;
      case 7:
        if (dia<20){
          System.out.println("Tu horóscopo es Géminis");
        }else {
          System.out.println("Tu horóscopo es Cáncer");
        }break;
      case 8:
        if (dia<10){
          System.out.println("Tu horóscopo es Cáncer");
        }else{
          System.out.println("Tu horóscopo es Leo");
        }break;
      case 9:
        if(dia<16){
          System.out.println("Tu horóscopo es Leo");
        }else{
          System.out.println("Tu horóscopo es Virgo");
        }break;
      case 10:
        if (dia<30){
          System.out.println("Tu horóscopo es Virgo");
        }else {
          System.out.println("Tu horóscopo es Libra");
        }break;
      case 11:
        if (dia<23){
          System.out.println("Tu horóscopo es Libra");
        }else{
          System.out.println("Tu horóscopo es Escorpio");
        }break;
      case 12:
        if(dia<29){
          System.out.println("Tu horóscopo es Escorpio");
        }else{
          System.out.println("Tu horóscopo es Ofiuco");
        }break;
    }

  }
}
