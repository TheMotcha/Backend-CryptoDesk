package com.cryptodesk.cryptodesk.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private int id_User;
    private String nombre_Usuario; //El nombre
    private String apellido_Usuario; //El apellido
    private String tag_Usuario; //El nombre de usuario en el sistema (Credenciales)
    private String password_Usuario;
    private String creacion_Usuario;//Fecha de creacion

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getApellido_Usuario() {
        return apellido_Usuario;
    }

    public void setApellido_Usuario(String apellido_Usuario) {
        this.apellido_Usuario = apellido_Usuario;
    }

    public String getTag_Usuario() {
        return tag_Usuario;
    }

    public void setTag_Usuario(String tag_Usuario) {
        this.tag_Usuario = tag_Usuario;
    }

    public String getPassword_Usuario() {
        return password_Usuario;
    }

    public void setPassword_Usuario(String password_Usuario) {
        this.password_Usuario = password_Usuario;
    }

    public String getCreacion_Usuario() {
        return creacion_Usuario;
    }

    public void setCreacion_Usuario(String creacion_Usuario) {
        this.creacion_Usuario = creacion_Usuario;
    }
}
