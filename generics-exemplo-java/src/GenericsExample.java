import java.util.ArrayList;
import java.util.List;

// Classe principal
public class GenericsExample {
    public static void main(String[] args) {

        // Exemplo de Unbounded Wildcard
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printList(stringList); // Chama o método com Unbounded Wildcard

        // Exemplo de Upper Bounded Wildcard
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Sum: " + sumOfList(intList)); // Chama o método com Upper Bounded Wildcard

        // Exemplo de Lower Bounded Wildcard
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList); // Chama o método com Lower Bounded Wildcard
        System.out.println("Numbers: " + numberList);
    }

    // Método com Unbounded Wildcard
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    // Método com Upper Bounded Wildcard
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Método com Lower Bounded Wildcard
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}

/*

    Generics Wildcards em Java

    1. Unbounded Wildcards (Coringas Não Limitados):
    - Representados por `<?>`.
    - Usados quando você não sabe ou não precisa especificar o tipo exato.
    - Permitem que você trabalhe com qualquer tipo de objeto.
    - Úteis quando você está escrevendo métodos que podem ser implementados usando funcionalidades fornecidas pela classe `Object` ou quando o código não depende do tipo específico do parâmetro⁴.

    2. Upper Bounded Wildcards (Coringas Limitados Superiormente):
    - Representados por `<? extends T>`, onde `T` é um tipo específico.
    - Usados quando você quer trabalhar com um tipo específico e seus subtipos.
    - Permitem que você leia itens de uma estrutura, mas não adicionar novos itens (exceto `null`).
    - Úteis quando você quer relaxar as restrições sobre uma variável para trabalhar com uma lista de um tipo específico e seus subtipos⁷.

    3. Lower Bounded Wildcards (Coringas Limitados Inferiormente):
    - Representados por `<? super T>`, onde `T` é um tipo específico.
    - Usados quando você quer trabalhar com um tipo específico e seus supertypes.
    - Permitem que você adicione itens a uma estrutura, mas não ler itens de forma segura (exceto como `Object`).
    - Úteis quando você quer maximizar a flexibilidade para adicionar elementos a uma lista de um tipo específico e seus supertypes[^10^].

    4. Por convenção, os nomes dos parâmetros de tipo são letras únicas e maiúsculas:

        E - Element (usado extensivamente pelo Java Collections Framework)
        K - Key
        N - Number
        T - Type
        V - Value
        S, U, V, etc. - Usados para representar múltiplos tipos

    5. Upper Bounded Wildcards (`<? extends T>`)
    - Leitura: Você pode ler itens da lista e tratá-los como o tipo `T` ou seus subtipos.
    - Adição:  Você não pode adicionar novos itens à lista (exceto `null`), pois não é seguro adicionar um item de um tipo específico quando a lista pode conter subtipos diferentes.

    6. Lower Bounded Wildcards (`<? super T>`)
    - Leitura: Você pode ler itens da lista, mas só pode tratá-los como `Object`, pois não é seguro assumir um tipo específico.
    - Adição:  Você pode adicionar itens do tipo `T` e seus subtipos à lista, pois é garantido que a lista pode conter esses tipos.

    Portanto:
    - Upper Bounded (`<? extends T>`): Não permite adicionar objetos.
    - Lower Bounded (`<? super T>`): Permite adicionar objetos do tipo `T` e seus subtipos / subclasses.

 */
