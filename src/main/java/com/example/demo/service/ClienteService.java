package com.example.demo.service;

import com.example.demo.commons.GenericService;
import com.example.demo.entity.Cliente;

public interface ClienteService extends GenericService<Cliente, String> {
    Boolean validarDni(Cliente cliente);
    Boolean validarId(Cliente cliente);
}
