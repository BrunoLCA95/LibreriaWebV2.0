package com.example.demo.service;

import com.example.demo.commons.GenericServiceImpl;
import com.example.demo.entity.Prestamo;
import com.example.demo.repository.PrestamoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PrestamoServiceImpl extends GenericServiceImpl<Prestamo, String> implements PrestamoService{

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public CrudRepository<Prestamo, String> getDao() {
        return prestamoRepository;
    }
    
}
