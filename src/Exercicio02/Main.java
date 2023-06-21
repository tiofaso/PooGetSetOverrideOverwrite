package Exercicio02;

public class Main {
    public static void main(String[] args) {
        Biblioteca livro1 = new Biblioteca("9786588431412", "Sistemas Orientados a objetos", "Técnico", "Pablo Rangel");
        livro1.RegistrarLivros(livro1.getIsbnLivro());
        livro1.MostraLivro();

        System.out.printf("\n-----\n\n");

        Biblioteca livro2 = new Biblioteca("9780380807345", "Coraline", "Fantasia", "Neil Gaiman");
        livro2.RegistrarLivros(livro2.getIsbnLivro(), livro2.getNomeLivro());
        livro2.MostraLivro();


        System.out.printf("\n-----\n\n");

        Biblioteca livro3 = new Biblioteca("9788592886608","Elementos do Estilo Tipográfico", "Design", "Robert Bringhurst");
        livro3.RegistrarLivros(livro3.getIsbnLivro(), livro3.getNomeLivro(), livro3.getGeneroLivro());
        livro3.MostraLivro();

        System.out.printf("\n-----\n\n");

        Biblioteca livro4 = new Biblioteca("9781400049622", "The Zombie Survival Guide", "Terror", "Max Brooks");
        livro4.RegistrarLivros(livro4.getIsbnLivro(), livro4.getNomeLivro(), livro4.getGeneroLivro(), livro4.getAutorLivro());
        livro4.MostraLivro();
    }
}
