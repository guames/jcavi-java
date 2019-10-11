package classes.class09;

/**
 * Classe Livro.
 */
public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private double porcentagemDesconto;

    public Livro(String nome,
                 String descricao,
                 double valor,
                 Autor autor,
                 double porcentagemDesconto){
        this( nome, descricao, valor, null, autor, porcentagemDesconto);
        System.out.println("construtor sem isbn!");
    }

    public Livro(String nome,
                 String descricao,
                 double valor,
                 String isbn,
                 Autor autor,
                 double porcentagemDesconto) {
        this.autor = autor;
        this.nome = nome;
        if(isAutorNulo()) {
            throw new NullPointerException("Preencha o autor!");
        }
        if(nome == null || nome.isEmpty() || nome.length() < 2) {
            throw new NullPointerException("Preencha o nome do livro!");
        }
        if(isbn == null || isbn.isEmpty()){
            isbn = "000-000-000-000";
        }

        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.porcentagemDesconto = porcentagemDesconto;
        aplicaDescontoDe();
        System.out.println("construtor com isbn!");
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
    private void aplicaDescontoDe(){
        this.valor -= this.valor * this.porcentagemDesconto;
    }

    /**
     * Verifica se o autor esta nulo.
     * @return booleano true ou false
     */
    boolean isAutorNulo(){
        return this.autor == null;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "\nnome='" + nome + '\'' +
                ", \ndescricao='" + descricao + '\'' +
                ", \nvalor=" + valor +
                ", \nisbn='" + isbn + '\'' +
                (!isAutorNulo() ? ", \nautor=" + autor.toString() : "") +
                '}';
    }
}
