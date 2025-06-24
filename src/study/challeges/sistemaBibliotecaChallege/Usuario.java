package study.challeges.sistemaBibliotecaChallege;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idUsuario;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " (ID: " + idUsuario + ") - Livros emprestados: "
                + livrosEmprestados.stream().map(Livro::getTitulo).toList();
    }

}
