import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]){
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }

}

/*

    HashSet

        Implementação: Baseado em uma tabela hash.
        Ordenação: Não mantém a ordem dos elementos.
        Desempenho: Operações como add, remove e contains têm desempenho constante (O(1)) na média.
        Duplicatas: Não permite elementos duplicados.
        Null: Permite elementos null.

    TreeSet

        Implementação: Baseado em uma árvore de busca binária auto-balanceada (Red-Black Tree).
        Ordenação: Mantém os elementos ordenados de acordo com a ordem natural ou um comparador fornecido.
        Desempenho: Operações como add, remove e contains têm desempenho O(log n).
        Duplicatas: Não permite elementos duplicados.
        Null: Não permite elementos null.

    ArrayList

        Implementação: Baseado em um array dinâmico.
        Ordenação: Mantém a ordem de inserção dos elementos.
        Desempenho: Operações como add e get têm desempenho constante (O(1)), mas remove e contains têm desempenho O(n) na média.
        Duplicatas: Permite elementos duplicados.
        Null: Permite elementos null.

    Comparação

        Ordenação: HashSet não mantém ordem, TreeSet mantém ordem natural ou definida por comparador, ArrayList mantém ordem de inserção.
        Desempenho: HashSet é mais rápido para operações básicas na média, TreeSet é mais lento devido à ordenação, ArrayList tem desempenho variável dependendo da operação.
        Uso de Memória: HashSet e TreeSet podem ser mais eficientes em termos de memória para grandes conjuntos de dados comparados ao ArrayList.

    Implementação da Interface Comparable para TreeSet

        A razão pela qual você precisou implementar a interface Comparable na sua classe Carro ao usar um TreeSet é que o TreeSet precisa saber como ordenar os elementos. 
        O TreeSet usa o método compareTo para determinar a ordem dos elementos. 
        Mesmo que você não esteja explicitamente pedindo para comparar, o TreeSet faz isso internamente para manter a ordem dos elementos.
 
 */

