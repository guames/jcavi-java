package classes.class03;

import javax.swing.*;

public class Exercise01 {

    public static void main(String[] args) {

        //Declaracao de variaveis
        double notaA;
        double notaB;
        double media;

        //inicializando variaveis com valores informados pelo usuario
        notaA = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota!"));
        notaB = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota!"));

        //calculo da media
        media = (notaA + notaB)/2;

        //mostra na tela a media
        JOptionPane.showMessageDialog(null,"A media é:" + media);

        //se media >= 7
        if(media >= 7) {
            //mostra mensagem aprovado
            JOptionPane.showMessageDialog(null, "Aluno Aprovado!");
            //se media >= 5
        }else if(media >= 5){
            //mostra mensagem recuperacao
            JOptionPane.showMessageDialog(null,"Aluno em Recupoeracao!");
            //se nao
        } else {
            //mostra mensagem reprovado
            JOptionPane.showMessageDialog(null,"Aluno Reprovado!");
        }
    }
}
