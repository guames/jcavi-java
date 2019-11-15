package classes.class13.exceptions;

public class ArrayException extends RuntimeException{

    public ArrayException(String mensagem){
        super("ArrayException: ========= > " + mensagem);
    }
}