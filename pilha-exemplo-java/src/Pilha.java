public class Pilha {

    No refNoEntradaPilha = null;

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}

/*

    Classe `Pilha`

    1. **Atributo `refNoEntradaPilha`**:
    - Este atributo referencia o nó no topo da pilha. Inicialmente, é `null`, indicando que a pilha está vazia.

    2. **Método `push(No novoNo)`**:
    - Adiciona um novo nó ao topo da pilha.
    - `No refAuxiliar = refNoEntradaPilha;`: Armazena a referência do nó atual do topo.
    - `refNoEntradaPilha = novoNo;`: Atualiza o topo da pilha para o novo nó.
    - `refNoEntradaPilha.setRefNo(refAuxiliar);`: Define a referência do novo nó para o nó anterior do topo.

    3. **Método `pop()`**:
    - Remove e retorna o nó do topo da pilha.
    - `if(!isEmpty())`: Verifica se a pilha não está vazia.
    - `No noPoped = refNoEntradaPilha;`: Armazena a referência do nó atual do topo.
    - `refNoEntradaPilha = refNoEntradaPilha.getRefNo();`: Atualiza o topo da pilha para o nó anterior ao nó que foi removido (que está armazenado na variável noPoped).
    - `return noPoped;`: Retorna o nó removido.
    - Em outras palavras, o topo da pilha agora aponta para o nó que estava logo abaixo do nó que acabou de ser removido.
    
    4. **Método `top()`**:
    - Retorna o nó do topo da pilha sem removê-lo.
    - `return refNoEntradaPilha;`: Retorna a referência do nó atual do topo.

    5. **Método `isEmpty()`**:
    - Verifica se a pilha está vazia.
    - `return refNoEntradaPilha == null ? true : false;`: Retorna `true` se a pilha estiver vazia, caso contrário, `false`.

    6. **Método `toString()`**:
    - Retorna uma representação em string da pilha.
    - `No noAuxiliar = refNoEntradaPilha;`: Inicia a iteração a partir do topo da pilha.
    - `while(true)`: Itera sobre os nós da pilha.
        - `if(noAuxiliar != null)`: Verifica se o nó atual não é nulo.
        - `stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";`: Adiciona a representação do nó atual à string de retorno.
        - `noAuxiliar = noAuxiliar.getRefNo();`: Atualiza a referência para o nó anterior ao nó atual.
        - `else`: Se o nó atual for nulo, interrompe o loop.
    - `stringRetorno += "============";`: Adiciona o final da representação da pilha.
    - `return stringRetorno;`: Retorna a string de representação da pilha.

    Classe `No`

    1. **Atributos**:
    - `private int dado;`: Armazena o valor do nó.
    - `private No refNo = null;`: Referencia o nó anterior na pilha.

    2. **Construtores**:
    - `public No() {}`: Construtor padrão.
    - `public No(int dado) { this.dado = dado; }`: Construtor que inicializa o valor do nó.

    3. **Métodos Getters e Setters**:
    - `public int getDado() { return dado; }`: Retorna o valor do nó.
    - `public void setDado(int dado) { this.dado = dado; }`: Define o valor do nó.
    - `public No getRefNo() { return refNo; }`: Retorna a referência do nó anterior.
    - `public void setRefNo(No refNo) { this.refNo = refNo; }`: Define a referência ao nó anterior.

    4. **Método `toString()`**:
    - Retorna uma representação em string do nó.
    - `return "No{" + "dado=" + dado + '}';`: Retorna a string de representação do nó.

    Resumo

    - **Pilha**: Estrutura de dados que segue a regra LIFO (Last In, First Out).
    - **Método `push`**: Adiciona um novo nó ao topo da pilha.
    - **Método `pop`**: Remove e retorna o nó do topo da pilha.
    - **Método `top`**: Retorna o nó do topo da pilha sem removê-lo.
    - **Método `isEmpty`**: Verifica se a pilha está vazia.
    - **Método `toString`**: Retorna uma representação em string da pilha.
 
 */