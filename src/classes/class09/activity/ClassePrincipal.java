package classes.class09.activity;

import java.util.ArrayList;
import java.util.List;

public class ClassePrincipal {

    public static void main(String[] args) {

        Acao acaoPetrobras = new Acao("Acao da Petro",
                "PTR4",
                26.84,
                400);

        Acao acaoUsiminas = new Acao("Acao da Usiminas",
                "USIM5",
                7.34,
                300);

        Acao acaoGerdau = new Acao("Acao da Gerdau",
                "GOAU4",
                6.45,
                600);

        //criacao do objeto lista de acoes
        List<Acao> acoes = new ArrayList<Acao>();

        // adicionando acoes
        acoes.add(acaoPetrobras);
        acoes.add(acaoUsiminas);
        acoes.add(acaoGerdau);

        Carteira carteira = new Carteira(acoes);

        Investidor investidor = new Investidor("Gustavo Ames",
                "000.000.000-00",
                carteira);

        System.out.println(investidor.toString());

    }
}
