package com.proyecto.easyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                dni=Long.parseLong(etxtNumeroDni.getText().toString());
                contrasena=etxtContrasena.getText().toString();

                if(dni==72812719  && contrasena.equals("72812719")){
                    Intent intent=new Intent(getApplicationContext(),InicioEasyFood.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
