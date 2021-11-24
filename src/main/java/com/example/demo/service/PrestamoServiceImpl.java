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
        
        Date fechaActual = new Date();
        SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = fechaFormateada.format(fechaActual);
        
        Date fechaActualFormateada = null;
        
        
        try {
            fechaActualFormateada = fechaFormateada.parse(fechaTexto);
        } catch (Exception ex) {
            
        }

        return fechaActualFormateada;

    }

    @Override
    public Boolean validarFecha(Date fecha) {
        Date fechaActual = obtenerFecha();
        if (fechaActual.before(fecha)) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean validarStockLibro(Prestamo prestamo) {
        Integer stock = prestamo.getLibro().getEjemplaresRestantes();
        
        if (stock >= 1) {
            return true;
        } else {
         return false;   
        }
    }

    
    
}
