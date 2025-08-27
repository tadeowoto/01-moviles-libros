package Model;

import java.util.ArrayList;
import java.util.List;

public class LibroRepository {

    private List<Libro> libroList;

    public LibroRepository() {
        libroList = new ArrayList<>();

        // Crear lista de libros mock
        libroList.add(new Libro(
                1,
                "Cien Años de Soledad",
                "Gabriel García Márquez",
                417,
                "Una saga familiar que mezcla realidad y fantasía en el pueblo ficticio de Macondo."
        ));

        libroList.add(new Libro(
                2,
                "1984",
                "George Orwell",
                328,
                "Una novela distópica que explora los peligros del totalitarismo y la vigilancia masiva."
        ));

        libroList.add(new Libro(
                3,
                "El Principito",
                "Antoine de Saint-Exupéry",
                96,
                "Un cuento filosófico que aborda temas de amor, amistad y soledad a través de los ojos de un niño."
        ));

        libroList.add(new Libro(
                4,
                "Orgullo y Prejuicio",
                "Jane Austen",
                432,
                "Una novela romántica que explora la sociedad y las relaciones de la Inglaterra del siglo XIX."
        ));

        libroList.add(new Libro(
                5,
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                863,
                "Las aventuras y desventuras de un hidalgo que decide convertirse en caballero andante."
        ));
    }

    public List<Libro> getAllLibros() {
        return libroList;
    }

    // Método para buscar un libro por título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libroList) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
