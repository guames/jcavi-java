package classes.class11.exercise;

public class Cachorro extends Animal {

    @Override
    public void passear() {
        System.out.println("Cachorro passeando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Cachorro se alimentando...");
    }

    @Override
    public void vacinar() {
        System.out.println("Cachorro sendo vacinado...");
    }

    public void latir() {
        System.out.println("Cachorro latindo...");
    }

}
