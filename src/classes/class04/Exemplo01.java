package classes.class04;

public class Exemplo01 {

    public static void main(String[] args) {

        // Laco de repeticao While
        while (true){

            // mostra na tela que entrou no laco
            System.out.println("Entrou no laco");

            // para a execucao do laco
            break;
        }

        // Laco de repeticao For
        for (int i = 1; i < 10; i++){
            System.out.println("Valor do I: " + i);
        }

        // Array de textos
        String[] textos = {"Gustavo","Pedro","Luiz","Roberto","Paulo"};

        // Laco de repeticao for de acordo com o tamanho do array de textos
        for (int i = 0; i < textos.length; i++){

            // mostra na tela a posicao do array e o conteudo
            System.out.println("Valor da posicao, " + i + " é: " + textos[i]);
        }

        // laco de repeticao enhanced for
        for (String valor: textos) {
            System.out.println("Enhanced For: " + valor);
        }

    }
}
