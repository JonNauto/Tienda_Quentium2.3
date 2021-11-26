package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import Objetos.Curso;

public class Servicios extends AppCompatActivity {

    private Spinner costo, costo2,costo3,costo4;
    private TextView result,result2,result3,result4;
    //Instancion objeto Curso
    Curso c1 = new Curso();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        costo = findViewById(R.id.sp1);
        costo2 = findViewById(R.id.sp2);
        costo3 = findViewById(R.id.sp3);
        costo4 = findViewById(R.id.sp4);

        result = findViewById(R.id.tx1);
        result2 = findViewById(R.id.txtp);
        result3 = findViewById(R.id.txt3);
        result4 = findViewById(R.id.txt4);



        //Recibo

        Bundle bun = getIntent().getExtras();
        String[] Listado = bun.getStringArray("curso");
        String[] Listado2 = bun.getStringArray("curso2");
        String[] Listado3 = bun.getStringArray("curso3");
        String[] Listado4 = bun.getStringArray("curso4");


        ArrayAdapter adaptCurso = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Listado);
        costo.setAdapter(adaptCurso);

        ArrayAdapter adaptCurso2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Listado2);
        costo2.setAdapter(adaptCurso2);

        ArrayAdapter adaptCurso3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Listado3);
        costo3.setAdapter(adaptCurso3);

        ArrayAdapter adaptCurso4 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Listado4);
        costo4.setAdapter(adaptCurso4);




    }

    public void Calcular(View view) {
        String opcion = costo.getSelectedItem().toString();
        int resultado = 0;

        for (int i = 0; i < opcion.length(); i++) {
            if (opcion.equals(c1.getCurso()[i])) {
                resultado = c1.getPrecios()[i];
                result.setText("Precio final: " + resultado);
                break;

            }
        }
    }


   public void Calcular2(View view)
   {

       String opcion = costo2.getSelectedItem().toString();
       int resultado = 0;

       for (int i = 0; i < opcion.length(); i++) {
           if (opcion.equals(c1.getCurso2()[i])) {
               resultado = c1.getPrecios2()[i];
               result2.setText("Precio final: " + resultado);
               break;

           }
       }


   }

    public void Calcular3(View view)
    {

        String opcion = costo3.getSelectedItem().toString();
        int resultado = 0;

        for (int i = 0; i < opcion.length(); i++) {
            if (opcion.equals(c1.getCurso3()[i])) {
                resultado = c1.getPrecios3()[i];
                result3.setText("Precio final: " + resultado);
                break;

            }
        }



    }

    public void Calcular4(View view)
    {

        String opcion = costo4.getSelectedItem().toString();
        int resultado = 0;

        for (int i = 0; i < opcion.length(); i++) {
            if (opcion.equals(c1.getCurso4()[i])) {
                resultado = c1.getPrecios4()[i];
                result4.setText("Precio final: " + resultado);
                break;

            }
        }



    }







    //Falta curso 1 implementar boton ver precio o algo por el estilo para mostrar precio del curso tanto en USD como en CLP

    public void Curso2(View view)
    {
        Intent i = new Intent(this,Curso2.class);
        startActivity(i);

    }

    public void Curso3(View view)
    {
        Intent i = new Intent(this,Curso3.class);
        startActivity(i);

    }


    public void Curso4(View view)
    {
        Intent i = new Intent(this,Curso4.class);
        startActivity(i);

    }

    //Intentes Menus

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