public abstract class AnimalVoadorAB extends AnimalAB {

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;
    protected int quantidadeAsas; // Normalmente 2 para animais voadores
    protected double envergaduraAsas;
    protected double altura;
    protected double peso;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAsas, double envergaduraAsas, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.altura = altura;
        this.peso = peso;
    }
}
