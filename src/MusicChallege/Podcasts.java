package MusicChallege;

public class Podcasts extends Audio {

    private String host;
    private String descricao;
    private String apresentador;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }


    @Override
    public double getClasificacao() {
        if (this.getTotalcurtidas() > 500) {
            return 10;
        }
        else {
            return 8;
        }

    }
}
