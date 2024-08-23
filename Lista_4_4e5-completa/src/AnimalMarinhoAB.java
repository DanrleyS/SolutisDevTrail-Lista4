
public abstract class AnimalMarinhoAB extends AnimalAB {

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }


}
