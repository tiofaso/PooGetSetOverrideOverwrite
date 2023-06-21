package Exercicio02;

abstract class Livros {
    private String nomeLivro;
    private String isbnLivro;
    private String autorLivro;
    private String generoLivro;

    public Livros(String isbn, String nome, String genero, String autor) {
        this.isbnLivro = isbn;
        this.nomeLivro = nome;
        this.generoLivro = genero;
        this.autorLivro = autor;
    }

    abstract void RegistrarLivros(String isbnLivro);

    abstract void RegistrarLivros(String isbnLivro, String nomeLivro);

    abstract void RegistrarLivros(String isbnLivro, String nomeLivro, String generoLivro);

    abstract void RegistrarLivros(String isbnLivro, String nomeLivro, String generoLivro, String autorLivro);

    //---------------------

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(String isbnLivro) {
        this.isbnLivro = isbnLivro;
    }

    //---

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    //---

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    //---

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }
}
