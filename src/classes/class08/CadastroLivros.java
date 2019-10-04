package classes.class08;

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
        Autor novoAutor = new Autor();

        // preenchendo os atributos do autor
        novoAutor.nome = "Gustavo Ames";
        novoAutor.cpf= "000.000.000-00";
        novoAutor.email="gustavo@jcavi.com.br";

        //Instanciando Livro passando o parametro do autor e o nome do livro
        Livro livro = new Livro(novoAutor,"Livro de Java");

        // preenchendo o livro
        livro.descricao = "Este livro é para os alunos estudarem!";
        livro.isbn = "123ddaew123";
        livro.valor = 19.90;

        // mostrar detalhes do livro e autor
        livro.mostrarDetalhes();

        // aplicar o desconto no livro
        livro.aplicaDescontoDe(0.3);

        // mostrar detalhes do livro com o desconto aplicado
        livro.mostrarDetalhes();

    }
}
