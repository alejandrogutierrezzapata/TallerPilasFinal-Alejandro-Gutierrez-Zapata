import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilaMod = new Stack<>();
        Stack<Double> pilaRaices = new Stack<>();

        System.out.print("Ingrese la cantidad de elementos en la pila: ");
        int n = sc.nextInt();

        System.out.println("Ingrese los elementos de la pila: ");
        for (int i = 0; i < n; i++) {
            pila.push(sc.nextInt());
        }

        System.out.println("Pila original: " + pila);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n---Menú de Pilas---");
            System.out.println("1. Reemplazar números negativos por 0");
            System.out.println("2. Reemplazar números entre 8 y 20 por 50");
            System.out.println("3. Reemplazar números mayores a 60 y menores a 62 por 100");
            System.out.println("4. Calcular raíz cuadrada de cada elemento");
            System.out.println("5. Mostrar pila modificada");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    pilaMod = Metodos.modificarPila(pila, 1);
                    System.out.println("Números negativos reemplazados por 0.");
                    break;

                case 2:
                    pilaMod = Metodos.modificarPila(pila, 2);
                    System.out.println("Números entre 8 y 20 reemplazados por 50.");
                    break;

                case 3:
                    pilaMod = Metodos.modificarPila(pila, 3);
                    System.out.println("Números mayores a 60 y menores a 62 reemplazados por 100.");
                    break;

                case 4:
                    Metodos.calcularRaices(pilaMod, pilaRaices);
                    System.out.println("Raíces cuadradas calculadas: " + pilaRaices);
                    break;

                case 5:
                    System.out.println("Pila modificada: " + pilaMod);
                    break;

                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

    }
}
