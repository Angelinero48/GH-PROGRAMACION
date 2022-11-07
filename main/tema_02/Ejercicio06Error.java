package tema_02;

public class Ejercicio06Error {
    public static void main(String[] args) {
        double baseImponible;
        baseImponible= 30.56;
        double iva;
        iva= baseImponible * 0.21;
        int total;
        total=(int)(baseImponible + iva);
        System.out.printf("La base imponible es %15.2f\n", baseImponible);
        System.out.printf("EL iva de este producto es %10.2f \n", iva);
        System.out.printf("-----------------------------------\n");
        System.out.printf("TOTAL: %27.2f", total);
    }
}
