package MusicChallege;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClasificacao() >= 8) {
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto");
        }
        else {
            System.out.println(audio.getTitulo() + "Uma excelente opçao, mas nem tanto ");
        }
    }
}
