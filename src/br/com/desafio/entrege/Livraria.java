package br.com.desafio.entrege;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> lista = new ArrayList<>();

    void cadastrarLivro(Livro livro) {
        lista.add(livro);

        System.out.println("Livro cadastrado com sucesso: " + livro.getNome());
    }

    //metodos
    public void consultar(double codigo) {

        Livro livroEncontrado = null;

        for (Livro livro : lista) {
            if (livro.getCodigo() == codigo) {
                livroEncontrado = livro;
            }
        }

        if (livroEncontrado !=  null){
            System.out.println("Livro encontrado "+livroEncontrado.getNome());
        }else{
            System.out.println("Nao encontrado");
        }
    }

    public void efetuarVenda(double codigo) {
            Livro livroVendido = null;
        for (Livro livro : lista) {
            if (livro.getCodigo() == codigo) {
                livroVendido=livro;
                lista.remove(livro);
            }
        }
        if (livroVendido != null) {
            System.out.println("Livro vendido");
        }else{
            System.out.println("Não foi vendido");
        }
    }
}
