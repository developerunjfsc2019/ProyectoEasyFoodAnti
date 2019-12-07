package com.proyecto.easyfood;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class LoginEasyFoodActivity extends AppCompatActivity {

    private EditText etxtNumeroDni;
    private EditText etxtContrasena;
    private Button btnIniciarSesion;
    private Long dni;
    private String contrasena;
    private ProgressBar loadingProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etxtNumeroDni=(EditText) findViewById(R.id.etxtNumeroDni);
        etxtContrasena=(EditText) findViewById(R.id.etxtContrasena);
        btnIniciarSesion=(Button) findViewById(R.id.btnIniciarSesion);
        loadingProgress=(ProgressBar) findViewById(R.id.regProgressBar);
        loadingProgress.setVisibility(View.INVISIBLE);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnIniciarSesion.setVisibility(View.INVISIBLE);
                loadingProgress.setVisibility(View.VISIBLE);
                if(etxtNumeroDni.getText().toString().trim().isEmpty() || etxtContrasena.getText().toString().trim().isEmpty() ){

                    mostrarDialogoPersonalizadoDatosVacios();
                    btnIniciarSesion.setVisibility(View.VISIBLE);
                    loadingProgress.setVisibility(View.INVISIBLE);
                    btnIniciarSesion.setVisibility(View.VISIBLE);
                }
                else{
                    dni=Long.parseLong(etxtNumeroDni.getText().toString().trim());
                    contrasena=etxtContrasena.getText().toString().trim();

                    if(((dni ==72812719)) && !contrasena.equals("72812719")){
                        mostrarDialogoPersonalizadoContrasena();
                        btnIniciarSesion.setVisibility(View.VISIBLE);
                        loadingProgress.setVisibility(View.INVISIBLE);

                    } if ((!(dni ==72812719)) && contrasena.equals("72812719")){
                        mostrarDialogoPersonalizadoUsuario();
                        btnIniciarSesion.setVisibility(View.VISIBLE);
                        loadingProgress.setVisibility(View.INVISIBLE);
                    } if ((!(dni ==72812719)) && !contrasena.equals("72812719")){
                        mostrarDialogoPersonalizadoNadaCorrecto();
                        btnIniciarSesion.setVisibility(View.VISIBLE);
                        loadingProgress.setVisibility(View.INVISIBLE);

                    } if (((dni ==72812719))  && contrasena.equals("72812719")) {
                        mostrarDialogoPersonalizadoTodoOk();
                        Intent intent = new Intent(getApplicationContext(), InicioEasyFoodActivity.class);
                        btnIniciarSesion.setVisibility(View.VISIBLE);
                        loadingProgress.setVisibility(View.INVISIBLE);
                        startActivity(intent);


                    }
                }
            }
        });


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        //Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), SplashEasyFoodActivity.class);
        startActivity(intent);
        this.finish();
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
        }, 1000);

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
        }, 1000);


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
        }, 1000);

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
        }, 1000);

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
        }, 1000);

    }

}
