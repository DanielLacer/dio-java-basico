import mecanica.administracao.Administracao;
import mecanica.administracao.Funcionario;
import mecanica.cliente.Cliente;

public class Controller {
    
    private Estabelecimento estabelecimento;
    private Administracao administracao;
    private Funcionario funcionario;
    private Cliente cliente;

    // Método principal que cria uma instância do controlador e inicia o serviço.
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.iniciarServico();
    }

    public Controller() {
        this.estabelecimento = new Estabelecimento("Oficina ABC", "Rua das Flores, 123", "1234-5678");
        this.administracao = new Administracao("João", "Gerente", 5000.0);
        this.funcionario = new Funcionario("Carlos", "Mecânico", 3000.0);
        this.cliente = new Cliente("Maria", "123.456.789-00", "9876-5432");
    }

    // Método público porque representa uma ação que o controlador pode realizar para iniciar um serviço.
    public void iniciarServico() {
        cliente.agendarServico();
        funcionario.realizarReparo();
    }

}

/*
 
 Resumo dos Modificadores de Visibilidade em Java
 
 public:

    Acesso: Qualquer classe pode acessar.
    Uso: Quando você quer que o método ou variável seja acessível de qualquer lugar.
    Exemplo: Métodos que representam ações que qualquer classe pode realizar, como public void agendarServico() na classe Cliente.

 protected:

    Acesso: Classes no mesmo pacote e subclasses.
    Uso: Quando você quer que o método ou variável seja acessível apenas dentro do mesmo pacote ou por subclasses.
    Exemplo: Métodos que representam ações internas que podem ser realizadas por subclasses, como protected void contratarFuncionario() na classe Administracao.

 default (sem modificador):

    Acesso: Classes no mesmo pacote.
    Uso: Quando você quer que o método ou variável seja acessível apenas dentro do mesmo pacote.
    Exemplo: Métodos que representam ações internas que devem ser acessíveis apenas dentro do mesmo pacote, como void organizarFerramentas() na classe Funcionario.

 private:
 
    Acesso: Apenas dentro da própria classe.
    Uso: Quando você quer que o método ou variável seja acessível apenas dentro da própria classe.
    Exemplo: Métodos que representam detalhes internos que não devem ser acessíveis de fora da classe, como private void realizarManutencao() na classe Estabelecimento.
 
*/
