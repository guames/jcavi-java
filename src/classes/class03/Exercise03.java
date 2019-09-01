package classes.class03;

import javax.swing.*;

public class Exercise03 {

    public static void main(String[] args) {

        //mostra mensagem na tela para o usuario para informar o primeiro produto e seta o conteudo para a variavel produto1
        String produto1 = JOptionPane.showInputDialog(null, "Informe o produto 1!");

        //mostra mensagem na tela para o usuario para informar o primeiro produto e seta o conteudo para a variavel valorProduto1
        double valorProduto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do primeiro produto!"));



        //mostra mensagem na tela para o usuario para informar o primeiro produto e seta o conteudo para a variavel produto2
        String produto2 = JOptionPane.showInputDialog(null, "Informe o produto 2!");

        //mostra mensagem na tela para o usuario para informar o primeiro produto e seta o conteudo para a variavel valorProduto2
        double valorProduto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do segundo produto!"));



        //mostra mensagem na tela para o usuario para informar o primeiro produto e seta o conteudo para a variavel produto3
        String produto3 = JOptionPane.showInputDialog(null, "Informe o produto 3!");

        //mostra mensagem na tela para o usuario para informar o primeiro produto e seta o conteudo para a variavel valorProduto3
        double valorProduto3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do terceiro produto!"));


        //calcula o valor total do produto
        double total = valorProduto1 + valorProduto2 + valorProduto3;

        //valida se o valor é maior que 150 para aplicar o desconto
        if(total > 150){

            // total = total - (total * 0.10)
            total -= total * 0.10;
        }

        //mostra na tela os produtos e valor total
        JOptionPane.showMessageDialog(null,"Produtos: \n" +
                produto1 + ": " + valorProduto1 + "\n" +
                produto2 + ": " + valorProduto2 + "\n" +
                produto3 + ": " + valorProduto3 + "\n" +
                "Valor total: " + total);
    }
}
