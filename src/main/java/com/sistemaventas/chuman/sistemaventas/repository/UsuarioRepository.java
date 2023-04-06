package com.sistemaventas.chuman.sistemaventas.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario> {
  @Query("SELECT u FROM Usuario u WHERE u.id = :id")
  Usuario findById(@Param("id") Long id);
}
