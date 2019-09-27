package classes.class07;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        System.out.println("=== LIVRO ===");
        System.out.println("Nome: "+ nome);
        System.out.println("Descricao: "+ descricao);
        System.out.println("Valor: "+ valor);
        System.out.println("Isbn: "+ isbn);
        System.out.println("=== AUTOR ===");
        System.out.println("Nome: " + autor.nome);
        System.out.println("Cpf: " + autor.cpf);
        System.out.println("Email: " + autor.email);
        System.out.println("=== AUTOR ===");
        System.out.println("=== LIVRO ===");
    }
}
