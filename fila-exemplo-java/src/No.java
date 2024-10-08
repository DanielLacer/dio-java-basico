public class No<T> {

    private T object;
    private No<T> refNo;

    public No(){
    }

    public No(T object){
        this.refNo = null;
        this.object = (T) object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = (T) object;
    }

    public No getRefNo() {
        return refNo;
    }

    //getRefNo sempre retorna o nó posterior ao atual. Por exemplo: Se o "refNoEntradaFila" é ob2, getRefNo retorna o ob1.

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    //setRefNo sempre seta o nó posterior ao no atual. Ou seja, se o no atual é o ob2, ele seta na sua referência o objeto ob1

    @Override
    public String toString() {
        return ("No{" +
                "object=" + object +
                '}');
    }
}