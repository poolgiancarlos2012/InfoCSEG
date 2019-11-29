package com.example.poolpg.infocseg.activity.Principal;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.poolpg.infocseg.R;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;

public class PrincipalActivity extends AppCompatActivity {

    TextView lbl_principal;

    private Typeface typ_futurabold;



    GridView androidGridView;

    String[] gridViewString = {
            "User",
            "Config",
            "Clientes",
            "Cierre",
            "Cultivo",
            "Objetivo",
            "Problema",
            "Producto",
            "Gestion",
            "Rutas",
            "Ubicacion"
    } ;
    int[] gridViewImageId = {
            R.drawable.menuuser,
            R.drawable.menuconfig,
            R.drawable.menuclientes,
            R.drawable.menucierre,
            R.drawable.menucultivo,
            R.drawable.menuobjetivo,
            R.drawable.menuproblema,
            R.drawable.menuproducto,
            R.drawable.menugestion,
            R.drawable.menurutas,
            R.drawable.menuubicacion
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        String futurabold = "fonts/Futura Md BT Medium.ttf";
        this.typ_futurabold = Typeface.createFromAsset(getAssets(),futurabold);
        lbl_principal = findViewById(R.id.vwPrincipal);
        lbl_principal.setTypeface(typ_futurabold);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(PrincipalActivity.this, gridViewString, gridViewImageId);
        androidGridView = findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(PrincipalActivity.this, "GridView Item: "+i+" - " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}
