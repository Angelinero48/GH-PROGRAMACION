public class Ejercicio05 {
	public static void main(String[] args) {
		// @author Ángel Linero Cano
		// Conversor de pesetas a euros
		double euros;
		double pesetas;
		double conv;
		euros = 166.3860;
		pesetas = 6000;
		conv = pesetas / euros;
		System.out.printf("%.2f pesetas serían %.2f euros", pesetas, conv);
	}
}
