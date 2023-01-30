package com.dam.actividaduf3_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static int TAM = 24;
    Button btnCambiarTam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCambiarTam = findViewById(R.id.btnCambiarTam);
        btnCambiarTam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
               });

        getSupportFragmentManager().beginTransaction().add(R.id.flContenedor, new fragmen_inicio()).commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mnSalir){
            mostrarDialogo();
        }
        return super.onOptionsItemSelected(item);
    }


    private void mostrarDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage(R.string.confirmarSalir);
        builder.setPositiveButton(R.string.btnd_aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton(R.string.btnd_cancelar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad = builder.create();
        ad.setCanceledOnTouchOutside(false);
        ad.show();
    }
}