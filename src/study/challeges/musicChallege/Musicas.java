package study.challeges.musicChallege;

public class Musicas extends Audio {

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public double getClasificacao() {
        if (getTotalcurtidas() > 2000) {
            return 10;
        }
        else {
            return 7;
        }
    }
}
