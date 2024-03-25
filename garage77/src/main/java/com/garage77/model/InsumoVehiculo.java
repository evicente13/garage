package com.garage77.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "tb_insumo_vehiculo")
@Data
public class InsumoVehiculo 

{

    @Id
    @Column (name = "insumo_vehiculo_id")
    private int insumoVehiculoId;

    @Column (name = "vehiculo_placa")
    private String placa;

    @Column (name = "insumo_id")
    private int insumoId;

    @Column (name = "insumo_precio")
    private double insumoPrecio;

    @Column (name = "servicio_id")
    private int servicioId;

	@Override
	public String toString() {
		return "InsumoVehiculo [insumoVehiculoId=" + insumoVehiculoId + ", placa=" + placa + ", insumoId=" + insumoId
				+ ", insumoPrecio=" + insumoPrecio + ", servicioId=" + servicioId + "]";
	}

	public int getInsumoVehiculoId() {
		return insumoVehiculoId;
	}

	public void setInsumoVehiculoId(int insumoVehiculoId) {
		this.insumoVehiculoId = insumoVehiculoId;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getInsumoId() {
		return insumoId;
	}

	public void setInsumoId(int insumoId) {
		this.insumoId = insumoId;
	}

	public double getInsumoPrecio() {
		return insumoPrecio;
	}

	public void setInsumoPrecio(double insumoPrecio) {
		this.insumoPrecio = insumoPrecio;
	}

	public int getServicioId() {
		return servicioId;
	}

	public void setServicioId(int servicioId) {
		this.servicioId = servicioId;
	}  
    
    
    
}