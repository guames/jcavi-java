package classes.class11.exercise;

public class Miseravel extends Pessoa {

    @Override
    public void alimentar() {
        System.out.println("Miseravel se alimentando...");
    }

    @Override
    public void passear() {
        System.out.println("Miseravel passeando...");
    }

    @Override
    public void pagarContas() {
        System.out.println("Miseravel pagando contas...");
    }

    public void mendigar(){
        System.out.println("Miseravel mendigando...");
    }
}
