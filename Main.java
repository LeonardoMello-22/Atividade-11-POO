public class Main {
    public static void main(String[] args) {
        // Informações do Livro
        String tituloLivro = "O Senhor dos Anéis";
        String anoLivro = "1954";
        int copiasLivro = 10;
        String autorLivro = "J.R.R. Tolkien";

        Livro livro = new Livro(tituloLivro, anoLivro, copiasLivro, autorLivro);

        // Informações do DVD
        String tituloDVD = "Interestelar";
        String anoDVD = "2014";
        int copiasDVD = 5;
        int duracaoDVD = 169; // duração em minutos

        DVD dvd = new DVD(tituloDVD, anoDVD, copiasDVD, duracaoDVD);

        // Informações da Revista
        String tituloRevista = "National Geographic";
        String anoRevista = "2022";
        int copiasRevista = 20;
        String edicaoRevista = "Janeiro";

        Revista revista = new Revista(tituloRevista, anoRevista, copiasRevista, edicaoRevista);

        // Simulação de empréstimo e devolução para cada item
        System.out.println("Livro emprestado.");
        livro.emprestarItem();
        System.out.println("Livro devolvido.");
        livro.devolverItem();

        System.out.println("DVD emprestado.");
        dvd.emprestarItem();
        System.out.println("DVD devolvido.");
        dvd.devolverItem();

        System.out.println("Revista emprestada.");
        revista.emprestarItem();
        System.out.println("Revista devolvida.");
        revista.devolverItem();
    }
}