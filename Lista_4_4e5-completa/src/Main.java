//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnimalMarinhoAB peixe1 = new Peixe("colorado","peixe branco", 3, "agua", 0.3, 1.2);
        peixe1.comer(50);
        peixe1.moverse(5);
        peixe1.dormir(10);

        AnimalVoadorAB pombo1 = new Pombo("pombo", "ave", 5, "céu", 2, 2, 0.2, 0.7,700);
        pombo1.comer(100);
        pombo1.moverse(30);
        pombo1.dormir(7);

        AnimalIF cachorro1 = new Cachorro("dog", "doméstico", 3, "casa", 4, 0.6, 3.5);
        cachorro1.comer(500);
        cachorro1.moverse(2);
        cachorro1.dormir(6);

        AnimalIF gato1 = new Gato("gato", "doméstico", 2, "casa", 4, 0.4, 1.8);
        gato1.comer(200);
        gato1.moverse(1);
        gato1.dormir(10);

        AnimalIF elefante1 = new Elefante("elefante", "selvagem", 5, "Savana", 4, 2.5, 700);
        elefante1.comer(2000);
        elefante1.moverse(5);
        elefante1.dormir(6);

        AnimalIF leao1 = new Leao("Leão", "selvagem", 7, "savana",4, 1.3, 60);
        leao1.comer(1500);
        leao1.moverse(8);
        leao1.dormir(8);
    }
}