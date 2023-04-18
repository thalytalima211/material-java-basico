package filas;

public class main {
    public static void main(String[] args) {
        fila<String> minhaFila = new fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila+"\n");

        System.out.println(minhaFila.dequeue()+"\n");

        System.out.println(minhaFila+"\n");

        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila+"\n");

        System.out.println(minhaFila.first());
        System.out.println(minhaFila+"\n");

    }
}
