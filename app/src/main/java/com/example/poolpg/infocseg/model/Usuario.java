package com.example.poolpg.infocseg.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

    @Expose
    @SerializedName("idusuario") private int idusuario;

    @Expose
    @SerializedName("nombre") private String nombre;

    @Expose
    @SerializedName("paterno") private String paterno;

    @Expose
    @SerializedName("materno") private String materno;

    @Expose
    @SerializedName("usuario") private String usuario;

    @Expose
    @SerializedName("dni") private String dni;

    @Expose
    @SerializedName("success") private Boolean success;

    @Expose
    @SerializedName("message") private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
