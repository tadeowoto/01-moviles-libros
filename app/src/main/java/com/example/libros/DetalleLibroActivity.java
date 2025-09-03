package com.example.libros;

import android.os.Bundle;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;
import com.example.libros.databinding.ActivityDetalleLibroBinding;

import Model.Libro;
import ViewModel.DetalleLibroViewModel;

public class DetalleLibroActivity extends AppCompatActivity {

    private ActivityDetalleLibroBinding binding;
    private DetalleLibroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener el objeto Libro
        Libro libro = (Libro) getIntent().getSerializableExtra("libro");

        if (libro != null) {
            binding.tituloLibro.setText(libro.getTitulo());
            binding.autorLibro.setText("Autor: " + libro.getAutor());
            binding.paginasLibro.setText("Páginas: " + libro.getCantPaginas());
            binding.descripcionLibro.setText(libro.getDescripcion());
            Glide.with(this)
                    .load(libro.getImagenUrl())
                    .placeholder(
                            R.drawable.ic_launcher_foreground
                    )
                    .error(R.drawable.ic_launcher_foreground)
                    .into(binding.imagenLibro);
        } else {
            Toast.makeText(this, "No se encontró el libro", Toast.LENGTH_SHORT).show();
            finish();
        }
    }


}