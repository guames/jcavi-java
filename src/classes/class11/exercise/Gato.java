package classes.class11.exercise;

public class Gato extends Animal {

    @Override
    public void passear() {
        System.out.println("Gato passeando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Gato se alimentando...");
    }

    @Override
    public void vacinar() {
        System.out.println("Gato sendo vacinado...");
    }

    public void miar(){
        System.out.println("Gato miando...");
    }

}
