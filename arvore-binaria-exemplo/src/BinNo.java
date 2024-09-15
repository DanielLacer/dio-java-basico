public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo){
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public BinNo(){ 
    }

    public T getConteudo() {
        return conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public T setConteudo(T conteudo) {
        return this.conteudo = conteudo;
    }

    public BinNo<T> setNoEsq(BinNo<T> noEsq) {
        return this.noEsq = noEsq;
    }

    public BinNo<T> setNoDir(BinNo<T> noDir) {
        return this.noDir = noDir;
    }

}
