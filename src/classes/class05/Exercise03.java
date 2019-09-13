package classes.class05;

import javax.swing.*;

public class Exercise03 {

    public static void main(String[] args) {

        // recupera o numero informado pelo usuario
        Integer number = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero"));

        // valida se tem resto
        if(number % 2 == 0){
            JOptionPane.showMessageDialog(null,"par");
        }else{
            JOptionPane.showMessageDialog(null,"impar");
        }
    }
}
