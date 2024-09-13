public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        validaIndice(index);
        No<T> noPivor = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}

/*

    Análise da Classe `ListaEncadeada`

    1. **Construtor e Atributo `referenciaEntrada`**:
    - **Explicação**: Correto. O construtor inicializa a `referenciaEntrada` como `null`, indicando que a lista está vazia.

    2. **Método `add`**:
    - **Explicação**: Correto. O método cria um novo nó e verifica se a lista está vazia. Se estiver, o novo nó se torna a `referenciaEntrada`. Caso contrário, o método percorre a lista até o último nó e adiciona o novo nó como o próximo nó do último.

    3. **Método `get`**:
    - **Explicação**: Correto. O método retorna o conteúdo do nó na posição especificada pelo índice.

    4. **Método `getNo`**:
    - **Explicação**: Correto. O método valida o índice e percorre a lista até o nó na posição especificada. A variável `noRetorno` é necessária para manter a referência ao nó atual enquanto `noAuxiliar` avança para o próximo nó. Você está certo de que poderia usar apenas `noAuxiliar`, mas `noRetorno` torna o código mais claro.

    5. **Método `remove`**:
    - **Explicação**: Correto. O método valida o índice e remove o nó na posição especificada. Se o índice for 0, a `referenciaEntrada` é atualizada para o próximo nó. Caso contrário, o nó anterior ao nó a ser removido é atualizado para apontar para o próximo nó do nó removido.

    6. **Método `size`**:
    - **Explicação**: Correto. O método percorre a lista e conta o número de nós, retornando o tamanho da lista.

    7. **Método `validaIndice`**:
    - **Explicação**: Correto. O método verifica se o índice está dentro dos limites da lista e lança uma exceção se não estiver.

    8. **Método `isEmpty`**:
    - **Explicação**: Correto. O método verifica se a `referenciaEntrada` é `null`, indicando que a lista está vazia.

    9. **Métodos `getReferenciaEntrada` e `setReferenciaEntrada`**:
    - **Explicação**: Correto. Esses métodos são getters e setters para o atributo `referenciaEntrada`.

    10. **Método `toString`**:
        - **Explicação**: Correto. O método percorre a lista e constrói uma string representando os nós da lista.
 
 */