public class NaveEspacialDecorator extends NaveEspacial{
    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(int saude, int ataque) {
        super(saude, ataque);
    }

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.naveDecorada = naveEspacial;
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }
}
