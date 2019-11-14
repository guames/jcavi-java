package classes.class12;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    List<Produto> produtos;

    public CarrinhoCompras(){
        produtos = new ArrayList<>();
    }

    public void adicionaProduto(Produto produto){
        produtos.add(produto);
    }

    public void listarProdutos(){
        for (Produto batatinha: produtos) {
            System.out.println(batatinha.getValor());
        }
    }
}
