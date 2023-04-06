package com.sistemaventas.chuman.sistemaventas.service;
import com.sistemaventas.chuman.sistemaventas.dto.LoginRequestDTO;
public interface UsuarioService {
    public Usuario create(Usuario usuario);
    public LoginResponseDTO login(LoginRequestDTO request);
    public String createToken(Usuario usuario) ;
    public boolean validateToken(String token);
    public String getUserFromToken(String jwt);
}
