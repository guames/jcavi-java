package classes.class09.activity;

public class Investidor {

    private String nome;
    private String cpf;
    private Carteira carteira;

    public Investidor(String nome, String cpf, Carteira carteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    @Override
    public String toString() {
        return "Investidor{" +
                "\n nome='" + nome + '\'' +
                ",\n cpf='" + cpf + '\'' +
                ",\n carteira=" + carteira.toString() +
                '}';
    }
}
