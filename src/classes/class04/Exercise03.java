package classes.class04;

import javax.swing.*;

public class Exercise03 {

    public static void main(String[] args) {

        // declaracao do salario
        double salario;

        // inicio do laco com condicao
        while (true) {

            // recupera o salario
            salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario!"));

            // valida se o salario é maior que 0
            if(salario > 0){

                // para o laco de repeticao
                break;
            }else{

                // mostra mensagem de valor negativo nao permitido
                JOptionPane.showMessageDialog(null, "Valor negativo nao aceito!");
            }
        }

        // inicio do laco
        while (true){

            // mostra na tela as opcoes do sistema
            String opcao = JOptionPane.showInputDialog("Informe a opcao\n" +
                    "1 - pagar conta\n" +
                    "2 - mostrar saldo\n" +
                    "3 - finalizar");

            // se a opcao for 1
            if(opcao.equalsIgnoreCase("1")){

                // pede para o usuario informar o valor da conta
                double conta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta"));

                // valida se a conta e maior que 0
                if(conta > 0) {

                    // valida se a conta a pagar é maior que o salario
                    if (conta > salario) {

                        // mostra que a conta nao pode ser paga
                        JOptionPane.showMessageDialog(null, "conta nao pode ser paga, valor maior que o saldo!");

                    } else {

                        // diminui a conta do salario
                        salario -= conta;
                    }
                }else{

                    // informa que o valor negativo nao é aceito
                    JOptionPane.showMessageDialog(null, "valor negativo nao aceito!");
                }

                // caso digite 2 mostra o saldo
            }else if(opcao.equalsIgnoreCase("2")){

                // mostra o saldo
                JOptionPane.showMessageDialog(null,"Seu saldo e:"+ salario);

                // caso digite 3 sai do sistema
            }else if(opcao.equalsIgnoreCase("3")){

                // para o laco
                break;
            }else{

                // informa que a opcao é invalida
                JOptionPane.showMessageDialog(null, "Opcao invalida!");
            }
        }
    }
}
