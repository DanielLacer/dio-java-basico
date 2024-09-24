public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/*
 
    Todos esses conceitos fazem parte da API de Streams introduzida no Java 8. A API de Streams permite processar coleções de dados de forma declarativa e funcional. 

    O que é um Stream?

    Um Stream em Java é uma sequência de elementos que suporta diferentes tipos de operações para processar dados. Ele não armazena dados, mas opera sobre uma fonte de dados, como uma coleção ou um array. Streams permitem realizar operações como filtragem, mapeamento, redução, etc., de forma eficiente e concisa.

    Métodos Comuns da API de Streams

    1. `stream()`
    
    - Descrição: Cria um stream a partir de uma coleção.
    - Exemplo:
    ```java
    List<String> lista = Arrays.asList("a", "b", "c");
    Stream<String> stream = lista.stream();
    ```

    2. `filter()`

    - Descrição: Filtra os elementos do stream com base em uma condição.
    - Exemplo:
    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> pares = numeros.stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());
    ```

    3. `map()`

    - Descrição: Aplica uma função a cada elemento do stream e retorna um novo stream com os resultados.
    - Exemplo:
    ```java
    List<String> palavras = Arrays.asList("java", "stream", "api");
    List<Integer> tamanhos = palavras.stream()
                                    .map(String::length)
                                    .collect(Collectors.toList());
    ```

     4. `mapToDouble()`
     
    - Descrição: Converte os elementos do stream para `double`.
    - Exemplo:
    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    DoubleStream doubleStream = numeros.stream()
                                        .mapToDouble(Integer::doubleValue);
    ```

     5. `average()`

    - Descrição: Calcula a média dos elementos de um `DoubleStream`.
    - Exemplo:
    ```java
    double media = numeros.stream()
                            .mapToDouble(Integer::doubleValue)
                            .average()
                            .orElse(0d);
    ```

     6. `orElse()`

    - Descrição: Fornece um valor padrão caso o `Optional` esteja vazio.
    - Exemplo:
    ```java
    OptionalDouble media = DoubleStream.of(1.0, 2.0, 3.0).average();
    double valor = media.orElse(0d); // Retorna 0 se a média não estiver presente
    ```

     7. `forEach()`

    - Descrição: Executa uma ação para cada elemento do stream.
    - Exemplo:
    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    numeros.stream()
            .forEach(n -> System.out.println(n));
    ```

     8. `collect()`

    - Descrição: Coleta os elementos do stream em uma coleção ou outro tipo de resultado.
    - Exemplo:
    ```java
    List<String> palavras = Arrays.asList("java", "stream", "api");
    List<String> maiusculas = palavras.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
    ```

     9. `reduce()`

    - Descrição: Reduz os elementos do stream a um único valor usando uma função de acumulação.
    - Exemplo:
    ```java
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    int soma = numeros.stream()
                        .reduce(0, Integer::sum);
    ```

 
 */