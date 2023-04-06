package com.sistemaventas.chuman.sistemaventas.dto;

import java.io.Serializable;

public class UsuarioDto implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;
    private String user;
    private boolean estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
