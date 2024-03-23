package com.garage77.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_servicio")
@Data
public class Servicio

{
    
    @Id
    @Column(name = "servicio_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int servicioId;

    @Column (name = "servicio_fecha_hora_recep")
    //DateTime
    private LocalDateTime servicioHoraRecep;
    @Column (name = "servicio_fecha_hora_entrega")
    //DateTime
    private LocalDateTime servicioHoraEntrega;
    @Column (name = "servicio_total")
    private double servicioTotal;
}
