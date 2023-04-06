package com.sistemaventas.chuman.sistemaventas.controller;

import com.sistemaventas.chuman.sistemaventas.dto.UsuarioDto;
import com.sistemaventas.chuman.sistemaventas.dto.UsuarioFilter;
import com.sistemaventas.chuman.sistemaventas.exceptions.RecursoNoExisteException;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaventas.chuman.sistemaventas.service.UsuarioService;


@CrossOrigin
@RestController
@RequestMapping(value = "/api/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> findAll(UsuarioFilter filter){
        List<UsuarioDto> usuario = service.findAll(filter);
        return ResponseEntity.ok(usuario);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto> getById(@PathVariable() Long id) {
        UsuarioDto usuario = null;
        if (id != null) {
            usuario = service.findById(id);
            if (usuario == null) {
                throw new RecursoNoExisteException(
                    String.format("Usuario con identificador '%s' no encontrado", id));
            }
        }
        return ResponseEntity.ok(usuario);
    }
}
