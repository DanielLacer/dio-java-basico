public class NavegadorInternet implements Iphone {
    
    protected void atualizarPagina(){
        System.err.println("Pagina atualizada");
    }

    protected void adicionarNovaAba(){
        System.err.println("Nova aba adicionada");
    }

    protected void exibirPagina(String url){
        System.err.println("Pagina sendo exebida...");
    }
}
