// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro miPerro = new Perro("Rex", 5);
        Gato miGato = new Gato("Señor Gato", 3);

        // Mostrar su nombre, edad y sonido usando los métodos heredados
        System.out.println("Perro:");
        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad());
        System.out.println("Sonido: " + miPerro.hacerSonido());

        System.out.println("\nGato:");
        System.out.println("Nombre: " + miGato.getNombre());
        System.out.println("Edad: " + miGato.getEdad());
        System.out.println("Sonido: " + miGato.hacerSonido());
    }
}
