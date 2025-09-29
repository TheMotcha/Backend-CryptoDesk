package com.cryptodesk.cryptodesk.Entity;

public class Archivo {

    private int id_Archivo;
    private String nom_Archivo;
    private String tipo_Archivo;
    private double size_Archivo;
    private String ruta_Archivo;
    private Usuario usuario_Owner;
    private String fecha_Archivo;

    public int getId_Archivo() {
        return id_Archivo;
    }

    public void setId_Archivo(int id_Archivo) {
        this.id_Archivo = id_Archivo;
    }

    public String getNom_Archivo() {
        return nom_Archivo;
    }

    public void setNom_Archivo(String nom_Archivo) {
        this.nom_Archivo = nom_Archivo;
    }

    public String getTipo_Archivo() {
        return tipo_Archivo;
    }

    public void setTipo_Archivo(String tipo_Archivo) {
        this.tipo_Archivo = tipo_Archivo;
    }

    public double getSize_Archivo() {
        return size_Archivo;
    }

    public void setSize_Archivo(double size_Archivo) {
        this.size_Archivo = size_Archivo;
    }

    public String getRuta_Archivo() {
        return ruta_Archivo;
    }

    public void setRuta_Archivo(String ruta_Archivo) {
        this.ruta_Archivo = ruta_Archivo;
    }

    public Usuario getUsuario_Owner() {
        return usuario_Owner;
    }

    public void setUsuario_Owner(Usuario usuario_Owner) {
        this.usuario_Owner = usuario_Owner;
    }

    public String getFecha_Archivo() {
        return fecha_Archivo;
    }

    public void setFecha_Archivo(String fecha_Archivo) {
        this.fecha_Archivo = fecha_Archivo;
    }
}
