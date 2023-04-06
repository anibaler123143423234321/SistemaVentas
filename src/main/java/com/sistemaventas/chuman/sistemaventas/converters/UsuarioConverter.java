package com.vichayal.vichayalapirest.converters;

import com.vichayal.vichayalapirest.dtos.SignupRequestDTO;
import com.vichayal.vichayalapirest.dtos.UsuarioDTO;
import com.vichayal.vichayalapirest.entity.Usuario;

public class UsuarioConverter extends AbstractConverter<Usuario, UsuarioDTO> {

	@Override
	public UsuarioDTO fromEntity(Usuario entity) {
		if (entity==null) return null;
		return UsuarioDTO.builder()
				.id(entity.getId())
				.email(entity.getUser())
				.activo(entity.getActivo())
				.build();
	}

	@Override
	public Usuario fromDTO(UsuarioDTO dto) {
		if (dto==null) return null;
		return Usuario.builder()
				.id(dto.getId())
				.user(dto.getEmail())
				.activo(dto.getActivo())
				.build();
	}
	
	public Usuario signup(SignupRequestDTO dto) {
		return Usuario.builder()
				.user(dto.getUser())
				.password(dto.getPassword())
				.build();
	}
}
