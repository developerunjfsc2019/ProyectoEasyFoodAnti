package com.proyecto.easyfood.ui.inicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.proyecto.easyfood.R;

public class InicioEasyFoodActivity extends Fragment {

    private Button btnAsistencia;
    private Button btnQr;
    private Button btnInforme;
    private Button btnMenu;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);
        btnAsistencia= root.findViewById(R.id.btnAsistencia);
        btnMenu=root.findViewById(R.id.btnMenu);
        btnQr=root.findViewById(R.id.btnQr);
        btnInforme= root.findViewById(R.id.btnInforme);

        btnAsistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate( R.id.action_nav_home_to_nav_asistencia);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate( R.id.action_nav_home_to_nav_menu);
            }
        });
        btnQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate( R.id.action_nav_home_to_nav_qr);
            }
        });
        btnInforme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate( R.id.action_nav_home_to_nav_informeasistencia);
            }
        });


        return root;
    }
}