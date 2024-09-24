package list;

import java.util.Iterator;
import java.util.LinkedList;

public class exercicio {
    public static void main(String[] args) throws Exception {
        
        LinkedList<Integer> listaTemperatura = new LinkedList<>();
        Integer somaTemperatura = 0;
        Integer mediaSemestral = 0;
        Integer mesAcontecido = 0;

        listaTemperatura.add(5);
        listaTemperatura.add(25);
        listaTemperatura.add(36);
        listaTemperatura.add(12);
        listaTemperatura.add(6);
        listaTemperatura.add(40);

        for (Integer temperatura : listaTemperatura) {
            somaTemperatura += temperatura;
        }

        mediaSemestral = (somaTemperatura / listaTemperatura.size());

        // Criando um novo Iterator para o segundo loop
        Iterator<Integer> temperaturasAcimaMedia = listaTemperatura.iterator();

        while (temperaturasAcimaMedia.hasNext()) {
            Integer temperatura = temperaturasAcimaMedia.next();
            if (temperatura > mediaSemestral) {
                mesAcontecido = listaTemperatura.indexOf(temperatura);

                switch (mesAcontecido) {
                    case 0 -> System.out.println("A temperatura de :" + temperatura + "º Graus está acima da média semestral de :" + mediaSemestral + "º Graus. Essa temperatura ocorreu no mês de Janeiro");
                    case 1 -> System.out.println("A temperatura de :" + temperatura + "º Graus está acima da média semestral de :" + mediaSemestral + "º Graus. Essa temperatura ocorreu no mês de Fevereiro");
                    case 2 -> System.out.println("A temperatura de :" + temperatura + "º Graus está acima da média semestral de :" + mediaSemestral + "º Graus. Essa temperatura ocorreu no mês de Março");
                    case 3 -> System.out.println("A temperatura de :" + temperatura + "º Graus está acima da média semestral de :" + mediaSemestral + "º Graus. Essa temperatura ocorreu no mês de Abril");
                    case 4 -> System.out.println("A temperatura de :" + temperatura + "º Graus está acima da média semestral de :" + mediaSemestral + "º Graus. Essa temperatura ocorreu no mês de Maio");
                    default -> System.out.println("A temperatura de :" + temperatura + "º Graus está acima da média semestral de :" + mediaSemestral + "º Graus. Essa temperatura ocorreu no mês de Junho");
                }
            }
        }

    }
}
