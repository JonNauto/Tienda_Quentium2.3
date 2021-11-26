package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.VideoView;

import Objetos.Curso;

public class Curso1 extends AppCompatActivity {

    private VideoView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso1);

        //Buscamos el VideoView por controles
        video = findViewById(R.id.vc1);
        String videoPAth = "android.resource://"+getPackageName()+"/"+ R.raw.c1analy;
        Uri uri = Uri.parse(videoPAth);
        video.setVideoURI(uri);

        // Le agregamos los mecanismos de control de el video
        MediaController controladres = new MediaController(this);
        video.setMediaController(controladres);
        controladres.setAnchorView(video);


    }

    public void Somos(View view)
    {
        Intent i = new Intent(getBaseContext(),Quienes_Somos.class);
        startActivity(i);
    }

    public void Team(View view)
    {
        Intent i = new Intent(getBaseContext(),Teamm.class);
        startActivity(i);

    }

    public void Contactanos(View view)
    {
        Intent i = new Intent(getBaseContext(),Contactanos.class);
        startActivity(i);

    }

    public void Servicio(View view)
    {
        Intent i = new Intent(getBaseContext(),Servicios.class);
        startActivity(i);


    }
}