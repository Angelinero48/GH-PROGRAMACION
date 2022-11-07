package tema_02;

import java.sql.SQLOutput;

public class Conversion {
    public static void main(String[] args) {
        /**
         * @author Ángel Linero Cano
         * Probar diferentes formas de conversiones.
         */
        int x = 2;
        int y = 9;
        double division;
        division = (double) y / x;
        System.out.println("El resultado de la división es " + division);
        double division1 = y / x;
        System.out.println("El resultado de la división es " + division1);
        double division2 = (double) (y/x);
        System.out.println("El resultado de la división es " + division2);
    }
}
