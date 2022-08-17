public class LadraoBuilder implements Builder {
    private int forca;
    private int vigor;
    private String nome;
    private int destreza;
    private int resistencia;
    private int inteligencia;

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Ladrao build() {
        return new Ladrao(nome, inteligencia, forca, vigor, resistencia, destreza);
    }
}