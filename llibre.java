public class Llibre {
    private String titol;
    private String autor;
    private String categoria;
    private boolean prestat;
/**
 * Classe que representa un llibre, amb títol, autor, categoria i estat de préstec. Permet prestar i retornar el llibre, 
 * així com comprovar la seva disponibilitat.
 * @author Ramón Giménez y Eric Aliseda
 * @version 1.0
 */
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