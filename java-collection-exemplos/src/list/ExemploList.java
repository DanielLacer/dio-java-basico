package list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        // Cria uma lista de Double usando Generics (jdk 5) e Diamond Operator (jdk 7)
        List<Double> notas = new ArrayList<Double>(); 
        notas.add(7.0); // Adiciona a nota 7.0 à lista
        notas.add(8.5); // Adiciona a nota 8.5 à lista
        notas.add(9.3); // Adiciona a nota 9.3 à lista
        notas.add(5.0); // Adiciona a nota 5.0 à lista
        notas.add(7.0); // Adiciona a nota 7.0 à lista
        notas.add(0.0); // Adiciona a nota 0.0 à lista
        notas.add(3.6); // Adiciona a nota 3.6 à lista
        System.out.println(notas.toString()); // Exibe a lista de notas

        // Exibe a posição da nota 5.0 na lista
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        // Adiciona a nota 8.0 na posição 4 da lista
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas); // Exibe a lista atualizada

        // Substitui a nota 5.0 pela nota 6.0 na lista
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas); // Exibe a lista atualizada

        // Verifica se a nota 5.0 está na lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        /* Exibe todas as notas na ordem em que foram informadas
        for (Double nota : notas) System.out.println(nota);*/

        // Exibe a terceira nota adicionada (índice 2)
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString()); // Exibe a lista de notas

        // Exibe a menor nota da lista
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Exibe a maior nota da lista
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Calcula a soma de todas as notas usando um Iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma); // Exibe a soma das notas

        // Exibe a média das notas
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        // Remove a nota 0 da lista
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas); // Exibe a lista atualizada

        // Remove a nota da posição 0 (primeiro elemento) da lista
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas); // Exibe a lista atualizada

        // Remove as notas menores que 7 e exibe a lista
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas); // Exibe a lista atualizada

        /* Apaga toda a lista
        notas.clear();
        System.out.println(notas);*/

        // Verifica se a lista está vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*
        double a = 5d; // Explicitamente um double
        float b = 5.4f; // Explicitamente um float
        int c = 5; // Explicitamente um int   
         */

    }
}
