package tema_03;

public class Ejercicio03 {
    public static void main(String[] args) {
        String linea;
        System.out.println("Escribe la cantidad de pesetas que quieres pasar a euros: ");
        linea = System.console().readLine();
        int pesetas;
        pesetas = Integer.parseInt(linea);
        double conv;
        conv = pesetas/166.386;
        System.out.printf("La cantidad de %d pesetas, da un total de: %.2f euros", pesetas, conv);
    }
}
