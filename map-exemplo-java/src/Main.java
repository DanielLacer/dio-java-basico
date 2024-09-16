import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String args[]){

        // Cria um HashMap para armazenar informações de um aluno
        Map<String, String> aluno = new HashMap<>();

        // Adiciona informações ao HashMap
        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        // Imprime o HashMap
        System.out.println(aluno);

        // Imprime as chaves do HashMap
        System.out.println(aluno.keySet());
        // Imprime os valores do HashMap
        System.out.println(aluno.values());

        // Cria uma lista de HashMaps para armazenar múltiplos alunos
        List<Map<String, String>> listaAlunos = new ArrayList<>();

        // Adiciona o HashMap do aluno à lista
        listaAlunos.add(aluno);

        // Cria um segundo HashMap para armazenar informações de outro aluno
        Map<String, String> aluno2 = new HashMap<>();

        // Adiciona informações ao segundo HashMap
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");

        // Adiciona o segundo HashMap à lista
        listaAlunos.add(aluno2);

        // Imprime a lista de HashMaps
        System.out.println(listaAlunos);

        // Verifica se o HashMap do primeiro aluno contém a chave "Nome"
        System.out.println(aluno.containsKey("Nome"));
    }

}

/*
  
    Diferença entre HashMap e ArrayList

    HashMap:

        Estrutura: Armazena pares chave-valor.
        Acesso: Acesso rápido aos valores através das chaves (O(1) na média).
        Ordenação: Não mantém a ordem dos elementos.
        Duplicatas: Não permite chaves duplicadas, mas permite valores duplicados.
        Uso: Ideal para cenários onde você precisa de acesso rápido a dados através de uma chave única.

    ArrayList:

        Estrutura: Armazena elementos em uma lista ordenada.
        Acesso: Acesso rápido aos elementos através de índices (O(1)).
        Ordenação: Mantém a ordem de inserção dos elementos.
        Duplicatas: Permite elementos duplicados.
        Uso: Ideal para cenários onde você precisa de uma lista ordenada de elementos e acesso rápido por índice.
  
 */
