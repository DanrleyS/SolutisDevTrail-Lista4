public class Cachorro extends AnimalAB{

    @Override
    public void comer(int comidaIngerida) {
        comida += comidaIngerida;
        System.out.println("O cachorro comeu " + comidaIngerida + " Gramas.");
    }

    @Override
    public void moverse(int caminhoPercorrido) {
        caminho += caminhoPercorrido;
        System.out.println("O cachorro percorreu " + caminhoPercorrido + " Kms.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("O cachorro dormiu " + horas + " Horas.");
    }
}
