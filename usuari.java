import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un usuari de la biblioteca, amb un nom i una llista de
 * llibres prestats.
 * 
 * @author Ramón Giménez y Eric Aliseda
 * @version 1.0
 */
public class Usuari {
    private String nom;
    private List<Llibre> llibresPrestats;
    private List<Prestec> historialPrestecs;

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
        this.historialPrestecs = new ArrayList<>();
    }

    /**
     * Retorna el nom de l'usuari.
     * 
     * @return nom de l'usuari
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retorna la llista de llibres prestats per l'usuari.
     * 
     * @return llista de llibres prestats
     */
    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    /**
     * Retorna l'historial de préstecs de l'usuari.
     * 
     * @return historial de préstecs
     */
    public List<Prestec> getHistorialPrestecs() {
        return historialPrestecs;
    }

    /**
     * Afegeix un llibre a la llista de llibres prestats.
     * 
     * @param llibre llibre a afegir
     */
    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    /**
     * Retorna un llibre de la llista de llibres prestats.
     * 
     * @param llibre llibre a retornar
     */
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /**
     * Afegeix un préstec a l'historial de l'usuari.
     * 
     * @param prestec préstec a afegir
     */
    public void afegirPrestec(Prestec prestec) {
        historialPrestecs.add(prestec);
    }
}
