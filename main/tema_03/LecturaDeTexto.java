package tema_03;

public class LecturaDeTexto {
    public static void main(String[] args) {
        /**
         * @author Ángel Linero Cano
         * Introducir por teclado nombres y apellido.
         */
        String nombre;
        System.out.println("Por favor, dime como te llamas: ");
        nombre = System.console().readLine();
        String apellidos;
        System.out.println("Introduce tambien tus apellidos: ");
        apellidos = System.console().readLine();
        System.out.println("Hola " + nombre + " " + apellidos + ", ¡Enacntado de conocerte!");

    }
}
