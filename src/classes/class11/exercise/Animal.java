package classes.class11.exercise;

public abstract class Animal {

    private String nome;
    private String raca;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void passear();
    public abstract void alimentar();
    public abstract void vacinar();
}
