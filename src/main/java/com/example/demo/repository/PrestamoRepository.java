package com.example.demo.repository;

import com.example.demo.entity.Prestamo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends CrudRepository<Prestamo, String>{
    
}
