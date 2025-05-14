public class Livro {
    private String titulo;
    private String autor;
    private int paginasLidas;
    private int totalPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }
    }

    public void ler(int paginas) {
        if (paginas > 0) {
            paginasLidas += paginas;
            if (paginasLidas > totalPaginas) {
                paginasLidas = totalPaginas;
            }
        }
    }

    public double progresso() {
        if (totalPaginas == 0) return 0;
        return (paginasLidas * 100.0) / totalPaginas;
    }
}