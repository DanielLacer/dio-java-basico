public class Estabelecimento {
    private String nome;
    private String endereco;
    private String telefone;

    public Estabelecimento(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    private void abrir() {
        System.out.println("Estabelecimento aberto.");
    }
    // Método privado porque apenas o próprio estabelecimento deve poder abrir.

    private void fechar() {
        System.out.println("Estabelecimento fechado.");
    }
    // Método privado porque apenas o próprio estabelecimento deve poder fechar.

    private void realizarManutencao() {
        System.out.println("Manutenção realizada.");
    }
    // Método privado porque a manutenção é um detalhe interno do estabelecimento.
}
