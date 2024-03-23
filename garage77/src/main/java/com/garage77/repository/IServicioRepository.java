package com.garage77.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage77.model.Servicio;

public interface IServicioRepository extends JpaRepository <Servicio, Integer>
{
    
}