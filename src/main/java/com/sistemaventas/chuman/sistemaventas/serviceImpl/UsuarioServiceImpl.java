package com.sistemaventas.chuman.sistemaventas.serviceImpl;

import com.sistemaventas.chuman.sistemaventas.dto.UsuarioDto;
import com.sistemaventas.chuman.sistemaventas.dto.UsuarioFilter;
import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
import com.sistemaventas.chuman.sistemaventas.mapper.UsuarioMapper;
import com.sistemaventas.chuman.sistemaventas.repository.UsuarioRepository;
import com.sistemaventas.chuman.sistemaventas.service.UsuarioService;
import com.sistemaventas.chuman.sistemaventas.spec.UsuarioSpec;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true) //Significa que es solo lectura, si se desea persistir, entonces en el método usar @Transactional
public class UsuarioServiceImpl implements UsuarioService {

  private final UsuarioRepository repository;
  private final UsuarioMapper mapper;
  private final UsuarioSpec spec;

  public UsuarioServiceImpl(UsuarioRepository repository, UsuarioMapper mapper, UsuarioSpec spec) {
    this.repository = repository;
    this.mapper = mapper;
    this.spec = spec;
  }

  @Override
  public UsuarioDto findById(Long id) {
    return mapper.toDto(repository.findById(id));
  }

  @Override
  public Page<UsuarioDto> findAllPaginated(Pageable page, UsuarioFilter filter) {
    return null;
  }

  @Override
  public List<UsuarioDto> findAll(UsuarioFilter filter) {
    return null;
  }

  @Override
  @Transactional
  public Long save(UsuarioDto usuarioDto) {
    Usuario usuario = mapper.toEntity(usuarioDto);
    Usuario usuarioGuardado = repository.save(usuario);
    return usuarioGuardado.getId();
  }

  @Override
  @Transactional
  public void delete(Long id) {
    repository.deleteById(id);
  }
}