package classes.class05;

import javax.swing.*;

public class Exercise02 {

    public static void main(String[] args) {

        // declarei a variavel para mesada
        double mesada;

        // laco de repeticao enquanto verdadeiro
        while (true) {

            // entrar com a mesada
            mesada = Double.parseDouble(JOptionPane.showInputDialog("Entre com a mesada!"));

            // se for maior que 0 sai do laco
            if(mesada > 0){

                // sai do laco
                break;
            }else{

                // valor nao aceito
                JOptionPane.showMessageDialog(null, "Valor negativo nao aceito!");
            }

        }

        // inicio do laco
        do {

            // informe as opcoes
            String opcao = JOptionPane.showInputDialog("Informe a opcao:\n" +
                    "1 - Comprar brinquedo!\n" +
                    "2 - Mostrar o que ainda resta de dinheiro!\n" +
                    "3 - Finalizar");

            // switch case para
            switch (opcao) {

                case "1":

                    // informar o valor do brinquedo
                    double valorBrinquedo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do brinquedo!"));

                    // valida se o valor do brinquedo eh maior que 0
                    if (valorBrinquedo > 0) {

                        // verifico se possui saldo para comprar o brinquedo
                        if (valorBrinquedo > mesada) {

                            // mensagem nao possui dinheiro
                            JOptionPane.showMessageDialog(null, "Voce nao pode comprar esse brinquedo, peca mais dinheiro para seu pai!");
                        } else {

                            // mesada = mesada - valorBrinquedo
                            mesada -= valorBrinquedo;
                        }
                    } else {
                        // valor errado
                        JOptionPane.showMessageDialog(null, "Valor errado, tente falar com o vendedor para pegar o valor correto!");
                    }
                    // para o switch case
                    break;

                    // mostrar saldo
                case "2":

                    // mostra o saldo da mesada
                    JOptionPane.showMessageDialog(null, "Voce ainda tem:" + mesada);
                    break;

                    // sair do sistema
                case "3":

                    // comando para sair do sistema
                    System.exit(0);

                    // caso o numero informado nao atanda 1/2/3
                default:

                    // mostra opcao invalida
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
            }

        }while (true);
    }
}
