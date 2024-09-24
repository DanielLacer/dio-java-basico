package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
   Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
   e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class exercicioComStream {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scan = new Scanner(System.in);
        
        // Cria uma lista para armazenar as temperaturas
        List<Double> temperaturas = new ArrayList<Double>();

        // Adicionando as temperaturas na lista:
        int count = 0;
        while (true) {
            if (count == 6) break; // Sai do loop após 6 entradas

            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble(); // Lê a temperatura do usuário
            temperaturas.add(temp); // Adiciona a temperatura à lista
            count++;
        }
        System.out.println("-----------------");
        
        // Exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " ")); // Exibe todas as temperaturas

        // Calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue) // Converte a lista para um stream de doubles
                .average() // Calcula a média das temperaturas
                .orElse(0d); // Retorna 0 se a lista estiver vazia
        System.out.printf("\nMédia das temperaturas: %.1f\n", media); // Exibe a média

        // Exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media) // Filtra as temperaturas acima da média
                .forEach(t -> System.out.printf("%.1f ", t)); // Exibe as temperaturas acima da média

        // Exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator(); // Cria um iterator para a lista de temperaturas

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next(); // Obtém a próxima temperatura
            if (temp > media) {
                // Exibe o mês correspondente à temperatura acima da média
                switch (count) {
                    case (0) -> System.out.printf("1 - janeiro: %.1f\n ", temp);
                    case (1) -> System.out.printf("2 - fevereiro: %.1f\n", temp);
                    case (2) -> System.out.printf("3 - março: %.1f\n", temp);
                    case (3) -> System.out.printf("4 - abril: %.1f\n", temp);
                    case (4) -> System.out.printf("5 - maio: %.1f\n", temp);
                    case (5) -> System.out.printf("6 - junho: %.1f\n", temp);
                    default -> System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
