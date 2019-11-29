package com.example.poolpg.infocseg.activity.Principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.poolpg.infocseg.R;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "User", "Android", "Mobile", "Website", "Profile", "WordPress",
            "Alram", "Android", "Mobile", "Website", "Profile", "WordPress",
            "Alram", "Android", "Mobile", "Website", "Profile", "WordPress",

    } ;
    int[] gridViewImageId = {
            R.drawable.usuario, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre,
            R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre,
            R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre, R.drawable.cierre,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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
