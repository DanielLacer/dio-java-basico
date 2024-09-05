public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String primeiroNome = "Daniel";
        String segundoNome = "Lacerda";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: "+primeiroNome.concat(" ").concat(segundoNome);
    }
}
