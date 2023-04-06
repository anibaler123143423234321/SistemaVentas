package com.sistemaventas.chuman.sistemaventas.specImpl;

import com.sistemaventas.chuman.sistemaventas.dto.UsuarioFilter;
import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
import com.sistemaventas.chuman.sistemaventas.spec.UsuarioSpec;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class UsuarioSpecImpl extends AbstractSpec implements UsuarioSpec {

  @Override
  public Specification<Usuario> filtrar(UsuarioFilter filter) {
    return ((root, query, cb) -> {
      List<Predicate> conditions = new ArrayList<>();
      if (filter.getVerInactivos() == null || filter.getVerInactivos().equals("NO")) {
        conditions.add(cb.equal(root.get(Usuario.U_ESTADO), 1));
      }
      return and(cb, conditions);
    });
  }
}
