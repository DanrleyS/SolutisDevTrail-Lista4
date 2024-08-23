//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalIF cachorro1 = new Cachorro();
        cachorro1.comer(500);
        cachorro1.moverse(2);
        cachorro1.dormir(6);

        AnimalIF gato1 = new Gato();
        gato1.comer(200);
        gato1.moverse(1);
        gato1.dormir(10);

        AnimalIF elefante1 = new Elefante();
        elefante1.comer(2000);
        elefante1.moverse(5);
        elefante1.dormir(6);

        AnimalIF leao1 = new Leao();
        leao1.comer(1500);
        leao1.moverse(8);
        leao1.dormir(8);

    }
}