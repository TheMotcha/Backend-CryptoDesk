package com.cryptodesk.cryptodesk.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Archivo {
    @Id
    private int idArchivo;
    private String nomArchivo;
    private String tipoArchivo;
    private double sizeArchivo;
    private String rutaArchivo;
    private String fechaArchivo;

    @ManyToOne
    private Usuario usuarioOwner;


    public int getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
    }

    public String getNomArchivo() {
        return nomArchivo;
    }

    public void setNomArchivo(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public double getSizeArchivo() {
        return sizeArchivo;
    }

    public void setSizeArchivo(double sizeArchivo) {
        this.sizeArchivo = sizeArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public Usuario getUsuarioOwner() {
        return usuarioOwner;
    }

    public void setUsuarioOwner(Usuario usuarioOwner) {
        this.usuarioOwner = usuarioOwner;
    }

    public String getFechaArchivo() {
        return fechaArchivo;
    }

    public void setFechaArchivo(String fechaArchivo) {
        this.fechaArchivo = fechaArchivo;
    }
}
