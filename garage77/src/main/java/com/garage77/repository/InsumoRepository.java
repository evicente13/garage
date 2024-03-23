package com.garage77.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage77.model.Insumo;

public interface InsumoRepository extends JpaRepository<Insumo, Integer>

{

}
