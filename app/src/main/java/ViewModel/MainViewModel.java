package ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import Model.Libro;
import Model.LibroRepository;

public class MainViewModel extends AndroidViewModel {

    MutableLiveData<String> tituloMutable = new MutableLiveData<>();
    MutableLiveData<Libro> libro = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData getTitulo() {
        if (tituloMutable.getValue() == null) {
            return new MutableLiveData<String>();
        }
        return tituloMutable;
    };

    public LiveData getLibro() {
        if (libro.getValue() == null) {
            return new MutableLiveData<Libro>();
        }
        return libro;
    };

    public void buscarLibro(String titulo){
        LibroRepository repo = new LibroRepository();
        Libro l = repo.buscarLibroPorTitulo(titulo);
        if(l != null){
            libro.setValue(l);
        }else{
            tituloMutable.setValue("no se encontro el libro");
        }
    }

}
