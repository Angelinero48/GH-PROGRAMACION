package tema_03;

public class Ejercicio01 {
    public static void main(String[] args) {
        /**
         * @author Ángel Linero Cano
         * Pedir por pantalla 2 números y calcular su multiplicación.
         */
        String linea;
        System.out.print("Por favor, introduce un número: ");
        linea = System.console().readLine();
        int primernum;
        primernum = Integer.parseInt(linea);
        System.out.print("A continuación, introduzca otro número: ");
        linea = System.console().readLine();
        int segundonum;
        segundonum = Integer.parseInt(linea);
        int mult;
        mult = primernum * segundonum;
        System.out.println("El primer número que introdujo fue " + primernum + ", el segundo número fue " + segundonum + ", y su multiplicación es: " + mult);
    }
}
