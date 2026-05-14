import java.time.LocalDate;

/**
 * Classe que representa un prestec de llibre a la biblioteca.
 * 
 * @author Ramón Giménez y Eric Aliseda
 * @version 1.0
 */
public class Prestec {
    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;

    /**
     * Constructor del prestec.
     * 
     * @param usuari      usuari que fa el préstec
     * @param llibre      llibre que es presta
     * @param dataPrestec data del préstec
     */
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    /**
     * Retorna l'usuari del préstec.
     * 
     * @return usuari del préstec
     */
    public Usuari getUsuari() {
        return usuari;
    }

    /**
     * Retorna el llibre del préstec.
     * 
     * @return llibre del préstec
     */
    public Llibre getLlibre() {
        return llibre;
    }

    /**
     * Retorna la data de retorn del préstec.
     * 
     * @return data de retorn del préstec
     */
    public LocalDate getDataRetorn() {
        return dataRetorn;
    }
}
