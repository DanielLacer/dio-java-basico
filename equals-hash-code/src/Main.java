import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Carro> listaCarros = new ArrayList<>();
        Carro chevrolet = new Carro("Chevrolet");

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros);
        
        for(Carro carro: listaCarros){
            
            if(((Carro) carro).getMarca().equals(chevrolet.getMarca())){
                System.out.println("O modelo atual é um chevrolet com o seguinte hashCode: "+carro.hashCode());
                System.out.println(chevrolet.hashCode());
            }
        }
        
    }

}
