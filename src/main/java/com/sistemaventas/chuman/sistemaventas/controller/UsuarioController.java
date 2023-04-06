package com.sistemaventas.chuman.sistemaventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaventas.chuman.sistemaventas.converters.UsuarioConverter;
import com.sistemaventas.chuman.sistemaventas.service.UsuarioService;


@RestController
@RequestMapping("/v1/")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    private UsuarioConverter converter=new UsuarioConverter();

}
