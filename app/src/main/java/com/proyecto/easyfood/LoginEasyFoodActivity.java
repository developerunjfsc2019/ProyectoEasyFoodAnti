package com.proyecto.easyfood;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
                        mostrarDialogoPersonalizado();
                    }else{
                        dni=Long.parseLong(etxtNumeroDni.getText().toString().trim());
                        contrasena=etxtContrasena.getText().toString().trim();
                        if(dni==72812719  && contrasena.equals("72812719")){
                            Intent intent=new Intent(getApplicationContext(),InicioEasyFood.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                            mostrarDialogoPersonalizado();
                        }
                    }


                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    private void mostrarDialogoPersonalizado(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LoginEasyFoodActivity.this);

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.dialog_personalizado,null);

        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();

        TextView txt = view.findViewById(R.id.text_dialog);
        txt.setText("Los campos no tienen que estar vacios");

        ImageButton imgbtnError = view.findViewById(R.id.imgbtnError);
        imgbtnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              dialog.dismiss();
            }
        });
    }

}
