import java.util.Objects;

public class Carro implements Comparable<Carro>{

    private String marca;

    public Carro(String marca){
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

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }


    @Override
    public int compareTo(Carro o) {

        //Ordenar lista de carro por tamanho de letras.
        /*    
            if(this.marca.length() < o.marca.length()){
                return -1;
            }else if(this.marca.length() > o.marca.length()){
                return 1;
            }

            return 0;
        */

        // Ordenar lista de carro por ordem alfabética invertida
        /*
            return o.getMarca().compareTo(this.getMarca());
        */

         //Ordenar lista de carro por ordem alfabética
        return this.getMarca().compareTo(o.getMarca());
    }
}

/*
  
    Ordenação por Tamanho da Marca

        Explicação Linha a Linha:

            public int compareTo(Carro o) {: Define o método compareTo que recebe um objeto Carro como parâmetro.

            if (this.marca.length() < o.marca.length()) {: Verifica se o comprimento da marca do carro atual (this) é menor que o comprimento da marca do carro o.

            return -1;: Se for menor, retorna -1, indicando que o carro atual deve vir antes do carro o.

            } else if (this.marca.length() > o.marca.length()) {: Verifica se o comprimento da marca do carro atual (this) é maior que o comprimento da marca do carro o.

            return 1;: Se for maior, retorna 1, indicando que o carro atual deve vir depois do carro o.

            return 0;: Se os comprimentos forem iguais, retorna 0, indicando que os carros são iguais em termos de comprimento da marca.

        Cenário de Exemplo:

        Suponha que temos os seguintes carros:

            Ford (4 letras)
            Chevrolet (10 letras)
            Fiat (4 letras)
            Peugeot (7 letras)
            Zip (3 letras)
            Alfa Romeo (10 letras)
            
        A ordenação por tamanho da marca resultaria em:

            Zip (3 letras)
            Ford (4 letras)
            Fiat (4 letras)
            Peugeot (7 letras)
            Chevrolet (10 letras)
            Alfa Romeo (10 letras)

    Ordenação por Ordem Alfabética

        Explicação Linha a Linha

            public int compareTo(Carro o) {: Define o método compareTo que recebe um objeto Carro como parâmetro.
            
            return this.getMarca().compareTo(o.getMarca());: Compara a marca do carro atual (this) com a marca do carro o usando o método compareTo da classe String.

        Cenário de Exemplo:
        Suponha que temos os seguintes carros:

            Ford
            Chevrolet
            Fiat
            Peugeot
            Zip
            Alfa Romeo

        A ordenação por ordem alfabética resultaria em:

            Alfa Romeo
            Chevrolet
            Fiat
            Ford
            Peugeot
            Zip
  
 */