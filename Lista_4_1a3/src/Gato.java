public class Gato extends AnimalAB{

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
