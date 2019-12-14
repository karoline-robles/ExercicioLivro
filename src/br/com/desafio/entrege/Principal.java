package br.com.desafio.entrege;

public class Principal {
    public static void main(String[] args) {
        //objetos
       Livro livro1 = new Livro(1.1, "Me poupe", 2012, "23A");
       Livro livro2 = new Livro(1.2, "A arte do foda-se", 2010, "45B");
       Livro livro3 = new Livro(1.3, "Negócios do século XXI", 2011,"25C" );
       Livro livro4 = new Livro(1.4, "Pegue Fogo", 2009, "27D");

       Livraria livrariaDH = new Livraria();

       livrariaDH.cadastrarLivro(livro1);
       livrariaDH.cadastrarLivro(livro2);
       livrariaDH.cadastrarLivro(livro3);
       livrariaDH.cadastrarLivro(livro4);

       livrariaDH.consultar(1.2);

       livrariaDH.efetuarVenda(1.3);


    }
}
