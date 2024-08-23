public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
    }

    @Override
    public void comer(int comidaIngerida) {
        comida += comidaIngerida;
        System.out.println("O Elefante comeu " + comidaIngerida + " Gramas.");
    }

    @Override
    public void moverse(int caminhoPercorrido) {
        caminho += caminhoPercorrido;
        System.out.println("O Elefante percorreu " + caminhoPercorrido + " Kms.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("O Elefante dormiu " + horas + " Horas.");
    }

}
