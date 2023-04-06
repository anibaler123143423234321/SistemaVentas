package com.sistemaventas.chuman.sistemaventas.dto;

import java.io.Serializable;

public class UsuarioFilter implements Serializable {
  private static final long serialVersionUID = -1L;

  private String verInactivos;

  public UsuarioFilter() {
    super();
  }

  public String getVerInactivos() {
    return verInactivos;
  }

  public void setVerInactivos(String verInactivos) {
    this.verInactivos = verInactivos;
  }
}
