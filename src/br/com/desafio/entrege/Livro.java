package br.com.desafio.entrege;

public class Livro {
    private double codigo;
    private String nome;
    private int anoDeLancamento;
    private String isbn;
    private String autor;


    public Livro(double codigo, String nome, int anoDeLancamento, String isbn) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.isbn = isbn;

    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
