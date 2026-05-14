/**
 * Classe principal que demostra el funcionament
 * del sistema de gestió de biblioteca.
 * 
 * Es creen llibres, usuaris i préstecs,
 * i es mostren diferents funcionalitats
 * com el préstec de llibres, l'historial
 * de préstecs, la cerca per categoria
 * i les estadístiques.
 * 
 * @author Ramón Giménez
 * @author Eric Aliseda
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear llibres
        Llibre llibre1 = new Llibre(
                "1984",
                "George Orwell",
                "Distopia");

        Llibre llibre2 = new Llibre(
                "El petit príncep",
                "Antoine de Saint-Exupéry",
                "Fàbula");

        // Afegir llibres a la biblioteca
        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);

        // Crear usuari
        Usuari usuari = new Usuari("Carla");

        // Crear gestor de biblioteca
        GestorBiblioteca gestor = new GestorBiblioteca();

        // Realitzar préstec d'un llibre
        gestor.prestarLlibre(usuari, llibre1);

        System.out.println();

        // Mostrar historial de préstecs de l'usuari
        System.out.println(
                "Historial de préstecs de " +
                usuari.getNom() +
                ":");

        for (Prestec p : usuari.getHistorialPrestecs()) {

            System.out.println(
                    p.getLlibre().getTitol() +
                    " - Data retorn: " +
                    p.getDataRetorn());
        }

        System.out.println();

        // Mostrar llibres d'una categoria concreta
        System.out.println(
                "Llibres de categoria Distopia:");

        for (Llibre llibre : biblioteca.buscarPerCategoria("Distopia")) {

            System.out.println(llibre);
        }

        System.out.println();

        // Mostrar estadístiques de préstecs
        gestor.llibresMesPrestats();

        gestor.totalPrestecs();
    }
}