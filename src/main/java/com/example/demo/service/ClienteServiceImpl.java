package com.example.demo.service;

import com.example.demo.commons.GenericServiceImpl;
import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, String> implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteService clienteService;

    @Override
    public CrudRepository<Cliente, String> getDao() {
        return clienteRepository;
    }

    @Override
    public Boolean validarDni(Cliente cliente) {
        for (Cliente cliente2 : clienteService.getAll()) {
            if (cliente.getDocumento().equals(cliente2.getDocumento())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean validarId(Cliente cliente) {
        for (Cliente cliente2 : clienteService.getAll()) {
            if (cliente.getId().equals(cliente2.getId())) {
                return true;
            }
        }
        return false;
    }
    
}
