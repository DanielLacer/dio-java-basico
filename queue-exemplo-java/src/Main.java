import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String args[]){

        Queue<Carro> queueCarros = new LinkedList<Carro>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros.add(new Carro("Peugeot"))); // IllegalStateException
        System.out.println(queueCarros);

        System.out.println(queueCarros.element()); // Retorna o primeiro elemento (Ford)

        System.out.println(queueCarros.offer(new Carro("Renault"))); // Adiciona Renault ao final da fila
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); // Retorna o primeiro elemento (Ford) sem remover
        System.out.println(queueCarros);

        System.out.println(queueCarros.remove()); // Remove e retorna o primeiro elemento (Ford)
        System.out.println(queueCarros);

        System.out.println(queueCarros.size()); // Retorna o tamanho da fila
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // Remove e retorna o primeiro elemento (Chevrolet)
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); // Verifica se a fila está vazia
    }
}

/*
 
    Resumo dos Métodos
    add: Insere um elemento, lança exceção se falhar.
    offer: Insere um elemento, retorna false se falhar.
    remove: Remove e retorna o primeiro elemento, lança exceção se vazio.
    poll: Remove e retorna o primeiro elemento, retorna null se vazio.
    element: Retorna o primeiro elemento sem remover, lança exceção se vazio.
    peek: Retorna o primeiro elemento sem remover, retorna null se vazio.
    isEmpty: Verifica se a fila está vazia.
    size: Retorna o número de elementos na fila.
 
 */