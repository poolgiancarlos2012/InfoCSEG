package com.example.poolpg.infocseg.api.MySQL;

import com.example.poolpg.infocseg.model.Usuario;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterfaceMySQL {

    @FormUrlEncoded
    @POST("Usuario.php")
    Call<Usuario> SendAccess(
            @Field("accion") String accion,
            @Field("usuario") String usuario,
            @Field("password") String password
    );

}
