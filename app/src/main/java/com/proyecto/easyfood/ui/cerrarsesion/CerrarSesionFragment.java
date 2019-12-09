package com.proyecto.easyfood.ui.cerrarsesion;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.proyecto.easyfood.InicioEasyFoodActivity;
import com.proyecto.easyfood.R;

public class CerrarSesionFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cerrarsesion, container, false);

        return root;
    }
}