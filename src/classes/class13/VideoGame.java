package classes.class13;

public class VideoGame implements Produto {

    private String modelo;
    private String marca;
    private Double valor;
    private String descricao;

    public VideoGame(String modelo, String marca, Double valor, String descricao) {
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Double getValor() {
        return valor;
    }
}
