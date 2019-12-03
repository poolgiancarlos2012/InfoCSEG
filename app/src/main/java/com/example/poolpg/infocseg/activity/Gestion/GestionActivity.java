package com.example.poolpg.infocseg.activity.Gestion;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.poolpg.infocseg.R;

public class GestionActivity extends AppCompatActivity {

    TextView lbl_backprincipal;
    private Typeface typ_segoeuibold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

//        String segoeuibold = "fonts/Segoe UI Bold.ttf";
//        this.typ_segoeuibold = Typeface.createFromAsset(getAssets(),segoeuibold);
//        lbl_backprincipal = findViewById(R.id.lblbackprincipal);
//        lbl_backprincipal.setTypeface(typ_segoeuibold);
    }
}
