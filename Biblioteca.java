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
    /**
     * Constructor de la biblioteca.
     */
    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }
    /**
     * Afegeix un llibre a la biblioteca.
     * 
     * @param llibre llibre a afegir
     */
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    /**
     * Busca un llibre per títol.
     * 
     * @param titol títol del llibre a buscar
     * @return el llibre trobat o null si no s'ha trobat
     */
    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null;
    }

    /**
     * Busca llibres per categoria.
     * 
     * @param categoria categoria dels llibres a buscar
     * @return una llista amb els llibres trobats
     */
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

    /**
     * Retorna la llista de llibres de la biblioteca.
     * 
     * @return la llista de llibres
     */
    public List<Llibre> getLlibres() {
        return llibres;
    }
}