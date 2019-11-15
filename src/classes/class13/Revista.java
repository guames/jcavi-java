package classes.class13;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private Double valor;
    private Editora editora;

    public Revista(String nome, String descricao, Double valor, Editora editora) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public void aplicaDescontoDe() {

    }
}
