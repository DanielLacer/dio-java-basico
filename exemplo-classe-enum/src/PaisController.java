public class PaisController {
    public static void main(String[] args) throws Exception {

        System.out.println();
        for (Pais pais : Pais.values()) {
            System.out.println("Sigla: " + pais.getSigla());
            System.out.println("Nome: " + pais.getNome());
            System.out.println("Capital: " + pais.getCapital());
            System.out.println();
        }
        //Iterando sobre os objetos da classe enum "Pais"

        Pais capitalARG = Pais.ARG;

        System.out.println("Capital Argentina: "+capitalARG.getCapital());
        //Pegando o objeto Argentina e imprimindo sua capital.
  
    }
}

/*

 Em um enum, o número de objetos (ou instâncias) é pré-definido e imutável. Isso significa que você não pode adicionar ou remover instâncias de um enum após sua definição.
 Por outro lado, os atributos de cada instância do enum são definidos no momento da criação e também são imutáveis, 
 no sentido de que você não pode alterar os valores desses atributos depois que o enum é criado.

 Para resumir:
 Número de objetos (instâncias): Pré-definido e imutável.
 Atributos de cada instância: Definidos no momento da criação e imutáveis.

 */
