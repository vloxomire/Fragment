package com.max.fragmento.Models;

public class Autos {
    private Integer id;
    private String marca;
    private String modelo;
    private String nombre;
    private Integer anio;

    public Autos(Integer id, String marca, String modelo, String nombre, Integer anio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
