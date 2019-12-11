package com.proyecto.easyfood.ui.reglamentointerno;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.proyecto.easyfood.R;

public class ReglamentoInternoFragment extends Fragment {
Button click;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_reglamentointerno, container, false);
        click =root.findViewById(R.id.btnClic);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://transparencia.unjfsc.edu.pe/DOCUMENTOS/INFORMACION_GENERAL/ROF-UNJFSC.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        return root;
    }
}