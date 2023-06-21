package Exercicio02;

public class Biblioteca extends Livros {
    public Biblioteca(String isbn, String nome , String genero, String autor) {
        super(isbn, nome, genero, autor);
    }

    @Override
    void RegistrarLivros(String isbn) {
        setIsbnLivro(isbn);
        System.out.printf("O livro foi registrado com o ISBN " + getIsbnLivro() );
    }

    @Override
    void RegistrarLivros(String isbn, String nome) {
        setIsbnLivro(isbn);
        setNomeLivro(nome);
        System.out.printf("O livro foi registrado com o ISBN " + getIsbnLivro() + "e o nome " + getNomeLivro());
    }

    @Override
    void RegistrarLivros(String isbn, String nome, String genero) {
        setIsbnLivro(isbn);
        setNomeLivro(nome);
        setGeneroLivro(genero);
        System.out.printf("O livro foi registrado com o ISBN " + getIsbnLivro() + "e o nome " + getNomeLivro() + " e o gênero " + getGeneroLivro());
    }

    @Override
    void RegistrarLivros(String isbn, String nome, String genero, String autor) {
        setIsbnLivro(isbn);
        setNomeLivro(nome);
        setGeneroLivro(genero);
        setAutorLivro(autor);
        System.out.printf("O livro foi registrado com todos os atributos.");
    }

    void MostraLivro(){
        System.out.printf("\n\n> DADOS DO LIVRO");
        System.out.printf("\nNome do livro: " + getNomeLivro());
        System.out.printf("\nAutor do livro: " + getAutorLivro());
        System.out.printf("\nGênero do livro: " + getGeneroLivro());
        System.out.printf("\nISBN do livro: " + getIsbnLivro());
    }
}

