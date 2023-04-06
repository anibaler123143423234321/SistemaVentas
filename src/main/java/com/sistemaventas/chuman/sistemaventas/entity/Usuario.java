package com.sistemaventas.chuman.sistemaventas.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String U_ESTADO = "estado";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user", nullable = false, length = 15)
    private String user;
    @Column(name = "clave", nullable = false, length = 15)
    private String clave;
    @Column(name = "estado", nullable = false)
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
