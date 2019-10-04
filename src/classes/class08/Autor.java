package classes.class08;

/**
 * Classe Autor
 */
public class Autor {

    String nome;
    String cpf;
    String email;

    /**
     * Mostra os detalhes do autor.
     */
    void mostrarDetalhes(){
        System.out.println("=== AUTOR ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("=== AUTOR ===");
    }
}
