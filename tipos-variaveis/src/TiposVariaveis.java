public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
        //Lista de declarações possíveis de variáveis primitivas em Java
        byte variavelByte = 127;
        short variavelShort = 32767;
        int variavelInt = 2147483647;
        long variavelLong = 9223372036854775807L;
        float variavelFloat = 3.14f;
        double variavelDouble = 3.141592653589793;
        char variavelChar = 'A';
        boolean variavelBoolean = true;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //Caso necessário, se você quiser passar uma variável de um tipo para outro tipo com menas "precisão", é necessario referir o tipo da variável na sua frente.

        //Constantes em Java é escrito com "final "
        final double valor_pi = 3.14;

        //Se eu quiser converter um número negativo em java, basta multiplicar o mesmo número para -1.

        //Caso na mesma linha eu quero que o java interpreta o sinal de "+"" não mais como concatenador e sim operador, só usar os () para isolar os "+" que vão atribuir"
        //int numero = "1"+(1+1+1)

        //Para negar (deixar-la como "false") uma variável booleana, basta colocar o sinal "!" na sua frente.

        //Para comparar o contéudo de uma variável e um objeto em java, deve se usar o método equals(). 
        //Caso contrário, o operador "==" compara sua referencia da memória, não o conteúdo em si.

        String nomeUm = "Daniel";
        String nomeDois = new String("Daniel");

        System.out.println(nomeUm.equals(nomeDois));

        /* 
          Quando você declara String nomeUm = "Daniel";, a variável nomeUm em si está na memória Stack,
          mas o valor "Daniel" que ela referencia está no String Pool, que é uma área especial dentro da memória Heap.
          
          Por outro lado, quando você declara String nomeDois = new String("Daniel");, a variável nomeDois também está na memória Stack,
          mas o valor "Daniel" que ela referencia é um novo objeto criado na memória Heap, fora do String Pool.
          
          Portanto, mesmo que nomeUm e nomeDois contenham o mesmo valor "Daniel", suas referências de memória são diferentes:
          
          nomeUm referencia o valor no String Pool.
          nomeDois referencia um novo objeto na memória Heap.
          
          É por isso que nomeUm == nomeDois retorna false, mas nomeUm.equals(nomeDois) retorna true,
          pois equals() compara o conteúdo das Strings, enquanto == compara as referências de memória.

        */
              
    }
}
