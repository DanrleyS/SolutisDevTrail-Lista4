public abstract class AnimalAB implements AnimalIF {
    protected int comida;
    protected int caminho;
    protected int horasDormidas;

    @Override
    public abstract void comer(int comida);

    @Override
    public abstract void moverse(int caminho);

    @Override
    public abstract void dormir(int horasDormidas);

}
