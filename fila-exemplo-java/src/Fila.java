public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}

/*

    Classe `Fila`

    1. **Atributo `refNoEntradaFila`**:
    - Este atributo referencia o nó no início da fila. Inicialmente, é `null`, indicando que a fila está vazia.

    2. **Método `enqueue(No novoNo)`**:
    - Adiciona um novo nó ao início da fila.
    - `novoNo.setRefNo(refNoEntradaFila);`: Define a referência do novo nó para o nó que estava anteriormente no início da fila.
    - `refNoEntradaFila = novoNo;`: Atualiza o início da fila para o novo nó.
    - Exemplo: Se a fila é `ob3, ob2, ob1` e você adiciona `ob4`, a fila se torna `ob4, ob3, ob2, ob1`.

    3. **Método `first()`**:
    - Retorna o primeiro nó da fila sem removê-lo.
    - `if(!this.isEmpty())`: Verifica se a fila não está vazia.
    - `No primeiroNo = refNoEntradaFila;`: Inicia a iteração a partir do início da fila.
    - `while (true)`: Itera sobre os nós da fila.
        - `if(primeiroNo.getRefNo() != null)`: Verifica se o nó atual tem uma referência para o próximo nó.
        - `primeiroNo = primeiroNo.getRefNo();`: Atualiza a referência para o próximo nó.
        - `else`: Se o nó atual não tem uma referência para o próximo nó, interrompe o loop.
    - `return primeiroNo;`: Retorna o primeiro nó da fila.

    4. **Método `dequeue()`**:
    - Remove e retorna o primeiro nó da fila.
    - `if(!this.isEmpty())`: Verifica se a fila não está vazia.
    - `No primeiroNo = refNoEntradaFila;`: Inicia a iteração a partir do início da fila.
    - `No noAuxiliar = refNoEntradaFila;`: Armazena a referência do nó atual.
    - `while (true)`: Itera sobre os nós da fila.
        - `if(primeiroNo.getRefNo() != null)`: Verifica se o nó atual tem uma referência para o próximo nó.
        - `noAuxiliar = primeiroNo;`: Atualiza a referência do nó auxiliar para o nó atual.
        - `primeiroNo = primeiroNo.getRefNo();`: Atualiza a referência para o próximo nó.
        - `else`: Se o nó atual não tem uma referência para o próximo nó, define a referência do nó auxiliar como `null` e interrompe o loop.
    - `return primeiroNo;`: Retorna o primeiro nó da fila.

    5. **Método `isEmpty()`**:
    - Verifica se a fila está vazia.
    - `return refNoEntradaFila == null ? true : false;`: Retorna `true` se a fila estiver vazia, caso contrário, `false`.

    6. **Método `toString()`**:
    - Retorna uma representação em string da fila.
    - `No noAuxiliar = refNoEntradaFila;`: Inicia a iteração a partir do início da fila.
    - `if(refNoEntradaFila != null)`: Verifica se a fila não está vazia.
        - `while (true)`: Itera sobre os nós da fila.
        - `stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";`: Adiciona a representação do nó atual à string de retorno.
        - `if(noAuxiliar.getRefNo() != null)`: Verifica se o nó atual tem uma referência para o próximo nó.
        - `noAuxiliar = noAuxiliar.getRefNo();`: Atualiza a referência para o próximo nó.
        - `else`: Se o nó atual não tem uma referência para o próximo nó, adiciona `"null"` à string de retorno e interrompe o loop.
    - `else`: Se a fila estiver vazia, define a string de retorno como `"null"`.
    - `return stringRetorno;`: Retorna a string de representação da fila.

    ### Resumo

    - **enqueue**: Adiciona um novo nó ao início da fila.
    - **first**: Retorna o primeiro nó da fila sem removê-lo.
    - **dequeue**: Remove e retorna o primeiro nó da fila.
    - **isEmpty**: Verifica se a fila está vazia.
    - **toString**: Retorna uma representação em string da fila.
 
 */