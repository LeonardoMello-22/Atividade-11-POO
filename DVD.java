public class DVD extends ItemBiblioteca {
    private int duracao;

    public DVD(String titulo, String ano, int numeroCopias, int duracao) {
        super(titulo, ano, numeroCopias);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
