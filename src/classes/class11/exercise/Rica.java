package classes.class11.exercise;

public class Rica extends Pessoa {

    private Double dinheiro;

    @Override
    public void alimentar() {
        System.out.println("Rico se alimentando...");
    }

    @Override
    public void passear() {
        System.out.println("Rico passeando...");
    }

    @Override
    public void pagarContas() {
        System.out.println("Rico pagando contas...");
    }

    public void fazerCompras(){
        System.out.println("Rico fazendo compras...");
    }

}
