package com.example.libros;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.libros.databinding.ActivityMainBinding;

import ViewModel.MainViewModel;



/*
Crear una aplicación que conste de dos Activities. La Activity principal permitirá al usuario buscar un
libro de una lista de libros y al pulsar sobre el botón “Buscar”, mostrará en la segunda Activity el libro
junto a sus detalles.
Usted deberá desarrollar el proyecto aplicando MVVM y hacer uso de View Binding en sus vistas.
Luego subir el proyecto a GitHub y enviar link del repositorio a través de la tarea.
Tómese la libertad de modificar la vista a su gusto!

 */








public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.buscarLibro(binding.editTextTituloLibro.getText().toString());
            }
        });

    }



}