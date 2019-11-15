package classes.class13;


/**
 * Classe para realizar o cadastro de livros
 */
public class Comprar {

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
        MiniLivro miniLivro = new MiniLivro(
                "Livro de Java",
                "Este livro é para os alunos estudarem!",
                19.90,
                "111-111-111-111",
                novoAutor,
                0.2);


        //mostrar detalhes do livro e autor

        VideoGame videoGame = new VideoGame("PS$","Sony", 5000.00, "Video game ps4 bla bla bla...");

        CarrinhoCompras cc = new CarrinhoCompras();

        cc.adicionaProduto(miniLivro);
        cc.adicionaProduto(videoGame);

        cc.listarProdutos();

    }
}
