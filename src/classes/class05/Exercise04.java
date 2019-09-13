package classes.class05;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Calendar;

public class Exercise04 {

    public static void main(String[] args) {

        // preenche o dia
        Integer diaPrimeiraPessoa = Integer.valueOf(JOptionPane.showInputDialog("Informe o dia da primeira pessoa"));

        //preenche o mes
        Integer mesPrimeiraPessoa = Integer.valueOf(JOptionPane.showInputDialog("Informe o mes da primeira pessoa"));

        //preenche o ano
        Integer anoPrimeiraPessoa = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano da primeira pessoa!"));

        // monta a data baseado nas informacoes
        LocalDate aniversario1 = LocalDate.of(anoPrimeiraPessoa,mesPrimeiraPessoa,diaPrimeiraPessoa);

        // preenche o dia
        Integer diaSegundaPessoa = Integer.valueOf(JOptionPane.showInputDialog("Informe o dia da segunda pessoa!"));

        //preenche o mes
        Integer mesSegundaPessoa = Integer.valueOf(JOptionPane.showInputDialog("Informe o mes da segunda pessoa!"));

        //preenche o ano
        Integer anoSegundaPessoa = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano da segunda pessoa!"));

        // monta a data baseado nas informacoes
        LocalDate aniversario2 = LocalDate.of(anoSegundaPessoa,mesSegundaPessoa,diaSegundaPessoa);

        if(aniversario1.isBefore(aniversario2)){
            JOptionPane.showMessageDialog(null, "Aniversario 1 é mais velho");
        }else{
            JOptionPane.showMessageDialog(null,"Aniversario 2 é mais velho");
        }
    }
}
