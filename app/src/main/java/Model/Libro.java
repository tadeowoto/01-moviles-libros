package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Serializable {


    private int id;
    private String titulo;
    private String autor;
    private  int cantPaginas;
    private String Descripcion;

    public Libro(int id, String titulo, String autor, int cantPaginas, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public static List<Libro> getBookList() {
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro(
                1,
                "Cien Años de Soledad",
                "Gabriel García Márquez",
                1967,
                "Una saga familiar que mezcla realidad y fantasía en el pueblo ficticio de Macondo."
        ));

        libros.add(new Libro(
                2,
                "1984",
                "George Orwell",
                1949,
                "Una novela distópica que explora los peligros del totalitarismo y la vigilancia masiva."
        ));

        libros.add(new Libro(
                3,
                "El Principito",
                "Antoine de Saint-Exupéry",
                1943,
                "Un cuento filosófico que aborda temas de amor, amistad y soledad a través de los ojos de un niño."
        ));

        libros.add(new Libro(
                4,
                "Orgullo y Prejuicio",
                "Jane Austen",
                1813,
                "Una novela romántica que explora la sociedad y las relaciones de la Inglaterra del siglo XIX."
        ));

        libros.add(new Libro(
                5,
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                1605,
                "Las aventuras y desventuras de un hidalgo que decide convertirse en caballero andante."
        ));

        return libros;
    }
}
