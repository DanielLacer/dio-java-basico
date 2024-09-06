public class TerminalArgumentos {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        /*
          Para gerar o arquivo java compilado, você deve executar o comando "Ctrl + Shift + B" onde através do task.json, ele irá fazer essa tarefa de forma automática.
          Atenção: Não dá para executar um arquivo java pelo CMD depois de ter modificado ele, sem ter compilado.
        */

        /*
          Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo String. 
          Logo, depois de compilada, é possível passar os valores de parametros através do CMD como: java TerminalArgumentos "Daniel" "Lacerda" "21" "1.80" 

          Também é possível passar esses valores através de json como o launch.json:

            "version": "0.2.0",
            "configurations": [
                {
                    "type": "java",
                    "name": "Current File",
                    "request": "launch",
                    "mainClass": "${file}"
                },
                {
                    "type": "java",
                    "name": "TerminalArgumentos",
                    "request": "launch",
                    "mainClass": "TerminalArgumentos",
                    "args": ["Daniel", "Lacerda", "21", "1.80"]
                },
                {
                    "type": "java",
                    "request": "launch",
                    "mainClass": "AboutMe",
                }
            ]
         */
    }
}
