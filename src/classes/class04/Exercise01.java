package classes.class04;

import javax.swing.*;

public class Exercise01 {

    public static void main(String[] args) {

        // Declaracao do numero de pessoas
        String numeroPessoas;

        // condicao 1
        boolean cond1;

        // Condicao 2
        boolean cond2;

        //Inicio do "do" "while"
        do {

            // Pede para o usuario informar o numero de pessoas
            numeroPessoas = JOptionPane.showInputDialog(null, "Informe o numero de pessoas!");

            // Regex para validar somente numeros na string numero de pessoas
            cond1 = numeroPessoas.matches("[0-9]*");

            // Negacao da string numero de pessoas vazia
            cond2 = !numeroPessoas.isEmpty();

            // Final do laco, caso condicao false > sai do laco
            // Para sair do laco necessario: cond1=true && cond2=true
            // "!" negacao da cond1 && cond2
        } while (! (cond1 && cond2) );

        // Calculo da quantidade * numero de pessoas
        double qtdCarne = (0.350 * Integer.parseInt(numeroPessoas)) ;

        // Calculo da quantidade * numero de pessoas
        double qtdLing = (0.100 * Integer.parseInt(numeroPessoas)) ;

        // Calculo da quantidade * numero de pessoas
        double qtdCerv = (2.0 * Integer.parseInt(numeroPessoas)) ;

        // Calculo da quantidade * numero de pessoas
        double qtdRefr = (0.200 * Integer.parseInt(numeroPessoas)) ;

        // Mostra na tela
        JOptionPane.showMessageDialog(null,
                  "N pessoas: "    + numeroPessoas + "\n"
                        +  "Carne: "        + qtdCarne      + "Kg\n"
                        +  "Linguica: "     + qtdLing       + "Kg\n"
                        +  "Cerveja: "      + qtdCerv       + "L\n"
                        +  "Refrigerante: " + qtdRefr       + "L");

    }
}
