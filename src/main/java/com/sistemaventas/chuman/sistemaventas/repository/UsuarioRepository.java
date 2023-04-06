package com.sistemaventas.chuman.sistemaventas.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Optional<Usuario> findByUser(String user);
}
