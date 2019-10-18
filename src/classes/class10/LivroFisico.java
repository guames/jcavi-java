package classes.class10;

public class LivroFisico extends Livro{

    public LivroFisico(String nome,
                       String descricao,
                       double valor,
                       Autor autor,
                       String isbn,
                       double porcentagemDesconto) {
        super(nome, descricao, valor, isbn, autor, porcentagemDesconto);
        super.aplicaDescontoDe();
    }

    public Double getTaxaImpressao(){
        return super.getValor() * 0.05;
    }

    /**
     * Mostra os valores preenchidos do livro e do autor dentro do livro caso exista.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "taxa de impressao: " + getTaxaImpressao();
    }
}
