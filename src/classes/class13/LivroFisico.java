package classes.class13;


public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(String nome,
                       String descricao,
                       double valor,
                       Autor autor,
                       String isbn,
                       double porcentagemDesconto) {
        super(nome, descricao, valor, isbn, autor, porcentagemDesconto);
        aplicaDescontoDe();
    }

    /**
     * Aplicar desconto sobre o valor.
     */
    public void aplicaDescontoDe(){
        if(super.getPorcentagemDesconto() <= 0.30) {
            Double conta =
                    super.getValor() -
                            ( super.getValor() * super.getPorcentagemDesconto() );
            super.setValor(conta);
        }
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
