package classes.class09;

/**
 * Classe Autor
 */
public class Autor {

    private String nome;
    private String cpf;
    private String email;

    /**
     * Construtor do objeto autor com os campos default
     * @param nome
     * @param cpf
     * @param email
     */
    public Autor(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "\nnome='" + nome + '\'' +
                ", \ncpf='" + cpf + '\'' +
                ", \nemail='" + email + '\'' +
                '}';
    }
}
