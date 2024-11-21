// Clase base llamada Animal
class Animal {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método hacerSonido() que será sobrescrito por las subclases
    public String hacerSonido() {
        return "Sonido desconocido";
    }
}

// Subclase Perro que sobrescribe el método hacerSonido
class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }


    public String hacerSonido() {
        return "El perro ladra: ¡Guau, guau!";
    }
}

// Subclase Gato que sobrescribe el método hacerSonido
class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public String hacerSonido() {
        return "El gato maúlla: ¡Miau!";
    }
}

