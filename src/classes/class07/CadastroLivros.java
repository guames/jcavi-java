package classes.class07;

public class CadastroLivros {

    public static void main(String[] args) {

        //Instanciando o autor
        Autor novoAutor = new Autor();

        // preenchendo os atributos do autor
        novoAutor.nome = "Gustavo Ames";
        novoAutor.cpf= "000.000.000-00";
        novoAutor.email="gustavo@jcavi.com.br";

        //Instanciando Livro
        Livro livro = new Livro();

        // preenchendo autor do livro
        livro.autor = novoAutor;

        // preenchendo o livro
        livro.nome = "Livro de Java";
        livro.descricao = "Este livro é para os alunos estudarem!";
        livro.isbn = "123ddaew123";
        livro.valor = 19.90;

        // mostrar detalhes do livro e autor
        livro.mostrarDetalhes();

        // atualizar nome e email do autor
        livro.autor.nome = "Pedro";
        livro.autor.email = "teste@teste.com.br";

        // mostrar novamente
        livro.mostrarDetalhes();

    }
}
