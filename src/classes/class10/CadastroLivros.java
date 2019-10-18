package classes.class10;

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

        //Instanciando o autor com todos os campos necessarios
        Autor novoAutor = new Autor(
                "Gustavo Ames",
                "000.000.000-00",
                "gustavo@jcavi.com.br");

        //Instanciando Livro Fisico o parametro todos os campos necessarios
        LivroFisico livroFisico = new LivroFisico(
                "Livro de Java",
                "Este livro é para os alunos estudarem!",
                19.90,
                novoAutor,
                "111-111-111-111",
                0.2);

        //Instanciando Livro Fisico o parametro todos os campos necessarios
        Ebook ebook = new Ebook(
                "Livro de Java",
                "Este livro é para os alunos estudarem!",
                19.90,
                novoAutor,
                "111-111-111-111",
                0.1,
                "gustavo.ames@com.br");

        //mostrar detalhes do livro e autor

        System.out.println(livroFisico.toString());
        System.out.println(ebook.toString());

    }
}
