public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){ //estou na cauda
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }

}

/*
 
Analisando a classe `ListaCircular` abrangendo todos os cenários possíveis, usando os exemplos `ob1`, `ob2`, `ob2.5`, `ob3`, etc.

    Método `add(T conteudo)`

    1) Adicionando o primeiro objeto `ob1` e depois adicionar `ob2`:

        1. **Adicionar `ob1`**:

            NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
            if(tamanhoLista == 0){
                this.cabeca = novoNo;
                this.cauda = this.cabeca;
                this.cabeca.setNoProximo(this.cauda);
            }else{
                novoNo.setNoProximo(this.cauda);
                this.cabeca.setNoProximo(novoNo);
                this.cauda = novoNo;
            }
            this.tamanhoLista++;

            - Criação do Novo Nó: `novoNo` é criado com `ob1`.
            - Verificação se a Lista Está Vazia: `tamanhoLista` é 0, então `this.cabeca = novoNo;` e `this.cauda = this.cabeca;`.
            - Definição das Referências: `this.cabeca.setNoProximo(this.cauda);` define o próximo nó da cabeça como a cauda.
            - Incremento do Tamanho da Lista: `tamanhoLista++;`.

            Estado da Lista: `ob1 -> (Retorna ao início)`

        2. **Adicionar `ob2`**:

            NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
            if(tamanhoLista == 0){
                this.cabeca = novoNo;
                this.cauda = this.cabeca;
                this.cabeca.setNoProximo(this.cauda);
            }else{
                novoNo.setNoProximo(this.cauda);
                this.cabeca.setNoProximo(novoNo);
                this.cauda = novoNo;
            }
            this.tamanhoLista++;

            - Criação do Novo Nó: `novoNo` é criado com `ob2`.
            - Verificação se a Lista Está Vazia: `tamanhoLista` não é 0, então `this.cabeca.setNoProximo(novoNo);` define o próximo nó da cabeça como `novoNo`.
            - Definição das Referências: `novoNo.setNoProximo(this.cauda);` define o próximo nó de `novoNo` como a cauda.
            - Atualização da Referência à Cauda: `this.cauda = novoNo;`.
            - Incremento do Tamanho da Lista: `tamanhoLista++;`.

            Estado da Lista: `ob1 -> ob2 -> (Retorna ao início)`

    Método `remove(int index)`

    2) Removendo o objeto `ob2` na posição 1:

    1. **Remover `ob2` na Posição 1**:

        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;

        - Verificar se o Índice é Válido: `index` é 1, que é menor que `tamanhoLista`, então não lança exceção.
        - Obter o Nó Auxiliar: `noAuxiliar` começa como `cauda` (`ob1`).
        - Verificar se o Índice é 0:
            - Sim: Não se aplica aqui.
            - Não: Verificar se o Índice é 1:
                - Sim: `this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());` define o próximo nó da cauda como o próximo do próximo nó (`ob1.setNoProximo(ob1)`).
                - Não: Não se aplica aqui.
        - Decrementar o Tamanho da Lista: `tamanhoLista--;`.

        Estado da Lista: `ob1 -> (Retorna ao início)`

    Método `get(int index)`

    3)Obtendo o conteúdo do objeto na posição 0 (`ob1`):

        return getNo(index).getConteudo();

        - `getNo(index)` retorna `ob1`.
        - `ob1.getConteudo()` retorna o conteúdo de `ob1`.

        Método `getNo(int index)`

    4) Obtendo o nó na posição 0 (`ob1`):

        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;

        - Verificar se a Lista Está Vazia: `isEmpty()` retorna falso, então não lança exceção.
        - Verificar se o Índice é 0:
            - Sim: Retorna `this.cauda` (`ob1`).
            - Não: Não se aplica aqui.

    Método `isEmpty()`

    5) Verificando se a lista está vazia:

        return this.tamanhoLista == 0 ? true : false;

        - Retorna `this.tamanhoLista == 0`, que é falso.

        Método `size()`

      Obtendo o tamanho da lista:

        return this.tamanhoLista;

        - Retorna `tamanhoLista`, que é 1.

    Método `toString()`

    6) Construindo uma string representando a lista:

        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;

        - `noAuxiliar` começa como `cauda` (`ob1`).
        - O loop `for` percorre a lista:
            - `i = 0`: `strRetorno` é `[No{conteudo=ob1}]--->`.
        - Adiciona `(Retorna ao início)` ao final da string.

 */