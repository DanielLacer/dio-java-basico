
import java.util.Objects;

public class Obj extends ObjArvore<Obj>{

    Integer meuValor;

    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
       return meuValor.toString();
    }

}

/*

### Interface `Comparable`

A interface `Comparable` é usada para definir uma ordem natural para os objetos de uma classe. Quando uma classe implementa `Comparable`, ela deve sobrescrever o método `compareTo(T o)`. Esse método é responsável por definir como os objetos dessa classe serão comparados.

### Método `compareTo`

    O método `compareTo` retorna um valor inteiro que indica a ordem entre o objeto atual e o objeto passado como argumento. O retorno pode ser:
    - Um valor negativo, se o objeto atual for menor que o objeto passado.
    - Zero, se os objetos forem iguais.
    - Um valor positivo, se o objeto atual for maior que o objeto passado.

### Critérios de Comparação

O critério de comparação é definido dentro do método `compareTo`. Para números, a comparação é direta (maior ou menor). Para objetos, você pode definir qualquer critério que faça sentido para a sua aplicação.

### Exemplo com Objetos

Vamos considerar uma classe `Carro` que implementa `Comparable`. Podemos definir o critério de comparação como a velocidade do carro:

    ```java
        public class Carro implements Comparable<Carro> {
            private String modelo;
            private int velocidade;

            public Carro(String modelo, int velocidade) {
                this.modelo = modelo;
                this.velocidade = velocidade;
            }

            @Override
            public int compareTo(Carro outroCarro) {
                return Integer.compare(this.velocidade, outroCarro.velocidade);
            }

            @Override
            public String toString() {
                return modelo + " (" + velocidade + " km/h)";
            }
        }
    ```

### Explicação do Exemplo

1. **Classe `Carro`**:
   - A classe `Carro` tem dois atributos: `modelo` e `velocidade`.

2. **Construtor**:
   - O construtor inicializa os atributos `modelo` e `velocidade`.

3. **Método `compareTo`**:
   - O método `compareTo` compara a velocidade dos carros.
   - `Integer.compare(this.velocidade, outroCarro.velocidade)`: Compara a velocidade do carro atual com a velocidade do outro carro.

### Uso do `Comparable`

Quando você usa a interface `Comparable`, pode ordenar uma lista de objetos `Carro` com base na velocidade:

    ```java
    List<Carro> carros = new ArrayList<>();
    carros.add(new Carro("Ferrari", 300));
    carros.add(new Carro("Lamborghini", 320));
    carros.add(new Carro("Porsche", 290));

    Collections.sort(carros);

    for (Carro carro : carros) {
        System.out.println(carro);
    }
    ```

    ### Saída

    ```
    Porsche (290 km/h)
    Ferrari (300 km/h)
    Lamborghini (320 km/h)
    ```

### Comparação de Critérios Abstratos

Para objetos com critérios abstratos, você define o critério de comparação dentro do método `compareTo`. Por exemplo, se você quiser comparar carros pelo modelo em vez da velocidade, pode alterar o método `compareTo`:

    ```java
    @Override
    public int compareTo(Carro outroCarro) {
        return this.modelo.compareTo(outroCarro.modelo);
    }
    ```

### Conclusão

A interface `Comparable` permite que você defina como os objetos de uma classe serão comparados, implementando o método `compareTo`. O critério de comparação é definido dentro desse método e pode ser qualquer atributo ou combinação de atributos que faça sentido para a sua aplicação.
 
*/
