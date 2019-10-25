package classes.class11.exercise;

public class ClassePrincipal {

    public static void main(String[] args) {
        Animal animal = new Cachorro();

        animal.alimentar();
        animal.passear();
        animal.vacinar();

        Animal animal2 = new Gato();

        animal2.alimentar();
        animal2.passear();
        animal2.vacinar();

    }
}
