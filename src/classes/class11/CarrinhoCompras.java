package classes.class11;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    List<Livro> livros;

    public CarrinhoCompras(){
        livros = new ArrayList<>();
    }

    public void adicionaLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        for (Livro batatinha: livros) {
            System.out.println(batatinha.toString());
        }
    }

}
