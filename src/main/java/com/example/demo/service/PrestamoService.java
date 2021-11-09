package com.example.demo.service;

import java.util.Date;

import com.example.demo.commons.GenericService;
import com.example.demo.entity.Prestamo;

public interface PrestamoService extends GenericService<Prestamo, String>{
    Boolean validarId(Prestamo prestamo);
    Date obtenerFecha();
    Boolean validarFecha(Date fecha);
}
