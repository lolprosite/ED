public class Llibre {
    private String titol;
    private String autor;
    private String categoria;
    private boolean prestat;

    public Llibre(String titol, String autor, String categoria) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.prestat = false;
    }

    public String getTitol() { return titol; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }

    public boolean estaDisponible() { return !prestat; }

    public void prestar() { this.prestat = true; }
    public void retornar() { this.prestat = false; }

    @Override
    public String toString() {
        return titol + " (" + categoria + ") de " + autor +
               (prestat ? " (En préstec)" : " (Disponible)");
    }
}