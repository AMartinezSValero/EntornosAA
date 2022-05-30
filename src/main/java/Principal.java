import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = true;
        System.out.println("----------------------------------------------------------------");
        System.out.println("-----------------------------Menu-------------------------------");
        System.out.println("----------------------------------------------------------------");
        do {
            System.out.println("Introduce un número según la opción que desees realizar");
            System.out.println("1.- Registrar un nuevo Parking");
            System.out.println("2.- Registrar un nuevo Trabajador");
            System.out.println("3.- Registrar un nuevo Vehículo");
            System.out.println("7.- Salir");

            Integer eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    Parking parking = new Parking();
                    break;

                case 2:
                    Trabajador trabajador = new Trabajador();
                    break;

                case 3:
                    Vehiculo vehiculo = new Vehiculo();
                    break;

                case 7:
                    salir = false;
                    break;
                default:
                    System.out.println("Introduzca una opcion correcta");
            }
        } while (salir);
    }
}
