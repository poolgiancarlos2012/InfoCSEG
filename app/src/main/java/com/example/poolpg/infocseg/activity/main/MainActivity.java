package com.example.poolpg.infocseg.activity.main;


import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.graphics.Typeface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.poolpg.infocseg.R;
import com.example.poolpg.infocseg.activity.Principal.PrincipalActivity;

public class MainActivity extends AppCompatActivity implements MainView {

    TextView lbl_vwAccede;
    TextView lbl_vwtucuenta;
    TextView lbl_vwaa;

    TextView lbl_usu;
    TextView lbl_pass;

    TextView lbl_login;
    TextView lbl_crear;
    TextView lbl_olvidar;

    private Typeface typ_futurabold;
    private Typeface typ_acceso;
    private Typeface typ_opcionlogeo;

    private Button btnLogin;

    MainPresenter mainpresenter;

    EditText txt_usuario, txt_password;

    ProgressDialog progressDialog;


    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // para que rote la pantalla Este codigo es para cada pantalla colocarlos en cada vista
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        String futurabold = "fonts/Futura Md BT Medium.ttf";
        this.typ_futurabold = Typeface.createFromAsset(getAssets(),futurabold);
        lbl_vwAccede = findViewById(R.id.vwAccede);
        lbl_vwAccede.setTypeface(typ_futurabold);

        lbl_vwtucuenta = findViewById(R.id.vwtucuenta);
        lbl_vwtucuenta.setTypeface(typ_futurabold);

        lbl_vwaa = findViewById(R.id.vwaa);
        lbl_vwaa.setTypeface(typ_futurabold);

        String fontacceso = "fonts/Futura Bold Condensed BT.ttf";
        this.typ_acceso = Typeface.createFromAsset(getAssets(),fontacceso);

        lbl_usu = findViewById(R.id.lblusers);
        lbl_usu.setTypeface(typ_acceso);

        lbl_pass = findViewById(R.id.lblpass);
        lbl_pass.setTypeface(typ_acceso);

        String fontopciones = "fonts/OpenSans-Bold-webfont.ttf";
        this.typ_opcionlogeo = Typeface.createFromAsset(getAssets(),fontopciones);

        lbl_login = findViewById(R.id.login);
        lbl_login.setPaintFlags(lbl_login.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        lbl_login.setTypeface(typ_opcionlogeo);

        lbl_crear = findViewById(R.id.crearcuenta);
        lbl_crear.setTypeface(typ_opcionlogeo);

        lbl_olvidar = findViewById(R.id.olvide);
        lbl_olvidar.setTypeface(typ_opcionlogeo);

        btnLogin = findViewById(R.id.btnacceder);

        txt_usuario = (EditText) findViewById(R.id.txtusuario);
        txt_password = (EditText) findViewById(R.id.txtpassword);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");

        mainpresenter = new MainPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = txt_usuario.getText().toString().trim();
                String password = txt_password.getText().toString().trim();
                mainpresenter.VerifyLogin("VerificarUsuario", usuario, password);
            }
        });

    }


    @Override
    public void showProgress() {
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.hide();
    }

    @Override
    public void onRequestSuccess(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        setResult(RESULT_OK);

        Intent AbrirPrincipal = new Intent(MainActivity.this,PrincipalActivity.class);
        startActivity(AbrirPrincipal);
        finish();
    }

    @Override
    public void onRequestError(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
