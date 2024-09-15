import java.util.Objects;

public class Carro {

    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }
}

/*
 
    Método equals()

        @Override: Indica que estamos sobrescrevendo o método equals da classe Object.

        public boolean equals(Object o): Define o método equals que recebe um objeto "o" como parâmetro.

        if (this == o) return true;: Verifica se o objeto atual (this) é o mesmo que o objeto "o". Se sim, retorna true.

        if (!(o instanceof Carro)) return false;: Verifica se o objeto "o" não é uma instância da classe Carro. Se não for, retorna false.

        Carro carro = (Carro) o;: Faz o cast do objeto "o" para a classe Carro.

        return Objects.equals(getMarca(), carro.getMarca());: Compara a marca do objeto atual com a marca do objeto carro usando o método Objects.equals

    Método hashCode()

        @Override: Indica que estamos sobrescrevendo o método hashCode da classe Object.

        public int hashCode(): Define o método hashCode.

        return Objects.hash(getMarca());: Retorna o hash code da marca do carro usando o método Objects.hash.

    Observações:

        - Por que o método equals é acionado quando é usado o método contains num ArrayList?

            Quando você usa o método contains da lista, ele verifica se a lista contém um elemento igual ao que você passou como argumento. 
            Para fazer essa verificação, ele usa o método equals dos objetos na lista. 
            Portanto, mesmo que você não chame explicitamente o método equals, ele é chamado internamente pelo método contains

        - HashCode

            Os métodos hashCode são chamados para calcular o código hash dos objetos. 
            No seu exemplo, você está criando novos objetos Carro com a marca “Ford” e imprimindo seus códigos hash. 
            Como o método hashCode foi sobrescrito para usar a marca do carro, os códigos hash serão iguais para objetos Carro com a mesma marca.

        - O que é casting?

            Fazer um cast (ou casting) é o processo de converter um objeto de um tipo para outro. 
            Você está convertendo o objeto o para o tipo Carro. 
            Isso é necessário porque o método equals recebe um parâmetro do tipo Object, que é a classe base de todos os objetos em Java. 
            Para acessar os métodos e propriedades específicas da classe Carro, você precisa primeiro converter (ou fazer o “cast”) do objeto para o objeto do tipo Carro

            Imagine que você tem uma classe `Animal` e uma subclasse `Cachorro`:

                class Animal {
                    void fazerSom() {
                        System.out.println("Algum som de animal");
                    }
                }

                class Cachorro extends Animal {
                    void fazerSom() {
                        System.out.println("Latido");
                    }
                }

            Se você tiver um objeto `Animal` que na verdade é um `Cachorro`, você pode fazer o cast para acessar os métodos específicos de `Cachorro`:

                Animal animal = new Cachorro();
                animal.fazerSom(); // Saída: Latido

                Cachorro cachorro = (Cachorro) animal;
                cachorro.fazerSom(); // Saída: Latido

            No exemplo acima, `animal` é do tipo `Animal`, mas na verdade é um `Cachorro`. Para chamar métodos específicos de `Cachorro`, fazemos o cast:

                Cachorro cachorro = (Cachorro) animal;

        - Porque um objeto instâncidado pela classe Carro não significa necessariamente que ele é do tipo Carro? 

            Quando você faz a verificação if (!(o instanceof Carro)) return false;, você está garantindo que o objeto "o" é uma instância da classe Carro ou de uma subclasse de Carro. 
            No entanto, essa verificação por si só não altera o tipo do objeto "o". Ele ainda é tratado como um Object até que você faça o cast explícito para Carro.
            Mesmo após a verificação com instanceof, o compilador Java não sabe que "o" é um Carro. Ele apenas sabe que "o" é um Object que pode ser um Carro. 
            Para acessar métodos e atributos específicos da classe Carro, você precisa fazer o cast desse objeto "o".

            Resumo:

                Verificação instanceof: Garante que o objeto é do tipo esperado, mas não altera o tipo do objeto.
                Casting: Necessário para acessar métodos e atributos específicos da classe.
                ArrayList: Armazena objetos do tipo especificado, mas a recuperação dos seus objetos ainda requer casting para acessar seus métodos específicos
 
 */
