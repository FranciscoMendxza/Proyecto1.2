package Conversiones;

import com.google.gson.Gson;

import DTOs.Datos;

public class Conversion {
    private final Gson gson = new Gson();

    public String CJson(Datos datos){
        return gson.toJson(datos);
    }

    public Datos Cdto(String cadena){
        return gson.fromJson(cadena, Datos.class);
    }
}
