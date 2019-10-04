package classes.class08;

/**
 * Classe Livro.
 */
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    /**
     * Construtor da classe Livro.
     * @param autor Objeto autor.
     * @param nome Nome do livro.
     * @throws Exception Excecao dados de criacao invalidos.
     */
    public Livro(Autor autor,String nome) throws Exception {
        this.autor = autor;
        this.nome = nome;
        if(isAutorNulo())
            throw new NullPointerException("Preencha o autor!");

        if(nome == null || nome.isEmpty())
            throw new NullPointerException("Preencha o nome do livro!");
    }

    /**
     * Mostrar detalhes do livro.
     */
    void mostrarDetalhes(){
        System.out.println("=== LIVRO ===");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Descricao: "+ this.descricao);
        System.out.println("Valor: "+ this.valor);
        System.out.println("Isbn: "+ this.isbn);
        System.out.println("=== LIVRO ===");
        if(!isAutorNulo()){
            this.autor.mostrarDetalhes();
        }
    }

    /**
     * Aplicar desconto sobre o valor.
     * @param porcentagem porcentagem em decimal.
     */
    void aplicaDescontoDe(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }

    /**
     * Verifica se o autor esta nulo.
     * @return booleano true ou false
     */
    boolean isAutorNulo(){
        return this.autor == null;
    }
}
