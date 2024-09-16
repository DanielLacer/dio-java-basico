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
        System.out.println("Sum of Integers: " + sumOfList(intList)); // Chama o método com Upper Bounded Wildcard

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.println("Sum of Doubles: " + sumOfList(doubleList));

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
    public static <T extends Number> double sumOfList(List<T> list) {
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

    Wildcards (?) vs. Type Parameters (T)

        Upper Bounded Wildcard (? extends T)
        
            Uso: Permite que você trabalhe com um tipo genérico que é uma subclasse de T.
            Limitação: Você pode passar apenas elementos que são subclasses de T. No seu exemplo, List<? extends Number> aceita apenas tipos que são subclasses de Number (como Integer, Double, Float, etc.).
            Segurança de Tipos: Garante que todos os elementos na lista são de um tipo específico ou subtipo, mantendo a segurança de tipos forte do Java.
            Exemplo: sumOfList aceita apenas listas de números.

        Lower Bounded Wildcard (? super T)

            Uso: Permite que você trabalhe com um tipo genérico que é uma superclasse de T.
            Flexibilidade: Você pode passar qualquer tipo que seja T ou uma superclasse de T. No seu exemplo, List<? super Integer> aceita Integer e qualquer superclasse de Integer (como Number e Object).
            Liberalidade: Permite maior flexibilidade, mas pode perder um pouco da segurança de tipos que os Generics oferecem, já que aceita uma gama mais ampla de tipos.
            Exemplo: addNumbers aceita listas que podem conter Integer e qualquer superclasse de Integer.

        Resumo

            Upper Bounded Wildcard (? extends T): Limita os elementos a serem de um tipo específico ou subtipo. Mantém a segurança de tipos forte do Java.
            Lower Bounded Wildcard (? super T): Permite maior flexibilidade, aceitando tipos que são superclasses de T. Pode ser mais liberal e menos restritivo.

 */
