public class Impressao {
    private TamanhoImpressao tamanhoImpressao;
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal(){
        switch (tamanhoImpressao){
            case A2:
                this.valorColoridasFrenteVerso = 0.28;
                this.valorColoridasFrenteApenas = 0.32;
                this.valorPretoBrancoFrenteVerso = 0.18;
                this.valorPretoBrancoFrenteApenas = 0.22;
                break;
            case A3:
                this.valorColoridasFrenteVerso = 0.25;
                this.valorColoridasFrenteApenas = 0.30;
                this.valorPretoBrancoFrenteVerso = 0.15;
                this.valorPretoBrancoFrenteApenas = 0.20;
                break;
            case A4:
                this.valorColoridasFrenteVerso = 0.20;
                this.valorColoridasFrenteApenas = 0.25;
                this.valorPretoBrancoFrenteVerso = 0.10;
                this.valorPretoBrancoFrenteApenas = 0.15;
                break;
        }

        int paginasPretoBranco = paginasTotais - paginasColoridas;
        if(ehFrenteVerso){
            return (paginasColoridas * valorColoridasFrenteVerso) + (paginasPretoBranco * valorPretoBrancoFrenteVerso);
        } else {
            return (paginasColoridas * valorColoridasFrenteApenas) + (paginasPretoBranco * valorPretoBrancoFrenteApenas);
        }
    }

    @Override
    public String toString() {
        String frenteVerso = "frente apenas.";
        if(ehFrenteVerso) frenteVerso = "frente e verso.";

        return String.format("total de paginas: %d, total coloridas: %d, " +
                "total preto e branco: %d, frente e verso: %s total: %.2f", paginasTotais,
                paginasColoridas, paginasTotais - paginasColoridas, frenteVerso, calcularTotal());
    }
}
