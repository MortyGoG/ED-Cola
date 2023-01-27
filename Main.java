import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Cola c1 = new Cola(10);
        try (Scanner op = new Scanner(System.in)) {
            int opcion, dato;
            dato = 0;
            try (Scanner scanner = new Scanner(System.in)) {
                do {
                    System.out.println("Opciones. ");
                    System.out.println("1. Encolar un elemento (ENQUEUE) ");
                    System.out.println("2. Desencolar un elemento (DEQUEUE)");
                    System.out.println("3. Mostrar frente (Peek)");

                    opcion = op.nextInt();

                    switch (opcion) {
                        case 1:
                            try {
                                System.out.println("Introduce el dato a encolar: ");
                                dato = op.nextInt();
                                c1.Encolar(dato);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("Presione Enter...");
                            scanner.nextLine();
                            break;
                        case 2:
                            try {
                                System.out.println("El elemento Desencolado es: " + c1.Desencolar());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("Presione Enter...");
                            scanner.nextLine();
                            break;
                        case 3:
                            try {
                                System.out.println("El frente es: " + c1.peek());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("Presione Enter...");
                            scanner.nextLine();
                        default:
                            System.out.println("\nIngrese una opcion valida. ");
                    }
                } while (opcion != 5);
            }
        }

    }
}
