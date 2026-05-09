import java.util.ArrayList;
import java.util.List;

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