public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}

/*

```
       15
      /  \
     10   20
    / \   / \
   8  12 17 25
```

Removendo o número 20 da árvore. Explicação:

    1. **Verificar se o Nó a Ser Removido é a Raiz**:
    ```java
    if(pai == null){
    ```
    - Se `pai` for `null`, significa que o nó a ser removido é a raiz.

    2. **Verificar se o Nó a Ser Removido Não Tem Filho à Direita**:
    ```java
    if(atual.getNoDir() == null){
        this.raiz = atual.getNoEsq();
    ```
    - Se o nó a ser removido não tem filho à direita, a nova raiz será o filho à esquerda.

    3. **Verificar se o Nó a Ser Removido Não Tem Filho à Esquerda**:
    ```java
    }else if(atual.getNoEsq() == null){
        this.raiz = atual.getNoDir();
    ```
    - Se o nó a ser removido não tem filho à esquerda, a nova raiz será o filho à direita.

    4. **Caso o Nó a Ser Removido Tenha Dois Filhos**:
    ```java
    }else {
        for(temp = atual, filho = atual.getNoEsq();
            filho.getNoDir() != null;
            temp = filho, filho = filho.getNoEsq()
        ){
            if(filho != atual.getNoEsq()){
                temp.setNoDir(filho.getNoEsq());
                filho.setNoEsq(raiz.getNoEsq());
            }
        }
        filho.setNoDir(raiz.getNoDir());
        raiz = filho;
    ```
    - Se o nó a ser removido tem dois filhos, encontramos o maior nó na subárvore esquerda (`filho`).
    - Atualizamos as referências para remover o nó e ajustar a árvore.

    5. **Caso o Nó a Ser Removido Não Seja a Raiz**:
    ```java
    }else if(atual.getNoDir() == null){
        if(pai.getNoEsq() == atual){
            pai.setNoEsq(atual.getNoEsq());
        }else {
            pai.setNoDir(atual.getNoEsq());
        }
    ```
    - Se o nó a ser removido não tem filho à direita, atualizamos a referência do pai para apontar para o filho à esquerda.

    6. **Caso o Nó a Ser Removido Não Tenha Filho à Esquerda**:
    ```java
    }else if(atual.getNoEsq() == null){
        if(pai.getNoEsq() == atual){
            pai.setNoEsq(atual.getNoDir());
        }else {
            pai.setNoDir(atual.getNoDir());
        }
    ```
    - Se o nó a ser removido não tem filho à esquerda, atualizamos a referência do pai para apontar para o filho à direita.

    7. **Caso o Nó a Ser Removido Tenha Dois Filhos**:
    ```java
    }else{
        for(
            temp = atual, filho = atual.getNoEsq();
            filho.getNoDir() != null;
            temp = filho, filho = filho.getNoDir()
        ){
            if(filho != atual.getNoEsq()){
                temp.setNoDir(filho.getNoEsq());
                filho.setNoEsq(atual.getNoEsq());
            }
            filho.setNoDir(atual.getNoDir());
            if(pai.getNoEsq() == atual){
                pai.setNoEsq(filho);
            }else{
                pai.setNoDir(filho);
            }
        }
    }
    ```
    - Se o nó a ser removido tem dois filhos, encontramos o maior nó na subárvore esquerda (`filho`).
    - Atualizamos as referências para remover o nó e ajustar a árvore.

    ### Exemplo com Números

Considerando a seguinte árvore:

```
       15
      /  \
     10   20
    / \   / \
   8  12 17 25
```

Removendo o número 20:

1. **Encontrar o Nó a Ser Removido**:
   - Começamos na raiz (15).
   - 20 é maior que 15, então vamos para a direita.
   - Encontramos 20.

2. **Remover o Nó 20**:
   - 20 tem dois filhos (17 e 25).
   - Encontramos o maior nó na subárvore esquerda de 20 (17).
   - Substituímos 20 por 17.
   - Atualizamos as referências.

Estado final da árvore:

```
       15
      /  \
     10   17
    / \     \
   8  12    25
```
 
 */