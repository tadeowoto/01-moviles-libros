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

}
