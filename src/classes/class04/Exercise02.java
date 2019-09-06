package classes.class04;

import javax.swing.*;

public class Exercise02 {

    public static void main(String[] args) {

        // declaracao do numero de pessoas
        String numeroPessoas;

        // declaracao do valor da quadra
        String valorQuadra;

        // declaracao texto vazio
        boolean textoVazio;

        // declaracao somente numero
        boolean somenteNumero;

        // inicio do laco
        do {

            // seto o numero de pessoas
            numeroPessoas = JOptionPane.showInputDialog(null, "Informe o numero de pessoas!");

            // valido regex somente numeros
            somenteNumero = numeroPessoas.matches("[0-9]*");

            //valida se o texto esta vazio
            textoVazio = numeroPessoas.isEmpty();

            // validacao para usuario informar somente numeros
            if(!somenteNumero || textoVazio){

                // mensagem na tela
                JOptionPane.showMessageDialog(null,"Informe somente numeros!");
            }

            // valida condicao do while
        } while (! (somenteNumero && !textoVazio)    );

        // inicia o laco
        do {

            // seta o valor da quadra
            valorQuadra = JOptionPane.showInputDialog(null, "Informe o valor da quadra!");

            // valida somente numero
            somenteNumero = valorQuadra.matches("[0-9]*");

            // mensagem para o usuario
            if(!somenteNumero){
                JOptionPane.showMessageDialog(null,"Informe somente numeros!");
            }

            // valida condicao do while
        } while (!(somenteNumero) && !valorQuadra.isEmpty());

        // calcula o valor por pessoa
        double valorPorPessoa = Double.parseDouble(valorQuadra) / Integer.parseInt(numeroPessoas);

        // mostra o resultado na tela
        JOptionPane.showMessageDialog(null,
                   "Numero de pessoas: "   + numeroPessoas + "\n"
                        +   "valor por pessoa: "    + valorPorPessoa);
    }
}
