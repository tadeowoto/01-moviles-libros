package com.example.libros;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.libros.databinding.ActivityDetalleLibroBinding;

import ViewModel.DetalleLibroViewModel;

public class DetalleLibroActivity extends AppCompatActivity {

    private ActivityDetalleLibroBinding binding;
    private DetalleLibroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(DetalleLibroViewModel.class);
        setContentView(binding.getRoot());
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}