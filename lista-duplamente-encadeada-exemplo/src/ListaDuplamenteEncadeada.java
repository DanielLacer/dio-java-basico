public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}

/*

Analisando a classe `ListaDuplamenteEncadeada` abrangendo todos os cenários possíveis, usando os exemplos `ob1`, `ob2`, `ob2.5`, `ob3`, etc.

1) Adicionando o primeiro objeto `ob1` e depois adicionar `ob2` | Método `add(T elemento)`

    1. Adicionar `ob1`:

        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;

        - Criação do Novo Nó: `novoNo` é criado com `ob1`.
        - Definição das Referências: `novoNo.setNoProximo(null);` e `novoNo.setNoPrevio(ultimoNo);` (que é `null`).
        - Verificação se a Lista Está Vazia: `primeiroNo` é `null`, então `primeiroNo = novoNo;`.
        - Atualização do Último Nó: `ultimoNo` é `null`, então `ultimoNo.setNoProximo(novoNo);` não é executado.
        - Atualização da Referência ao Último Nó: `ultimoNo = novoNo;`.
        - Incremento do Tamanho da Lista: `tamanhoLista++;`.

        Estado da Lista: `ob1`

    2. Adicionar `ob2`:

        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;

        - Criação do Novo Nó: `novoNo` é criado com `ob2`.
        - Definição das Referências: `novoNo.setNoProximo(null);` e `novoNo.setNoPrevio(ultimoNo);` (que é `ob1`).
        - Verificação se a Lista Está Vazia: `primeiroNo` não é `null`, então `primeiroNo = novoNo;` não é executado.
        - Atualização do Último Nó: `ultimoNo` não é `null`, então `ultimoNo.setNoProximo(novoNo);` define `ob1.setNoProximo(ob2);`.
        - Atualização da Referência ao Último Nó: `ultimoNo = novoNo;`.
        - Incremento do Tamanho da Lista: `tamanhoLista++;`.

        Estado da Lista: `ob1 -> ob2`

2) Adicionando `ob2.5` na posição 2, entre `ob2` e `ob3` | Método `add(int index, T elemento)`

    NoDuplo<T> noAuxiliar = getNo(index);
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    novoNo.setNoProximo(noAuxiliar);
    if(novoNo.getNoProximo() != null){
        novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
        novoNo.getNoProximo().setNoPrevio(novoNo);
    } else {
        novoNo.setNoPrevio(ultimoNo);
        ultimoNo = novoNo;
    }
    if(index == 0){
        primeiroNo = novoNo;
    } else {
        novoNo.getNoPrevio().setNoProximo(novoNo);
    }
    tamanhoLista++;

    - Obter o Nó na Posição do Índice: `noAuxiliar` é `ob3`.
    - Criar o Novo Nó: `novoNo` é criado com `ob2.5`.
    - Definir o Próximo Nó do Novo Nó: `novoNo.setNoProximo(noAuxiliar);` define `ob2.5.setNoProximo(ob3);`.
    - Verificar se o Próximo Nó do Novo Nó não é `null`:
        - Sim: `novoNo.getNoProximo() != null` é verdadeiro.

            - `novoNo.setNoPrevio(noAuxiliar.getNoPrevio());` define `ob2.5.setNoPrevio(ob2);`.
            - `novoNo.getNoProximo().setNoPrevio(novoNo);` define `ob3.setNoPrevio(ob2.5);`.

        - Não: Não se aplica aqui.
    - Verificar se o Índice é 0:
        - Sim: Não se aplica aqui.
        - Não: 

            `novoNo.getNoPrevio().setNoProximo(novoNo);` define `ob2.setNoProximo(ob2.5);`.
    - Incrementar o Tamanho da Lista: `tamanhoLista++;`.

    Estado da Lista: `ob1 -> ob2 -> ob2.5 -> ob3`

3) Removendo o objeto `ob2.5` na posição 2 | Método `remove(int index)`

    if(index == 0){
        primeiroNo = primeiroNo.getNoProximo();
        if(primeiroNo != null){
            primeiroNo.setNoPrevio(null);
        }
    } else {
        NoDuplo<T> noAuxiliar = getNo(index);
        noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
        if(noAuxiliar != ultimoNo){
            noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
        } else {
            ultimoNo = noAuxiliar;
        }
    }
    tamanhoLista--;

    - Verificar se o Índice é 0:
        - Sim: Não se aplica aqui.
        - Não: `NoDuplo<T> noAuxiliar = getNo(index);` define `noAuxiliar` como `ob2.5`.
        
            - `noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());` define `ob2.setNoProximo(ob3);`.

    - Verificar se o Nó Auxiliar é o Último Nó:
        - Sim: Não se aplica aqui.
        - Não: 

            `noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());` define `ob3.setNoPrevio(ob2);`.

    - Decrementar o Tamanho da Lista: `tamanhoLista--;`.

    Estado da Lista: `ob1 -> ob2 -> ob3`

4) Obtendo o conteúdo do objeto na posição 2 (`ob3`) | Método `get(int index)`

    return getNo(index).getConteudo();

    - `getNo(index)` retorna `ob3`.
    - `ob3.getConteudo()` retorna o conteúdo de `ob3`.

5) Obtendo o nó na posição 2 (`ob3`): | Método `getNo(int index)`

    NoDuplo<T> noAuxiliar = primeiroNo;
    for(int i = 0; (i < index) && (noAuxiliar != null); i++){
        noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;

    - `noAuxiliar` começa como `primeiroNo` (`ob1`).
    - O loop `for` percorre a lista:
        - `i = 0`: `noAuxiliar` é `ob1`.
        - `i = 1`: `noAuxiliar` é `ob2`.
        - `i = 2`: `noAuxiliar` é `ob3`.
    - Retorna `noAuxiliar` (`ob3`).

6) Construindo uma string representando a lista | Método `toString()`

    String strRetorno = "";
    NoDuplo<T> noAuxiliar = primeiroNo;
    for(int i = 0; i < size(); i++){
        strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
        noAuxiliar = noAuxiliar.getNoProximo();
    }
    strRetorno += "null";
    return strRetorno;

    - `noAuxiliar` começa como `primeiroNo` (`ob1`).
    - O loop `for` percorre a lista:
        - `i = 0`: `strRetorno` é `[No{conteudo=ob1}]--->`.
        - `i = 1`: `strRetorno` é `[No{conteudo=ob1}]--->[No{conteudo=ob2}]--->`.
        - `i = 2`: `strRetorno` é `[No{conteudo=ob1}]--->[No{conteudo=ob2}]--->[No{conteudo=ob3}]--->`.
    - Adiciona `null` ao final da string.
 
 */

