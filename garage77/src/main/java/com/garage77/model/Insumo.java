package com.garage77.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_insumo")
@Data
public class Insumo
{

    @Id
    @Column (name = "insumo_id")
    private int insumoId;
    @Column (name = "insumo_descripcion")
    private String insumoDescripcion;
    @Column (name = "insumo_precio")
    private double insumoPrecio;
    
}