import java.util.Locale;
import java.util.Scanner;

public class telefone {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite qual aplicativo você deseja entrar");
            String escolherAplicativo = scanner.next();
            
            System.out.println("Digite ação do "+escolherAplicativo+" que desejas efetuar");
            String escolherAcao = scanner.next();
            
            switch (escolherAplicativo) {
                case "AparelhoTelefonico" -> {
                    AparelhoTelefonico apt = new AparelhoTelefonico();
                    
                    if(escolherAcao.equals("iniciarCorreioVoz")){
                        apt.iniciarCorreioVoz();
                    }else if(escolherAcao.equals("atender")){
                        apt.atender();
                    }else if(escolherAcao.equals("ligar")){
                        System.out.println("Disque o número do telefone");
                        String numero = scanner.next();
                        apt.ligar(numero);
                    }
                }
                case "NavegadorInternet" -> {
                    NavegadorInternet nav = new NavegadorInternet();
                    
                    if(escolherAcao.equals("atualizarPagina")){
                        nav.atualizarPagina();
                    }else if(escolherAcao.equals("adicionarNovaAba")){
                        nav.adicionarNovaAba();
                    }else if(escolherAcao.equals("exibirPagina")){
                        nav.exibirPagina("");
                    }
                }
                case "ReprodutorMusical" -> {
                    ReprodutorMusical rep = new ReprodutorMusical();
                    
                    if(escolherAcao.equals("tocar")){
                        rep.tocar();
                    }else if(escolherAcao.equals("pausar")){
                        rep.pausar();
                    }else if(escolherAcao.equals("selecionarMusica")){
                        System.out.println("Digite o nome da música que queira tocar");
                        String musica = scanner.next();
                        rep.selecionarMusica(musica);
                    }
                }
            }
        }
    }

}
