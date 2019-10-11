package classes.class09;

/**
 * Classe para realizar o cadastro de livros
 */
public class CadastroLivros {

    /**
     * Metodo principal.
     * @param args argumentos.
     * @throws Exception Excecao caso aconteca algum erro.
     */
    public static void main(String[] args) throws Exception {

        //Instanciando o autor
        Autor novoAutor = new Autor(
                "Gustavo Ames",
                "000.000.000-00",
                "gustavo@jcavi.com.br");

        //Instanciando Livro passando o parametro do autor e o nome do livro
        Livro livro = new Livro(
                "Livro de Java",
                "Este livro é para os alunos estudarem!",
                19.90,
                novoAutor,
                0.2);

        // mostrar detalhes do livro e autor
        System.out.println(livro.toString());
    }
}
