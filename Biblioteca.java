import java.util.ArrayList;
import java.util.List;
/**
 * Classe que representa una biblioteca, que conté una col·lecció de llibres i permet afegir llibres, 
 * buscar llibres per títol i categoria.
 * @author Ramón Giménez y Eric Aliseda
 * @version 1.0
 */
public class Biblioteca {
    private List<Llibre> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null;
    }

    public List<Llibre> buscarPerCategoria(String categoria) {
        List<Llibre> resultat = new ArrayList<>();

        for (Llibre llibre : llibres) {
            if (llibre.getCategoria() != null &&
                    llibre.getCategoria().equalsIgnoreCase(categoria)) {
                resultat.add(llibre);
            }
        }
        return resultat;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }
}