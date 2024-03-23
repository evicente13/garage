package com.garage77.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage77.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>

{

}
