package mecanica.administracao;

public class Administracao {
    private String nome;
    private String cargo;
    private double salario;

    public Administracao(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    private void gerenciarFinancas() {
        System.out.println("Finanças gerenciadas.");
    }
    // Método privado porque a administração deve poder gerenciar as finanças do lugar.

    private void contratarFuncionario() {
        System.out.println("Funcionário contratado.");
    }
    // Método prviado porque só a administração pode contratar algúem

    private void demitirFuncionario() {
        System.out.println("Funcionário demitido.");
    }
    // Método prviado porque só a administração pode demitir algúem

    void organizarAgenda() {
        System.out.println("Agenda organizada.");
    }
    // Método com visibilidade padrão porque a organização da agenda é uma ação interna da administração e deve ser acessível apenas dentro do mesmo pacote.

    private void atenderCliente() {
        System.out.println("Cliente atendido.");
    }
    // Método privado porque o atendimento ao cliente é um detalhe interno da administração.

    void pagarSalario(Funcionario funcionario, double quantia) {
        System.out.println("Salário de " + quantia + " pago a " + funcionario.getNome());
    }
    // Método com visibilidade padrão porque o pagamento de salário é uma ação interna da administração e deve ser acessível apenas dentro do mesmo pacote.
}
