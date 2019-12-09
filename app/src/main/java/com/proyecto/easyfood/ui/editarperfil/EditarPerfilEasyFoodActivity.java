package com.proyecto.easyfood.ui.editarperfil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.proyecto.easyfood.R;

import java.util.Timer;
import java.util.TimerTask;

public class EditarPerfilEasyFoodActivity extends Fragment {


    private Button btnGuardarDatos;
    private EditText etxtEmail;
    private EditText etxtTelefono;
    private EditText etxtCelular;
    private String email;
    private String telefono;
    private String celular;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_editarperfil, container, false);
        btnGuardarDatos=root.findViewById(R.id.btnGuardarDatos);
        etxtEmail=root.findViewById(R.id.etxtEmail);
        etxtTelefono=root.findViewById(R.id.etxtTelefono);
        etxtCelular=root.findViewById(R.id.etxtCelular);

        btnGuardarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=etxtEmail.getText().toString();
                telefono=etxtTelefono.getText().toString();
                celular=etxtCelular.getText().toString();

                if(email.trim().isEmpty() || telefono.trim().isEmpty() || celular.trim().isEmpty() ){
                    mostrarDialogoPersonalizadoDatosVacios();
                    btnGuardarDatos.setVisibility(View.VISIBLE);
                }else{
                    mostrarDialogoPersonalizadoDatosCompletos();
                    Navigation.findNavController(view).navigate( R.id.action_nav_editarperfil_to_nav_home);
                }
            }
        });




        return root;
    }
    private void mostrarDialogoPersonalizadoDatosVacios(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadodatosvacios,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 1000);

    }
    private void mostrarDialogoPersonalizadoDatosCompletos(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadodatoscompletos,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 1000);

    }

}