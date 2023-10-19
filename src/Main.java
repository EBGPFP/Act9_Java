import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Crear dos objetos Perro
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        // Capturar datos para el primer perro
        System.out.println("Datos del primer perro\n");
        System.out.print("Nombre del primer perro: ");
        String nombrePerro1 = lectura.nextLine();
        perro1.setNombre(nombrePerro1);

        System.out.print("Raza del primer perro: ");
        String razaPerro1 = lectura.nextLine();

        boolean validRaza1 = false;
        while (!validRaza1) {
            if (!razaPerro1.matches(".*\\d.*")) {
                perro1.setRaza(razaPerro1);
                validRaza1 = true;
            } else {
                System.out.println("Error: La raza no debe contener números.");
                System.out.print("Raza del primer perro: ");
                razaPerro1 = lectura.nextLine();
            }
        }

        System.out.print("Edad del primer perro: ");
        boolean validEdad1 = false;
        int edadPerro1;

        while (!validEdad1) {
            try {
                edadPerro1 = Integer.parseInt(lectura.nextLine());
                perro1.setEdad(edadPerro1);
                validEdad1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: La edad debe ser un número entero.");
                System.out.print("Edad del primer perro: ");
            }
        }

        System.out.print("Tipo de comida que consumirá el primer perro: ");
        String tipoComidaPerro1 = lectura.nextLine();

        double cantidadGramosPerro1 = 0;

        boolean validCantidad1 = false;
        while (!validCantidad1) {
            try {
                System.out.print("Cantidad en gramos que consumirá el primer perro: ");
                cantidadGramosPerro1 = Double.parseDouble(lectura.nextLine());
                validCantidad1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: La cantidad debe ser un número válido.");
            }
        }

        // Capturar datos para el segundo perro
        System.out.println("\nDatos del segundo perro\n");
        System.out.print("Nombre del segundo perro: ");
        String nombrePerro2 = lectura.nextLine();
        perro2.setNombre(nombrePerro2);

        System.out.print("Raza del segundo perro: ");
        String razaPerro2 = lectura.nextLine();

        boolean validRaza2 = false;
        while (!validRaza2) {
            if (!razaPerro2.matches(".*\\d.*")) {
                perro2.setRaza(razaPerro2);
                validRaza2 = true;
            } else {
                System.out.println("Error: La raza no debe contener números.");
                System.out.print("Raza del segundo perro: ");
                razaPerro2 = lectura.nextLine();
            }
        }

        System.out.print("Edad del segundo perro: ");
        boolean validEdad2 = false;
        int edadPerro2;

        while (!validEdad2) {
            try {
                edadPerro2 = Integer.parseInt(lectura.nextLine());
                perro2.setEdad(edadPerro2);
                validEdad2 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: La edad debe ser un número entero.");
                System.out.print("Edad del segundo perro: ");
            }
        }

        System.out.print("Tipo de comida que consumirá el segundo perro: ");
        String tipoComidaPerro2 = lectura.nextLine();

        double cantidadGramosPerro2 = 0;

        boolean validCantidad2 = false;
        while (!validCantidad2) {
            try {
                System.out.print("Cantidad en gramos que consumirá el segundo perro: ");
                cantidadGramosPerro2 = Double.parseDouble(lectura.nextLine());
                validCantidad2 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: La cantidad debe ser un número válido.");
            }
        }

        // Llamar a los métodos de los perros
        System.out.println("\nInformación del primer perro:");
        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza: " + perro1.getRaza());
        System.out.println("Edad: " + perro1.getEdad());
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());
        perro1.comer(tipoComidaPerro1, cantidadGramosPerro1);

        System.out.println("\nInformación del segundo perro:");
        System.out.println("Nombre: " + perro2.getNombre());
        System.out.println("Raza: " + perro2.getRaza());
        System.out.println("Edad: " + perro2.getEdad());
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
        perro2.comer(tipoComidaPerro2, cantidadGramosPerro2);

        lectura.close();
    }
}
