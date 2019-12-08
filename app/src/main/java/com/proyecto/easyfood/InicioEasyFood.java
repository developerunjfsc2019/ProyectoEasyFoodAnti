package com.proyecto.easyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class InicioEasyFood extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_easy_food);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each MenuEasyFood ID as a set of Ids because each
        // MenuEasyFood should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(

                R.id.nav_home, R.id.nav_menu,R.id.nav_asistencia, R.id.nav_qr, R.id.nav_informeasistencia
                , R.id.nav_perfil, R.id.nav_reglamentointerno, R.id.nav_cerrarsesion)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.setItemIconTintList(null);
        final Intent SplashEasyFoodActivity = new Intent(this, com.proyecto.easyfood.SplashEasyFoodActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(420000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(SplashEasyFoodActivity);
                    finish();
                }
            }
        };
        timer.start();


    }
    @Override protected void onStart(){
        super.onStart();
      //  Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();

    }
    @Override protected void onResume(){
        super.onResume();
       // Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
       // Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
       // Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the MenuEasyFood; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio_easy_food, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }





}
