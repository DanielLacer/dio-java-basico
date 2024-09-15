import java.util.Stack;

public class Main {

    public static void main(String args[]){

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());

    }

}

/*
 
    A classe Stack em Java herda da classe Vector, o que significa que ela possui todos os métodos de Vector, além dos métodos específicos de Stack. 
    Aqui estão alguns métodos adicionais que você pode usar para manipular uma Stack:

    Métodos da Classe Stack

        push(E item): Adiciona um item ao topo da pilha.
        pop(): Remove e retorna o item no topo da pilha.
        peek(): Retorna o item no topo da pilha sem removê-lo.
        empty(): Verifica se a pilha está vazia.
        search(Object o): Retorna a posição de um objeto na pilha, contando a partir do topo (1 é o topo). Retorna -1 se o objeto não for encontrado.

    Métodos Herdados da Classe Vector

        add(int index, E element): Insere o elemento na posição especificada.
        add(E e): Adiciona o elemento ao final da pilha.
        remove(int index): Remove o elemento na posição especificada.
        get(int index): Retorna o elemento na posição especificada.
        set(int index, E element): Substitui o elemento na posição especificada pelo elemento fornecido.
        size(): Retorna o número de elementos na pilha.
        clear(): Remove todos os elementos da pilha.
        contains(Object o): Verifica se a pilha contém o objeto especificado.
        indexOf(Object o): Retorna o índice da primeira ocorrência do objeto especificado.
        lastElement(): Retorna o último elemento da pilha.
        firstElement(): Retorna o primeiro elemento da pilha.
        clone(): Cria uma cópia da pilha.
 
 */