import apps.FacebookMessanger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        switch (appEscolhido) {
            case "msn" -> smi = new MSNMessenger();
            case "fbm" -> smi = new FacebookMessanger();
            case "tlg" -> smi = new Telegram();
            default -> {
            }
        }

        smi.abrir();
        smi.enviarMensagem();
        smi.receberMensagem();
        smi.fechar();
    }
}
