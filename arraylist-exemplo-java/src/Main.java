import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        // Cria uma lista de objetos do tipo Carro
        List<Carro> listCarros = new ArrayList<>();

        // Adiciona um novo Carro com a marca "Ford" à lista
        listCarros.add(new Carro("Ford"));
        // Adiciona um novo Carro com a marca "Chevrolet" à lista
        listCarros.add(new Carro("Chevrolet"));
        // Adiciona um novo Carro com a marca "Fiat" à lista
        listCarros.add(new Carro("Fiat"));
        // Adiciona um novo Carro com a marca "Peugeot" à lista
        listCarros.add(new Carro("Peugeot"));

        // Verifica se a lista contém um Carro com a marca "Ford" e imprime o resultado
        System.out.println(listCarros.contains(new Carro("Ford")));

        // Obtém e imprime o Carro na posição 2 (terceiro elemento) da lista
        System.out.println(listCarros.get(2));

        // Obtém e imprime o índice do primeiro Carro com a marca "Fiat" na lista
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        // Remove e imprime o Carro na posição 2 (terceiro elemento) da lista
        System.out.println(listCarros.remove(2));

        // Imprime a lista de Carros restante
        System.out.println(listCarros);
    }

}
