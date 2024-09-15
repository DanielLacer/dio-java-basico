public class Main {
    public static void main(String[] args) throws Exception {
        
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}

/*

    Classe `ArvoreBinaria`

    1. **Atributo `raiz`**:
        - A árvore começa com uma raiz, que é o primeiro nó da árvore. No início, a raiz é `null`, ou seja, a árvore está vazia.

    2. **Construtor `ArvoreBinaria`**:
        - Quando criamos uma nova árvore, a raiz é definida como `null`.

    3. **Método `inserir`**:
        - Este método adiciona um novo valor à árvore.
        - Primeiro, criamos um novo nó com o valor que queremos adicionar.
        - Depois, chamamos um método auxiliar `inserir` para encontrar o lugar certo para esse novo nó.

    4. **Método `inserir` (auxiliar)**:
        - Este método encontra o lugar certo para o novo nó.
        - Se o lugar atual estiver vazio (`null`), colocamos o novo nó ali.
        - Se o valor do novo nó for menor que o valor do nó atual, vamos para a esquerda.
        - Se o valor do novo nó for maior ou igual ao valor do nó atual, vamos para a direita.

        ### Exemplo de Inserção

        Vamos adicionar os valores 6, 5, 10, e 12 à árvore:

        1. **Adicionar 6**:
        - A árvore está vazia, então 6 se torna a raiz.
        - Estado da árvore: `6`

        2. **Adicionar 5**:
        - 5 é menor que 6, então 5 vai para a esquerda de 6.
        - Estado da árvore: 
            ```
             6
            /
           5
            ```

        3. **Adicionar 10**:
        - 10 é maior que 6, então 10 vai para a direita de 6.
        - Estado da árvore: 
            ```
             6
            / \
           5   10
            ```

        4. **Adicionar 12**:
        - 12 é maior que 6, então vamos para a direita de 6.
        - 12 é maior que 10, então 12 vai para a direita de 10.
        - Estado da árvore: 
            ```
             6
            / \
           5   10
                \
                 12
            ```

    ### Métodos de Exibição

    1. **Método `exibirInOrdem`**:
        - Exibe os valores da árvore em ordem crescente.
        - Percorre a árvore da esquerda para a direita.
        - Exemplo: Para a árvore acima, a saída será: `5, 6, 10, 12`

    2. **Método `exibirPosOrdem`**:
        - Exibe os valores da árvore em ordem pós-ordem.
        - Percorre a árvore da esquerda para a direita, mas exibe o valor do nó depois de seus filhos.
        - Exemplo: Para a árvore acima, a saída será: `5, 12, 10, 6`

    3. **Método `exibirPreOrdem`**:
        - Exibe os valores da árvore em ordem pré-ordem.
        - Percorre a árvore da esquerda para a direita, mas exibe o valor do nó antes de seus filhos.
        - Exemplo: Para a árvore acima, a saída será: `6, 5, 10, 12`

    ### Método `remover`

    Vamos remover o valor 10 da árvore:

    1. **Encontrar o Nó a Ser Removido**:
        - Começamos na raiz e procuramos o valor 10.
        - Encontramos 10 à direita de 6.

    2. **Remover o Nó**:
        - 10 tem um filho (12).
        - Substituímos 10 por 12.
        - Estado da árvore:
            ```
             6
            / \
           5   12
            ```

    ### Outras Classes

    1. **Classe `BinNo`**:
        - Representa um nó da árvore.
        - Cada nó tem um valor (`conteudo`), um nó à esquerda (`noEsq`) e um nó à direita (`noDir`).

    2. **Classe `Obj`**:
        - Representa um objeto que pode ser comparado com outros objetos.
        - Tem um valor (`meuValor`) e métodos para comparar, verificar igualdade e converter para string.

    3. **Classe `ObjArvore`**:
        - Classe abstrata que define métodos que devem ser implementados por `Obj`.
 
 */
