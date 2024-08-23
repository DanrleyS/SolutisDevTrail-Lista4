public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    @Override
    public void comer(int comidaIngerida) {
        comida += comidaIngerida;
        System.out.println("O Peixe comeu " + comidaIngerida + " Gramas.");
    }

    @Override
    public void moverse(int caminhoPercorrido) {
        caminho += caminhoPercorrido;
        System.out.println("O Peixe percorreu " + caminhoPercorrido + " Kms.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("O Peixe dormiu " + horas + " Horas.");
    }

}