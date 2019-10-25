package classes.class11;

public class Ebook extends Livro {

    private String waterMark;

    public Ebook(String nome,
                 String descricao,
                 double valor,
                 Autor autor,
                 String isbn,
                 double porcentagemDesconto,
                 String waterMark) {
        super(nome, descricao, valor, isbn, autor, porcentagemDesconto);
        this.waterMark = waterMark;
        aplicaDescontoDe();
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    /**
     * Aplicar desconto sobre o valor.
     */
    @Override
    public void aplicaDescontoDe(){
        if(super.getPorcentagemDesconto() <= 0.15) {
            Double conta =
                    super.getValor() -
                            ( super.getValor() * super.getPorcentagemDesconto() );
            super.setValor(conta);
        }
    }

    /**
     * Mostra os valores preenchidos do livro e do autor dentro do livro caso exista.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "watermark: " + waterMark;
    }
}
