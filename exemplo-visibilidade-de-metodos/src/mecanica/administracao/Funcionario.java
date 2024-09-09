package mecanica.administracao;

public class Funcionario {
    private String nome;
    private String especialidade;
    private double salario;

    public Funcionario(String nome, String especialidade, double salario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    String getNome(){
        return nome;
    }

    public void realizarReparo() {
        System.out.println("Reparo realizado.");
    }
    // Método público porque representa uma ação que o funcionário pode realizar.

    public void diagnosticarProblema() {
        System.out.println("Problema diagnosticado.");
    }
    // Método público porque representa uma ação que o funcionário pode realizar.

    protected void solicitarPeca() {
        System.out.println("Peça solicitada.");
    }
    // Método protegido porque apenas classes dentro do mesmo pacote ou subclasses devem poder solicitar peças.

    protected void atualizarCliente() {
        System.out.println("Cliente atualizado.");
    }
    // Método protegido porque apenas classes dentro do mesmo pacote ou subclasses devem poder atualizar clientes.

    private void finalizarServico() {
        System.out.println("Serviço finalizado.");
    }
    // Método privado porque a finalização do serviço é um detalhe interno do funcionário.

    void organizarFerramentas() {
        System.out.println("Ferramentas organizadas.");
    }
    // Método com visibilidade padrão porque a organização das ferramentas é uma ação interna do funcionário e deve ser acessível apenas dentro do mesmo pacote.

    void diaDoPagamento(Administracao administracao) {
        administracao.pagarSalario(this, salario);
    }
    // Método com visibilidade padrão porque o pagamento do salário é uma ação interna do funcionário e deve ser acessível apenas dentro do mesmo pacote.
}
