import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Concesionario {
    private static List<CocheKm0> cochesKm0 = new ArrayList<>();
    private static List<CocheNuevo> cochesNuevos = new ArrayList<>();
    private static List<CocheSegundaMano> cochesSegundaMano = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú
            System.out.println("\nMenú:");
            System.out.println("1. Introducir coche Km0");
            System.out.println("2. Introducir coche Nuevo");
            System.out.println("3. Introducir coche de Segunda Mano");
            System.out.println("4. Ver coches de Km0");
            System.out.println("5. Ver coches Nuevos");
            System.out.println("6. Ver coches de Segunda Mano");
            System.out.println("7. Salir");

            // Elegir opción
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    introducirCocheKm0(scanner);
                    break;
                case 2:
                    introducirCocheNuevo(scanner);
                    break;
                case 3:
                    introducirCocheSegundaMano(scanner);
                    break;
                case 4:
                    verCochesKm0();
                    break;
                case 5:
                    verCochesNuevos();
                    break;
                case 6:
                    verCochesSegundaMano();
                    break;
                case 7:
                    continuar = false;
                    System.out.println("¡Gracias por usar el concesionario!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    // Métodos para introducir coches
    private static void introducirCocheKm0(Scanner scanner) {
        System.out.println("\nIntroduce los datos del coche Km0:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Kilómetros: ");
        int kilometros = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        CocheKm0 cocheKm0 = new CocheKm0(matricula, color, modelo, precio, kilometros);
        cochesKm0.add(cocheKm0);

        System.out.println("Coche Km0 añadido con éxito.");
    }

    private static void introducirCocheNuevo(Scanner scanner) {
        System.out.println("\nIntroduce los datos del coche Nuevo:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Kilómetros: ");
        int kilometros = scanner.nextInt();
        System.out.print("Garantía (meses): ");
        int garantia = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        CocheNuevo cocheNuevo = new CocheNuevo(matricula, color, modelo, precio, kilometros, garantia);
        cochesNuevos.add(cocheNuevo);

        System.out.println("Coche Nuevo añadido con éxito.");
    }

    private static void introducirCocheSegundaMano(Scanner scanner) {
        System.out.println("\nIntroduce los datos del coche de Segunda Mano:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Kilómetros: ");
        int kilometros = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Antiguo propietario: ");
        String antiguoPropietario = scanner.nextLine();

        CocheSegundaMano cocheSegundaMano = new CocheSegundaMano(matricula, color, modelo, precio, kilometros, antiguoPropietario);
        cochesSegundaMano.add(cocheSegundaMano);

        System.out.println("Coche de Segunda Mano añadido con éxito.");
    }

    // Métodos para ver coches
    private static void verCochesKm0() {
        if (cochesKm0.isEmpty()) {
            System.out.println("\nNo hay coches Km0 disponibles.");
        } else {
            System.out.println("\nCoches Km0 disponibles:");
            for (CocheKm0 coche : cochesKm0) {
                System.out.println(coche);
            }
        }
    }

    private static void verCochesNuevos() {
        if (cochesNuevos.isEmpty()) {
            System.out.println("\nNo hay coches Nuevos disponibles.");
        } else {
            System.out.println("\nCoches Nuevos disponibles:");
            for (CocheNuevo coche : cochesNuevos) {
                System.out.println(coche);
            }
        }
    }

    private static void verCochesSegundaMano() {
        if (cochesSegundaMano.isEmpty()) {
            System.out.println("\nNo hay coches de Segunda Mano disponibles.");
        } else {
            System.out.println("\nCoches de Segunda Mano disponibles:");
            for (CocheSegundaMano coche : cochesSegundaMano) {
                System.out.println(coche);
            }
        }
    }
}
