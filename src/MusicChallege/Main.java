package MusicChallege;

public class Main {

    public static void main(String[] args) {

        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Cantora");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.cute();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.cute();
        }

    }
}