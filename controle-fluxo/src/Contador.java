import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner terminal  = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int parametroUm = terminal.nextInt();
 
        System.out.println("Digite o segundo número");
        int parametroDois = terminal.nextInt();

        try {

			contar(parametroUm, parametroDois);	
            
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;

        for(int x=1; x <= contagem; x++){
            System.out.println("Imprimindo o número "+x);
        }
	}
}
