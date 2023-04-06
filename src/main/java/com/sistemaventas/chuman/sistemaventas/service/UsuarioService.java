package com.sistemaventas.chuman.sistemaventas.service;

import com.sistemaventas.chuman.sistemaventas.dto.UsuarioDto;
import com.sistemaventas.chuman.sistemaventas.dto.UsuarioFilter;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsuarioService {
  UsuarioDto findById(Long id);

  Page<UsuarioDto> findAllPaginated(Pageable page, UsuarioFilter filter);

  List<UsuarioDto> findAll(UsuarioFilter filter);

  Long save(UsuarioDto usuarioDto);

  void delete(Long id);

}
