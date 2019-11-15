package classes.class13;

public class AutorNuloException extends RuntimeException{

    public AutorNuloException(String mensagem){
        super(mensagem);
    }

    public void lancaException(){
        System.out.println("Passou aqui");
    }
}
