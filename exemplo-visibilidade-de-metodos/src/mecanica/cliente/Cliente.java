package mecanica.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void agendarServico() {
        System.out.println("Serviço agendado.");
    }
    // Método público porque representa uma ação que o cliente pode realizar.

    public void cancelarServico() {
        System.out.println("Serviço cancelado.");
    }
    // Método público porque representa uma ação que o cliente pode realizar.

    public void pagarServico() {
        System.out.println("Serviço pago.");
    }
    // Método público porque representa uma ação que o cliente pode realizar.

    public void avaliarServico() {
        System.out.println("Serviço avaliado.");
    }
    // Método público porque representa uma ação que o cliente pode realizar.

    public void solicitarOrcamento() {
        System.out.println("Orçamento solicitado.");
    }
    // Método público porque representa uma ação que o cliente pode realizar.
}
