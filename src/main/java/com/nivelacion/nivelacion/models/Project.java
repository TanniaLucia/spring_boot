package com.nivelacion.nivelacion.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Project {

    @Id
    private String id;

    private String nombre;
    private String estado;
    private String idUser;
    private Date fechaInicio;

    public Project(String id, String nombre, String estado, String idUser, Date fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.idUser = idUser;
        this.fechaInicio = fechaInicio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
