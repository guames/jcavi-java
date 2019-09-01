package classes.class03;

import javax.swing.*;

public class Exercise02 {

    // declaracao de constante
    final static String USUARIO =  "gustavo";
    final static String PASSWORD =  "1234";

    public static void main(String[] args) {

        //declaracao e input do usuario
        String usuario = JOptionPane.showInputDialog(null, "Informe o login!");

        //declaracao e input da senha
        String password = JOptionPane.showInputDialog(null, "Informe a senha!");

        // validacao de usuario e senha
        if(usuario.equalsIgnoreCase(USUARIO) && password.equals(PASSWORD)){

            //mostra na tela a mensagem usuario logado
            JOptionPane.showMessageDialog(null,"Usuario Logado!");
        }else{

            //mostra na tela a mensagem usuario ou senha invalidos
            JOptionPane.showMessageDialog(null,"Usuario ou senha invalidos!");
        }
    }
}
