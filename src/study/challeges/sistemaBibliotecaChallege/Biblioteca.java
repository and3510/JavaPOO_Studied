package study.challeges.sistemaBibliotecaChallege;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : acervo) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void emprestarLivro(Usuario usuario, String tituloLivro) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro) && livro.isDisponivel()) {
                livro.setDisponivel(false);
                usuario.emprestarLivro(livro);
                System.out.println("Livro emprestado: " + livro.getTitulo() + " para " + usuario.getNome());
                return;
            }
        }
        System.out.println("Livro não disponível ou não encontrado.");
    }

    public void devolverLivro(Usuario usuario, String tituloLivro) {
        for (Livro livro : usuario.getLivrosEmprestados()) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                livro.setDisponivel(true);
                usuario.devolverLivro(livro);
                System.out.println("Livro devolvido: " + livro.getTitulo() + " por " + usuario.getNome());
                return;
            }
        }
        System.out.println("Este livro não foi emprestado por " + usuario.getNome());
    }
}