import java.util.ArrayList;
import java.util.List;
/**
 * Classe que representa un usuari de la biblioteca, amb un nom i una llista de llibres prestats.
 * @author Ramón Giménez y Eric Aliseda
 * @version 1.0
 */
public class Usuari {
    private String nom;
    private List<Llibre> llibresPrestats;
    private List<Prestec> historial;

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    public String getNom() { return nom; }
    public List<Llibre> getLlibresPrestats() { return llibresPrestats; }
    public List<Prestec> getHistorial() { return historial; }

    public void afegirLlibre(Llibre llibre) { llibresPrestats.add(llibre); }

    public void retornarLlibre(Llibre llibre) { llibresPrestats.remove(llibre); }

    public void afegirPrestec(Prestec prestec) {
        historial.add(prestec);
    }
}