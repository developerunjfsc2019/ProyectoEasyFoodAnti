package com.proyecto.easyfood.ui.cerrarsesion;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

//import com.proyecto.easyfood.InicioEasyFoodActivity;
import com.proyecto.easyfood.InicioEasyFoodActivity;
import com.proyecto.easyfood.LoginEasyFoodActivity;
import com.proyecto.easyfood.R;

public class CerrarSesionFragment extends Fragment {
    Button si;
    Button no;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cerrarsesion, container, false);
        si =root.findViewById(R.id.button);
        no =root.findViewById(R.id.btnNo);

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate( R.id.nav_home);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

               System.exit(0);

           }
        });




        return root;
    }

}
