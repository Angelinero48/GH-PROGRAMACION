package tema_03;

public class Ejercicio02 {
    public static void main(String[] args) {
        /**
         * @author Ángel Linero Cano
         * Conversor de euros a pesetas, introduciendo los euros por teclado
         */
        String linea;
        System.out.println("Dime la cantidad de euros que quieres convertir a pesetas: ");
        linea = System.console().readLine();
        double euros;
        euros = Double.parseDouble(linea);
        int conv;
        conv = (int)(euros * 166.386);
        System.out.println("La cantidad de " + euros + " euros, hacen un total de: " + conv + " pesetas");
    }
}
