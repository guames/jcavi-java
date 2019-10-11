package classes.class09.activity;

import java.util.List;

public class Carteira {

    List<Acao> acoes;

    public Carteira(List<Acao> acoes) {
        this.acoes = acoes;
    }

    public List<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<Acao> acoes) {
        this.acoes = acoes;
    }

    public Double getValorTotalInvestido(){
        Double valorTotalInvestido = 0.0;

        for (Acao acao: acoes) {
            valorTotalInvestido += acao.getValorInvestido();
        }

        return valorTotalInvestido;
    }

    @Override
    public String toString() {
        return "\n Carteira{" +
                "\n acoes=" + acoes.toString() +
                "\n valor total investido=" + getValorTotalInvestido() +
                '}';
    }
}
