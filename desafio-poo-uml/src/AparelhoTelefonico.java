public class AparelhoTelefonico implements Iphone {
    
    protected void iniciarCorreioVoz(){
        System.err.println("Iniciando Correio Voz");
    }

    protected void atender(){
        System.err.println("Atendendo telefone...");
    }

    protected void ligar(String numero){
        System.err.println("Ligando para o número: "+numero);
    }
}
