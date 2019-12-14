package com.proyecto.easyfood.ui.asistencia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.proyecto.easyfood.HomeEasyFoodActivity;
import com.proyecto.easyfood.LoginEasyFoodActivity;
import com.proyecto.easyfood.R;

import java.util.Timer;
import java.util.TimerTask;


public class AsistenciaFragment extends Fragment {

    private Button btnGuardarAsistencia;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_asistencia, container, false);
        btnGuardarAsistencia=root.findViewById(R.id.btnGuardarAsistencia);
        btnGuardarAsistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mostrarDialogoPersonalizadoConfirmacionAsistencia();
                    Navigation.findNavController(view).navigate( R.id.nav_home);

            }
        });
        return root;
    }
    private void mostrarDialogoPersonalizadoConfirmacionAsistencia(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadoconfirmacionasistencia,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 2000);


    }

}
