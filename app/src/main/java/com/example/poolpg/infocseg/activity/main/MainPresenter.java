package com.example.poolpg.infocseg.activity.main;

import android.support.annotation.NonNull;

import com.example.poolpg.infocseg.api.MySQL.ApiClientMySQL;
import com.example.poolpg.infocseg.api.MySQL.ApiInterfaceMySQL;
import com.example.poolpg.infocseg.model.Usuario;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {

    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    void VerifyLogin(final String accion,final String usuario,final String password) {
        view.showProgress();

        ApiInterfaceMySQL apiInterface = ApiClientMySQL.getApiClient().create(ApiInterfaceMySQL.class);
        Call<Usuario> call = apiInterface.SendAccess(accion,usuario,password);

        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(@NonNull Call<Usuario> call, @NonNull Response<Usuario> response) {
                //progressDialog.dismiss();
                view.hideProgress();

                if (response.isSuccessful() && response.body() != null){
                    Boolean success = response.body().getSuccess();

                    if (success){
                        view.onRequestSuccess(response.body().getDni());
                    } else {
                        view.onRequestError(response.body().getMessage());
                    }

                }

            }
            @Override
            public void onFailure(@NonNull Call<Usuario> call,@NonNull Throwable t) {
                view.hideProgress();
                view.onRequestError(t.getLocalizedMessage());
            }
        });

    }

}
