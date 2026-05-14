public class Llibre {
    private String titol;
    private String autor;
    private String categoria;
    private boolean prestat;

    /**
     * Classe que representa un llibre, amb títol, autor, categoria i estat de
     * préstec. Permet prestar i retornar el llibre,
     * així com comprovar la seva disponibilitat.
     * 
     * @author Ramón Giménez y Eric Aliseda
     * @version 1.0
     */
    /**
     * Constructor del llibre.
     * 
     * @param titol     títol del llibre
     * @param autor     autor del llibre
     * @param categoria categoria del llibre
     */
    public Llibre(String titol, String autor, String categoria) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.prestat = false;
    }

    /**
     * Retorna el títol del llibre.
     * 
     * @return títol del llibre
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Retorna l'autor del llibre.
     * 
     * @return autor del llibre
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna la categoria del llibre.
     * 
     * @return categoria del llibre
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Comprova si el llibre està disponible.
     * 
     * @return true si està disponible
     */
    public boolean estaDisponible() {
        return !prestat;
    }

    /**
     * Marca el llibre com prestat.
     */
    public void prestar() {
        this.prestat = true;
    }

    /**
     * Marca el llibre com retornat.
     */
    public void retornar() {
        this.prestat = false;
    }

    /**
     * Retorna la informació del llibre.
     * 
     * @return informació del llibre
     */
    @Override
    public String toString() {
        return titol + " (" + categoria + ") de " + autor +
                (prestat ? " (En préstec)" : " (Disponible)");
    }
}