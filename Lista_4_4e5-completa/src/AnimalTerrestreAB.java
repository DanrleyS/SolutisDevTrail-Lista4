public abstract class AnimalTerrestreAB extends AnimalAB {

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas; // Normalmente >= 2 para animais terrestres
    protected double altura;
    protected double peso;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.altura = altura;
        this.peso = peso;
    }
}

