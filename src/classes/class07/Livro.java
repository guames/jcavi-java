package classes.class07;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhesCompleto(){
        System.out.println("=== LIVRO ===");
        System.out.println("Nome: "+ nome);
        System.out.println("Descricao: "+ descricao);
        System.out.println("Valor: "+ valor);
        System.out.println("Isbn: "+ isbn);
        System.out.println("=== LIVRO ===");
        autor.mostrarDetalhes();
    }

    void mostrarDetalhesSimples(){
        System.out.println("=== LIVRO ===");
        System.out.println("Nome completo: "+ nome);
        System.out.println("Descricao: "+ descricao);
        System.out.println("Valor: "+ valor);
        System.out.println("Isbn: "+ isbn);
        System.out.println("=== LIVRO ===");
    }
}
