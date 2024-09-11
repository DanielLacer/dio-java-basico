public enum Pais {
    BRA("BRA", "Brasil", "Brasília"),
    ARG("ARG", "Argentina", "Buenos Aires"),
    BOL("BOL", "Bolívia", "Sucre");
    //Criando o número de objetos que vão está disponíveis da classe enum Pais

    private final String sigla;
    private final String nome;
    private final String capital;

    // Construtor
    Pais(String sigla, String nome, String capital) {
        this.sigla = sigla;
        this.nome = nome;
        this.capital = capital;
    }

    // Getters
    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }
}
