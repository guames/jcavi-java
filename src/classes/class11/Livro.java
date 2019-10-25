package classes.class11;

/**
 * Classe Livro.
 */
public abstract class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private double porcentagemDesconto;

    /**
     * Construtor do livro completo.
     * @param nome
     * @param descricao
     * @param valor
     * @param isbn
     * @param autor
     * @param porcentagemDesconto
     */
    public Livro(String nome,
                 String descricao,
                 double valor,
                 String isbn,
                 Autor autor,
                 double porcentagemDesconto) {
        this.autor = autor;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * Aplicar desconto sobre o valor.
     */
    public abstract void aplicaDescontoDe();

    public Double getPorcentagemDesconto(){
        return this.porcentagemDesconto;
    }

    /**
     * Mostra os valores preenchidos do livro e do autor dentro do livro caso exista.
     * @return
     */
    @Override
    public String toString() {
        return "Livro{" +
                "\nnome='" + nome + '\'' +
                ", \ndescricao='" + descricao + '\'' +
                ", \nvalor=" + valor +
                ", \nisbn='" + isbn +
                '}';
    }
}
