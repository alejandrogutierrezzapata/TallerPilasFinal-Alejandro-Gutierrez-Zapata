import java.util.Stack;

public class Metodos {

    public static Stack<Integer> modificarPila(Stack<Integer> pila, int op) {
        Stack<Integer> pilaAux = new Stack<>();
        for (int numero : pila) {
            if (op == 1 && numero < 0) {
                pilaAux.push(0);
            } else if (op == 2 && numero >= 8 && numero <= 20) {
                pilaAux.push(50);
            } else if (op == 3 && numero > 60 && numero < 62) {
                pilaAux.push(100);
            } else {
                pilaAux.push(numero);
            }
        }
        return pilaAux;
    }

    public static void calcularRaices(Stack<Integer> pila, Stack<Double> pilaRaices) {
        pilaRaices.clear();
        for (int numero : pila) {
            pilaRaices.push(Math.sqrt(numero));
        }
    }
}

