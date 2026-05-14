import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un gestor de biblioteca, que permet gestionar els
 * préstecs de llibres.
 * Permet prestar llibres als usuaris, comptar els llibres més prestats i el
 * total de préstecs realitzats.
 * 
 * @author Ramón Giménez y Eric Aliseda
 * @version 1.0
 */
public class GestorBiblioteca {
    private List<Prestec> prestecs;

    /**
     * Constructor del gestor de biblioteca.
     */
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    /**
     * Presta un llibre a un usuari si està disponible.
     * 
     * @param usuari usuari que demana el llibre
     * @param llibre llibre que es vol prestar
     */
    public void prestarLlibre(Usuari usuari, Llibre llibre) {

        if (llibre.estaDisponible()) {

            llibre.prestar();

            Prestec prestec = new Prestec(
                    usuari,
                    llibre,
                    LocalDate.now());

            prestecs.add(prestec);

            usuari.afegirLlibre(llibre);

            usuari.afegirPrestec(prestec);

            System.out.println(
                    usuari.getNom() +
                            " ha agafat el llibre: " +
                            llibre.getTitol());

        } else {

            System.out.println(
                    "Aquest llibre ja està prestat.");
        }
    }

    /**
     * Compta els llibres més prestats.
     */
    public void llibresMesPrestats() {

        List<String> titols = new ArrayList<>();
        List<Integer> comptadors = new ArrayList<>();

        for (Prestec p : prestecs) {
            String titol = p.getLlibre().getTitol();

            boolean trobat = false;

            for (int i = 0; i < titols.size(); i++) {

                if (!trobat && titols.get(i).equals(titol)) {
                    comptadors.set(i, comptadors.get(i) + 1);
                    trobat = true;
                }
            }

            if (!trobat) {
                titols.add(titol);
                comptadors.add(1);
            }
        }

        System.out.println("Llibres més prestats:");
        for (int i = 0; i < titols.size(); i++) {
            System.out.println(titols.get(i) + ": " + comptadors.get(i));
        }
    }

    /**
     * Retorna el total de préstecs realitzats.
     */
    public void totalPrestecs() {
        System.out.println("Total de préstecs: " + prestecs.size());
    }
}
