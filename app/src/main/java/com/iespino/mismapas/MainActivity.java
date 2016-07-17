package com.iespino.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapas(View view)
    {
        Intent i = new Intent(this, MapsActivity.class);

        switch (view.getId())
        {
            case R.id.IvPlaza:
                i.putExtra("LUGAR", "Plaza de Arteaga Centro");
                i.putExtra("LATITUD", 18.356490183146125);
                i.putExtra("LONGITUD", -102.29020216969758);
                i.putExtra("PUNTERO", R.drawable.plaza_puntero);
                break;

            case R.id.IvBoulevard:
                i.putExtra("LUGAR", "Boulevard de Arteaga");
                i.putExtra("LATITUD", 18.357162253498203);
                i.putExtra("LONGITUD", -102.29851701764375);
                i.putExtra("PUNTERO", R.drawable.boulevard_puntero);
                break;

            case R.id.IvGlorieta:
                i.putExtra("LUGAR", "Glorieta de Arteaga");
                i.putExtra("LATITUD", 18.361265899046735);
                i.putExtra("LONGITUD", -102.29242303876191);
                i.putExtra("PUNTERO", R.drawable.glorieta_puntero);
                break;

            case R.id.IvIglesia:
                i.putExtra("LUGAR", "Iglesia la Candelaria de Arteaga");
                i.putExtra("LATITUD", 18.35575955824199);
                i.putExtra("LONGITUD", -102.28962817696839);
                i.putExtra("PUNTERO", R.drawable.iglesia_puntero);
                break;
        }
        startActivity(i);

    }
}
