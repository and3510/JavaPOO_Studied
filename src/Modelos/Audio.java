package Modelos;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalcurtidas;
    private double clasificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getTotalcurtidas() {
        return totalcurtidas;
    }

    public void setTotalcurtidas(int totalcurtidas) {
        this.totalcurtidas = totalcurtidas;
    }

    public double getClasificacao() {
        return clasificacao;
    }

    public void setClasificacao(double clasificacao) {
        this.clasificacao = clasificacao;
    }

    public void cute() {
        this.totalcurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }


}
