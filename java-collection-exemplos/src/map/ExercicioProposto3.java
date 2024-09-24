import java.util.*;
import java.util.Map.Entry;

public class ExercicioProposto3 {

    public static void main(String[] args) {

        /*Dadas as seguintes informações  de id e contato, crie um dicionário e
        ordene este dicionário exibindo (nome id - nome contato);

        id = 1 - Contato = nome: Simba, numero: 2222;
        id = 4 - Contato = nome: Cami, numero: 5555;
        id = 3 - Contato = nome: Jon, numero: 1111;
        */

        Map<Integer, Pessoa> dicionarioPessoas = new HashMap<>() {{
            put(1, new Pessoa("Simba", 2222));
            put(4, new Pessoa("Cami", 5555));
            put(3, new Pessoa("Jon", 1111));
        }};
        
        //Exemplo de ordenação por nome através de uma classe Anônima 
        System.out.println("\n Ordenação Por Nome: \n");
        Set<Map.Entry<Integer, Pessoa>> ordenacaoNome = new TreeSet<>(new Comparator<>() {
            public int compare(Entry<Integer, Pessoa> o1, Entry<Integer, Pessoa> o2) {
                return o1.getValue().getnome().compareToIgnoreCase(o2.getValue().getnome());
            }
        });

        ordenacaoNome.addAll(dicionarioPessoas.entrySet());
        for (Map.Entry<Integer, Pessoa> pessoa : ordenacaoNome) {
            System.out.println("ID: "+pessoa.getKey()+" - Nome: "+pessoa.getValue().getnome()+" Numero: "+pessoa.getValue().getnumero());
        }

        //Exemplo de ordenação por número usando Method Reference com expressões lambda
        System.out.println("\n Ordenação Por Numero: \n");
        Set<Map.Entry<Integer, Pessoa>> ordenacaoNumero = new TreeSet<>(Comparator.comparing(Entry::getValue, Comparator.comparing(Pessoa::getnumero)));

        ordenacaoNumero.addAll(dicionarioPessoas.entrySet());
        for (Map.Entry<Integer, Pessoa> pessoa : ordenacaoNumero) {
            System.out.println("ID: "+pessoa.getKey()+" - Nome: "+pessoa.getValue().getnome()+" Numero: "+pessoa.getValue().getnumero());
        }

        //Exemplo de ordenação por ID usando Method Reference com expressões lambda
        System.out.println("\n Ordenação Por ID: \n");
        Set<Map.Entry<Integer, Pessoa>> ordenacaoId = new TreeSet<>(Comparator.comparing(Entry::getKey));

        ordenacaoId.addAll(dicionarioPessoas.entrySet());
        for (Map.Entry<Integer, Pessoa> pessoa : ordenacaoId) {
            System.out.println("ID: "+pessoa.getKey()+" - Nome: "+pessoa.getValue().getnome()+" Numero: "+pessoa.getValue().getnumero());
        }

        //Exemplo de ordenação por ID reversa usando expressões lambda com especificação de tipo
        System.out.println("\n Ordenação Por ID Reversa: \n");
        Set<Map.Entry<Integer, Pessoa>> ordenacaoIdReversa = new TreeSet<>(Comparator.<Entry<Integer, Pessoa>, Integer>comparing(entry -> entry.getKey()).reversed());

        ordenacaoIdReversa.addAll(dicionarioPessoas.entrySet());
        for (Map.Entry<Integer, Pessoa> pessoa : ordenacaoIdReversa) {
            System.out.println("ID: "+pessoa.getKey()+" - Nome: "+pessoa.getValue().getnome()+" Numero: "+pessoa.getValue().getnumero());
        }

    }

}

class Pessoa {

    private String nome = "";
    private Integer numero = 0;;

    public Pessoa(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public Integer getnumero() {
        return numero;
    }

    public void setnumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
    
}

/*class ComparatorNumero implements Comparator<Map.Entry<Integer, Pessoa>>{

    @Override
    public int compare(Entry<Integer, Pessoa> o1, Entry<Integer, Pessoa> o2) {
        return Integer.compare(o2.getValue().getnumero(), o1.getValue().getnumero());
    }

}*/

/*
  
 Classe Anônima

   Classes anônimas são úteis quando você precisa criar uma implementação de uma interface ou uma classe abstrata e só vai usá-la uma vez. 
   Elas permitem que você defina e instancie a classe em uma única expressão, sem a necessidade de criar uma classe nomeada separada.

 Necessidade de especificar o tipo quando usasdo o reversed do Comparator:

   A razão pela qual você precisou do cast ao usar `reversed()` está relacionada à forma como o compilador Java infere os tipos genéricos.
   Quando você usa `Comparator.comparing(Entry::getKey)`, o compilador consegue inferir os tipos corretamente a partir do contexto, pois `Entry::getKey` é um method reference que retorna um `Integer`, e o compilador sabe que está lidando com `Entry<Integer, Pessoa>`.
   No entanto, quando você encadeia o método `reversed()`, a inferência de tipos se torna mais complexa. O método `reversed()` retorna um `Comparator` que inverte a ordem do `Comparator` original. Sem a especificação explícita dos tipos, o compilador pode ter dificuldade em inferir corretamente os tipos genéricos, resultando na necessidade de um cast.
   Ao especificar explicitamente os tipos genéricos com `Comparator.<Entry<Integer, Pessoa>, Integer>comparing(entry -> entry.getKey()).reversed()`, você está ajudando o compilador a entender exatamente quais tipos ele deve esperar, evitando a necessidade de um cast.
   Espero que isso esclareça a questão! Se tiver mais dúvidas ou precisar de mais alguma coisa, estou aqui para ajudar.

 Lambda Expressions

   Lambdas são uma forma mais concisa e moderna de escrever código que, em versões anteriores do Java, exigiria a criação de classes anônimas. 
   Elas foram introduzidas no Java 8 e permitem que você escreva funções de forma mais compacta e legível. 
   Lambdas são usadas principalmente para passar comportamento como argumento para métodos, sem a necessidade de instanciar uma classe.

    Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);

 Method References

   Method references são uma forma ainda mais concisa de escrever lambdas quando a expressão lambda simplesmente chama um método existente. 
   Elas são usadas para referenciar métodos ou construtores de uma classe de forma direta e legível. 
   Method references também foram introduzidas no Java 8 e são uma maneira de simplificar ainda mais o código.

    Comparator<String> comparator = String::compareToIgnoreCase;
  
*/
