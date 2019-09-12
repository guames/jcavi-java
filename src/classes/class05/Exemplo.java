package classes.class05;

public class Exemplo {

    public static void main(String[] args) {

        // declaracao da variavel dia da semana
        int diaDaSemana = 1;

        // sintaxe do switch case para escolher o dia da semana
        switch (diaDaSemana){

            // caso dia 1
            case 1:
                System.out.println("Segunda-Feira!");
                // para o switch
                break;
            case 2:
                System.out.println("Terca-Feira!");
                // para o switch
                break;
            case 3:
                System.out.println("Quarta-Feira!");
                // para o switch
                break;
            case 4:
                System.out.println("Quinta-Feira!");
                // para o switch
                break;
            case 5:
                System.out.println("Sexta-Feira!");
                // para o switch
                break;
            case 6:
                System.out.println("Sabado");
                // para o switch
                break;
            case 7:
                System.out.println("Domingo");
                // para o switch
                break;
                //opcao default caso usuario informe um dia nao valido
            default:
                System.out.println("Dia nao existe!");
        }
    }
}
