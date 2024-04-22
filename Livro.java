public class Livro extends ItemBiblioteca {
    private String autor;
    public Livro(String titulo, String ano, int numeroCopias, String autor) {
        super(titulo, ano, numeroCopias);
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}

