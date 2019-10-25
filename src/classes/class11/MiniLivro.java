package classes.class11;

public class MiniLivro extends Livro {

    public MiniLivro(String nome,
                     String descricao,
                     double valor,
                     String isbn,
                     Autor autor,
                     double porcentagemDesconto) {
        super(nome, descricao, valor, isbn, autor, porcentagemDesconto);
    }

    @Override
    public void aplicaDescontoDe() {
    }
}
