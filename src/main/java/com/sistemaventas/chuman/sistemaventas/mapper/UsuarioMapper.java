package com.sistemaventas.chuman.sistemaventas.mapper;
import org.mapstruct.Mapper;

import com.sistemaventas.chuman.sistemaventas.dto.UsuarioDto;
import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
import com.sistemaventas.chuman.sistemaventas.mapperImpl.GenericMapper;
@Mapper(componentModel = "spring")
public interface UsuarioMapper extends GenericMapper<UsuarioDto, Usuario> {
  @Override
  UsuarioDto toDto(Usuario usuario);

  @Override
  Usuario toEntity(UsuarioDto usuarioDto);
}
