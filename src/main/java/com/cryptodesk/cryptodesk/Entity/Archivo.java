package com.cryptodesk.cryptodesk.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Archivo {
    @Id
    private int idArchivo;
    private String nomArchivo;
    @Lob
    private String contenidoArchivo;
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

    public String getContenidoArchivo() {
        return contenidoArchivo;
    }

    public void setContenidoArchivo(String contenidoArchivo) {
        this.contenidoArchivo = contenidoArchivo;
    }
}
