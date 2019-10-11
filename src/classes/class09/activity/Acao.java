package classes.class09.activity;

public class Acao {

    private String nome;
    private String codigo;
    private Double valor;
    private Integer quantidade;

    public Acao(String nome, String codigo, Double valor, Integer quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorInvestido(){
        return quantidade * valor;
    }

    @Override
    public String toString() {
        return "\n Acao{" +
                "\n nome='" + nome + '\'' +
                ",\n codigo='" + codigo + '\'' +
                ",\n valor=" + valor +
                ",\n quantidade='" + quantidade + '\'' +
                ",\n valor investido='" + getValorInvestido() + '\'' +
                '}';
    }
}
