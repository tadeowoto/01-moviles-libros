package ViewModel;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.libros.DetalleLibroActivity;

import Model.Libro;
import Model.LibroRepository;

public class MainViewModel extends AndroidViewModel {

    MutableLiveData<String> tituloMutable = new MutableLiveData<>();
    MutableLiveData<Libro> libro = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libro> getLibro() {
        return libro;
    }

    public LiveData<String> getMensaje() {
        return tituloMutable;
    }


    public void buscarLibro(String titulo){
        LibroRepository repo = new LibroRepository();
        Libro l = repo.buscarLibroPorTitulo(titulo);
        if(l != null){
            //si encontro el libro le setea el libro al mutable que observa el main
            libro.setValue(l);
        }else{
            tituloMutable.setValue("no se encontro el libro");
        }
    }

}
