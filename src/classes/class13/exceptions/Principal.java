package classes.class13.exceptions;

public class Principal {

    public static void main(String[] args) {

        try {

            String[] textos = new String[5];

            textos[0] = "nome";
            textos[1] = "cpf";
            textos[2] = "rg";
            textos[3] = "email";
            textos[4] = "endereco";

            for (int idx = 0; idx <= textos.length; idx++) {
                System.out.println(textos[idx]);
            }
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            throw new ArrayException("Posicao invalida");
        }catch (Exception e){
            System.out.println("Erro Generico");
        }finally {
            System.out.println("finalmente");
        }

        System.out.println("executou");
    }

}
