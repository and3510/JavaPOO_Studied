package study.challeges.sistemaBibliotecaChallege;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);

        // Adicionando livros ao acervo
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando usuários
        Usuario usuario1 = new Usuario("Anderson", 1);
        Usuario usuario2 = new Usuario("Maria", 2);

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Emprestando livros
        biblioteca.emprestarLivro(usuario1, "1984");
        biblioteca.emprestarLivro(usuario2, "O Hobbit");

        // Listando livros disponíveis após empréstimos
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo livros
        biblioteca.devolverLivro(usuario1, "1984");

        // Listando livros disponíveis após devolução
        biblioteca.listarLivrosDisponiveis();
    }
}