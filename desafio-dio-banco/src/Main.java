import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<IConta> contas = new ArrayList<>();

    public static void main(String[] args) {
        int acao = 0;
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            do {
                System.out.println("Digite a sua ação: 1 - Cadastrar Cliente, 2 - Sacar, 3 - Transferir, 4 - Depositar, 5 - Imprimir Extrato, 6 - Listar todos os clientes, 7 - Sair ");
                acao = scanner.nextInt();

                switch (acao) {
                    case 1 -> cadastrarCliente(scanner);
                    case 2 -> realizarSaque(scanner);
                    case 3 -> realizarTransferencia(scanner);
                    case 4 -> realizarDeposito(scanner);
                    case 5 -> imprimirExtrato(scanner);
                    case 6 -> listarClientes();
                }
            } while (acao != 7);
        }
    }

    private static void cadastrarCliente(Scanner scanner) {

        System.out.println("Digite o nome do novo cliente:");
        String nome = scanner.next();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        clientes.add(cliente);

        System.out.println("Selecione o tipo de conta do novo cliente: 1 - Conta Corrente, 2 - Conta Poupança");
        int tipoConta = scanner.nextInt();

        IConta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(cliente);
        } else {
            conta = new ContaPoupanca(cliente);
        }
        contas.add(conta);

        System.out.println("Cliente e conta cadastrados com sucesso!");
    }

    private static void realizarSaque(Scanner scanner) {
        
        IConta conta = selecionarConta(scanner);
        if (conta != null) {
            System.out.println("Selecione o valor a ser sacado:");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
            System.out.println("Saque feito com sucesso!");
        }
    }

    private static void realizarTransferencia(Scanner scanner) {

        IConta contaOrigem = selecionarConta(scanner);
        if (contaOrigem != null) {

            System.out.println("Digite o nome do proprietário da conta a ser transferido:");
            String nomeRemetente = scanner.next();
            Cliente clienteDestino = encontrarClientePorNome(nomeRemetente);

            if (clienteDestino != null) {
                IConta contaDestino = encontrarContaPorCliente(clienteDestino);
                if (contaDestino != null) {
                    System.out.println("Selecione o valor a ser transferido:");
                    double valor = scanner.nextDouble();
                    contaOrigem.transferir(valor, contaDestino);
                    System.out.println("Transferência feita com sucesso!");
                } else {
                    System.out.println("Conta do cliente não encontrada.");
                }
            } else {
                System.out.println("Cliente não encontrado.");
            }
        }
    }

    private static void realizarDeposito(Scanner scanner) {

        IConta conta = selecionarConta(scanner);
        if (conta != null) {
            System.out.println("Selecione o valor a ser depositado:");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito feito com sucesso!");
        }
    }

    private static void imprimirExtrato(Scanner scanner) {

        IConta conta = selecionarConta(scanner);
        if (conta != null) {
            conta.imprimirExtrato();
        }
    }

    private static IConta selecionarConta(Scanner scanner) {
        System.out.println("Digite o nome do proprietário da conta:");
        String nome = scanner.next();
        Cliente cliente = encontrarClientePorNome(nome);

        if (cliente != null) {
            return encontrarContaPorCliente(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
            return null;
        }
    }

    private static Cliente encontrarClientePorNome(String nome) {

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    private static IConta encontrarContaPorCliente(Cliente cliente) {
        
        for (IConta conta : contas) {
            if (conta.getCliente().equals(cliente)) {
                return conta;
            }
        }
        return null;
    }

    private static void listarClientes() {
        
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome do cliente: "+cliente.getNome());
        }
    }
}
