package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSNMessenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSNMessenger");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo o aplicativo de mensagem instantânea");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o aplicativo de mensagem instantânea");
    }
}

/*

 Encapsulamento

    No conceito de encapsulamento, os métodos validarConectadoInternet e salvarHistoricoMensagem são aplicados dentro da função enviarMensagem.
    Isso acontece porque o usuário do aplicativo de mensagem não precisa saber dos processos internos de como o aplicativo funciona.
    O usuário só precisa enviar uma mensagem, e os processos necessários para que isso ocorra devem ser privados ao sistema/classe.

 __________________

 Herança

    No conceito de herança, aplicativos como MSN, Facebook e Telegram executam ações como enviarMensagem, receberMensagem, entre outras.
    Portanto, seria uma boa prática de herança criar uma classe pai que inicializa essas ações para suas classes filhas, que só precisarão estender essa classe pai para usufruir das suas ações (públicas ou protegidas).
    Isso permite que o código fonte do projeto seja otimizado.

 __________________

 Abstração

    No conceito de abstração, todos os aplicativos, como MSN, Facebook e Telegram, executam ações como enviarMensagem, receberMensagem, entre outras.
    Porém, cada aplicativo pode desempenhar essas ações de maneiras diferentes e não necessariamente iguais.
    Assim, faz-se necessário que a classe pai ServicoMensagemInstantanea seja abstrata, assim como todos os seus métodos criados para serem herdados pelas suas classes filhas, pois não se sabe exatamente como esses métodos serão implementados.
    Concluindo, na classe pai, os métodos abstratos não devem ter um corpo, pois suas implementações devem estar nas suas classes filhas.

 __________________

 Polimorfismo

    No conceito de polimorfismo, assume-se que uma ação comum ou generalizada no mundo pode ser desempenhada por diferentes coisas ou objetos.
    Por exemplo: Tanto um cachorro quanto um gato fazem sons, tanto o Facebook quanto o Telegram enviam mensagens, e tanto uma moto quanto um carro ligam.
    Assim, já que objetos podem desempenhar uma ação comum de outros objetos, esses objetos logicamente herdam essa ação de uma classe pai (ou tipo comum).
    Portanto, quando definimos os tipos desses objetos, podemos definir seu tipo diretamente a partir da classe pai.
    Quando um objeto assume o tipo de uma classe pai que tem subclasses, podemos acessar os métodos das suas subclasses através desse objeto, dependendo da escolha do usuário.

 __________________

 Interface

    Interface pode ser resumida como a forma mais abstrata possível que vários objetos de inúmeros tipos diferentes de classes podem implementar. 
    A interface serve como um contrato que define métodos que devem ser implementados pelas classes que a assinam.
    A interface é uma solução para a limitação de herança múltipla em Java, pois uma classe não pode estender duas classes diferentes, mas pode implementar várias interfaces. 
    Isso permite que uma classe herde comportamentos de múltiplas fontes sem os problemas associados à herança múltipla.

*/