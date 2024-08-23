public class Leao extends AnimalAB{

    @Override
    public void comer(int comidaIngerida) {
        comida += comidaIngerida;
        System.out.println("O Leão comeu " + comidaIngerida + " Gramas.");
    }

    @Override
    public void moverse(int caminhoPercorrido) {
        caminho += caminhoPercorrido;
        System.out.println("O Leão percorreu " + caminhoPercorrido + " Kms.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("O Leão dormiu " + horas + " Horas.");
    }

}
