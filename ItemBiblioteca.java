public class ItemBiblioteca {
    private String titulo;
    private String ano;
    private int numeroCopias;

    public ItemBiblioteca(String titulo, String ano, int numeroCopias) {
        this.titulo = titulo;
        this.ano = ano;
        this.numeroCopias = numeroCopias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public void calcularMulta() {
        // Implementação do cálculo da multa, deixarei vazio por enquanto
    }

    public void emprestarItem() {
        if (numeroCopias > 0) {
            numeroCopias--;
            System.out.println("Item emprestado com sucesso.");
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo.");
        }
    }

    public void devolverItem() {
        numeroCopias++;
        System.out.println("Item devolvido com sucesso.");
    }

    public void verificarAtrasoDevolucao(String dataDevolucaoString) {
        // Obtendo a data atual manualmente
        String dataAtualString = java.time.LocalDate.now().toString();

        // Comparando as datas
        if (dataAtualString.compareTo(dataDevolucaoString) > 0) {
            calcularMulta();
        }
    }
}
