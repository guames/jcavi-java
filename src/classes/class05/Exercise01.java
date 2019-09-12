package classes.class05;

import javax.swing.*;

public class Exercise01 {

    public static void main(String[] args) {

        //Integer.parseInt() serve para converter String em inteiro

        // declarei as variaveis e inicializei com o valor que o usuario informar na tela
        Integer n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"numero 1"));
        Integer n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"numero 2"));
        Integer n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"numero 3"));

        // variaveis auxiliares para mostrar o resultado
        String nMaior = "";
        String nMenor = "";

        // condicao para o primeiro numero maior
        if(n1 > n2 && n1 > n3){
            nMaior = "maior primeiro: " + n1;

            //condicao para o segundo numero maior
        }else if(n2 > n3 && n2 > n1){
            nMaior = "maior segundo: "+ n2;

            //condicao para o terceiro maior
        }else{
            nMaior = "maior terceiro: " + n3;
        }

        // condicao para o primeiro numero menor
        if(n1 < n2 && n1 < n3){
            nMenor = "menor primeiro: "+ n1;
            //condicao para o segundo numero menor
        }else if(n2 < n3 && n2 < n1){
            nMenor = "menor segundo: " +n2;
            //condicao para o terceiro menor
        }else{
            nMenor = "menor terceiro: "+n3 ;
        }

        // mostra o valor maior e o valor menor
        JOptionPane.showMessageDialog(null, nMenor + "\n" + nMaior );
    }
}
