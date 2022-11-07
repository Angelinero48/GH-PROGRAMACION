package tema_02;

public class Ejercicio06 {
    public static void main (String[] args){
        /**
         * @author Ángel Linero Cano
         * Calcular el precio de un producto a partir de su precio sin iva.
         */
        double baseImponible;
        baseImponible= 30.56;
        double iva;
        iva= baseImponible * 0.21;
        int total;
        total=(int)(baseImponible + iva);
        System.out.println("La base imponible es " + baseImponible);
        System.out.println("EL iva de este producto es " + iva);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL: " + total);
    }
}
