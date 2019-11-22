package com.proyecto.easyfood;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class LoginEasyFoodActivity extends AppCompatActivity {

    private EditText etxtNumeroDni;
    private EditText etxtContrasena;
    private Button btnIniciarSesion;
    private Long dni;
    private String contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etxtNumeroDni=(EditText)findViewById(R.id.etxtNumeroDni);
        etxtContrasena=(EditText)findViewById(R.id.etxtContrasena);
        btnIniciarSesion=(Button)findViewById(R.id.btnIniciarSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    if(etxtNumeroDni.getText().toString().trim().isEmpty() || etxtContrasena.getText().toString().trim().isEmpty() ){
                        mostrarDialogoPersonalizadoDatosVacios();
                    }else{
                        dni=Long.parseLong(etxtNumeroDni.getText().toString().trim());
                        contrasena=etxtContrasena.getText().toString().trim();

                        if(((dni ==72812719)) && !contrasena.equals("72812719")){
                            mostrarDialogoPersonalizadoContrasena();
                        } if ((!(dni ==72812719)) && contrasena.equals("72812719")){
                            mostrarDialogoPersonalizadoUsuario();
                        } if ((!(dni ==72812719)) && !contrasena.equals("72812719")){
                            mostrarDialogoPersonalizadoNadaCorrecto();
                        } if (((dni ==72812719))  && contrasena.equals("72812719")) {
                            mostrarDialogoPersonalizadoTodoOk();
                            Intent intent = new Intent(getApplicationContext(), InicioEasyFood.class);
                            startActivity(intent);
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }


            }
        });
    }

    private void mostrarDialogoPersonalizadoContrasena(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginEasyFoodActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadocontrasena,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 1500);


    }

    private void mostrarDialogoPersonalizadoUsuario(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginEasyFoodActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadousuarioincorrecto,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 1500);




    }

    private void mostrarDialogoPersonalizadoTodoOk(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginEasyFoodActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadodatoscorrectos,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 1500);



    }
    private void mostrarDialogoPersonalizadoNadaCorrecto(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginEasyFoodActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_personalizadodatosincorrectos,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Timer timercancel = new Timer();
        timercancel.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss();
                timercancel.cancel();
            }
        }, 1500);


    }
    private void mostrarDialogoPersonalizadoDatosVacios(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginEasyFoodActivity.this);
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
        }, 1500);
     

    }


}
