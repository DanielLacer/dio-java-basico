public class ReprodutorMusical implements Iphone {
    
    protected void tocar(){
        System.err.println("Está tocando música");
    }

    protected void pausar(){
        System.err.println("Musica pausada");
    }

    protected void selecionarMusica(String musica){
        System.err.println("Está tocando a seguinte música: "+ musica);
    }
}
