package com.sistemaventas.chuman.sistemaventas.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sistemaventas.chuman.sistemaventas.converters.UsuarioConverter;

import com.sistemaventas.chuman.sistemaventas.repository.UsuarioRepository;
import com.sistemaventas.chuman.sistemaventas.service.UsuarioService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    private UsuarioConverter converter=new UsuarioConverter();

    }
}