package com.sistemaventas.chuman.sistemaventas.spec;

import com.sistemaventas.chuman.sistemaventas.dto.UsuarioFilter;
import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
import org.springframework.data.jpa.domain.Specification;

public interface UsuarioSpec {
  public Specification<Usuario> filtrar(UsuarioFilter filter);
}
