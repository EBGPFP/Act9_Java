public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(String tipoComida, double cantidadGramos) {
        // Aquí puedes implementar la lógica de alimentación del perro.
        System.out.println(nombre + " está comiendo " + tipoComida + " en cantidad de " + cantidadGramos + " gramos.");
    }

    public String ladrar() {
        return "Guau Guau";
    }
}