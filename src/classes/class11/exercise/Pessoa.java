package classes.class11.exercise;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){
    }

    public abstract void alimentar();
    public abstract void passear();
    public abstract void pagarContas();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
