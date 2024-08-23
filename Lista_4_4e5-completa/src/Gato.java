public class Gato extends AnimalTerrestreAB{

    public Gato(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
    }

    @Override
    public void comer(int comidaIngerida) {
        comida += comidaIngerida;
        System.out.println("O gato comeu " + comidaIngerida + " Gramas.");
    }

    @Override
    public void moverse(int caminhoPercorrido) {
        caminho += caminhoPercorrido;
        System.out.println("O gato percorreu " + caminhoPercorrido + " Kms.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("O gato dormiu " + horas + " Horas.");
    }

}
