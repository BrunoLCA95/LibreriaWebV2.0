package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    @Autowired
    private PrestamoService prestamoService;

    @Override
    public CrudRepository<Prestamo, String> getDao() {
        return prestamoRepository;
    }

    @Override
    public Boolean validarId(Prestamo prestamo) {
        for (Prestamo prestamo2 : prestamoService.getAll()) {
            if (prestamo.getId().equals(prestamo2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Date obtenerFecha() {
        SimpleDateFormat fechaI = new SimpleDateFormat("dd/MM/YYYY");    
        String fechaFormateada = fechaI.format(new Date());
        Date fechaFinal = null;
        try {
            fechaFinal = fechaI.parse(fechaFormateada);
        } catch (Exception e) {

        }
        return fechaFinal;
    }

    @Override
    public Boolean validarFecha(Date fecha) {
        Date fechaActual = obtenerFecha();
        if (fechaActual.before(fecha)) {
            return true;
        }
        return false;
    }
    
}
