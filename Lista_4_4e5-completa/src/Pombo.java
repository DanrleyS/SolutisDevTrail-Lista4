public class Pombo extends AnimalVoadorAB{

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAsas, double envergaduraAsas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, quantidadeAsas, envergaduraAsas, altura, peso);
    }

    @Override
    public void comer(int comidaIngerida) {
        comida += comidaIngerida;
        System.out.println("O Pombo comeu " + comidaIngerida + " Gramas.");
    }

    @Override
    public void moverse(int caminhoPercorrido) {
        caminho += caminhoPercorrido;
        System.out.println("O Pombo percorreu " + caminhoPercorrido + " Kms.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("O Pombo dormiu " + horas + " Horas.");
    }

}