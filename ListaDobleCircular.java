public class ListaDobleCircular {
    private Nodo head;

    public ListaDobleCircular() {
        head = null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (head == null) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            head = nuevoNodo;
        } else {
            Nodo ultimo = head.anterior;

            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = ultimo;
            ultimo.siguiente = nuevoNodo;
            head.anterior = nuevoNodo;
            head = nuevoNodo;
        }
    }

    public void insertarFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (head == null) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            head = nuevoNodo;
        } else {
            Nodo ultimo = head.anterior;

            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = ultimo;
            ultimo.siguiente = nuevoNodo;
            head.anterior = nuevoNodo;
        }
    }

    public void eliminarInicio() {
        if (head == null) {
            System.out.println("Error: Lista vacía");
            return;
        }

        if (head.siguiente == head) {
            head = null;
        } else {
            Nodo ultimo = head.anterior;
            head = head.siguiente;
            head.anterior = ultimo;
            ultimo.siguiente = head;
        }
    }

    public void eliminarFinal() {
        if (head == null) {
            System.out.println("Error: Lista vacía");
            return;
        }

        if (head.siguiente == head) {
            head = null;
        } else {
            Nodo ultimo = head.anterior;
            Nodo penultimo = ultimo.anterior;
            penultimo.siguiente = head;
            head.anterior = penultimo;
        }
    }

    public boolean buscar(int valorBuscado) {
        if (head == null) {
            return false;
        }

        Nodo actual = head;

        do {
            if (actual.dato == valorBuscado) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != head);

        return false;
    }

    public void imprimir() {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = head;
        System.out.print("Lista: ");

        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        } while (actual != head);

        System.out.println("(circular -> " + head.dato + ")");
    }
}