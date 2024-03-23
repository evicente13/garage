package com.garage77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.garage77.model.Vehiculo;

public interface IVehiculoRepository extends JpaRepository <Vehiculo, String>

{
    
}
