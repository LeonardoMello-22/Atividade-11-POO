public class Revista extends ItemBiblioteca {
    private String edicao;

    public Revista(String titulo, String ano, int numeroCopias, String edicao) {
        super(titulo, ano, numeroCopias);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
}
