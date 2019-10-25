package classes.class11.exercise;

public class Pobre extends Pessoa {

    @Override
    public void alimentar() {
        System.out.println("Pobre se alimentando...");
    }

    @Override
    public void passear() {
        System.out.println("Pobre passeando...");
    }

    @Override
    public void pagarContas() {
        System.out.println("Pobre pagando contas...");
    }

    public void trabalhar(){
        System.out.println("Pobre fazendo o que mais gosta (trabalhar)...");
    }
}
