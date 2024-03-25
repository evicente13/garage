package com.garage77.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_vehiculo")
@Data

public class Vehiculo 

{
    @Id
    @Column (name = "vehiculo_placa")
    private String placa;
    @Column (name = "vehiculo_año")
    private int añoVehiculo;
    @Column (name = "vehiculo_km_actual")
    private double kmActual;
    @Column (name = "vehiculo_km_aprox")
    private double kmAprox;
    @Column (name = "vehiculo_marca")
    private String marca;
    @Column (name = "vehiculo_modelo")
    private String modelo;
    @Column(name = "cliente_id")
    private int clienteId;
    
	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", añoVehiculo=" + añoVehiculo + ", kmActual=" + kmActual + ", kmAprox="
				+ kmAprox + ", marca=" + marca + ", modelo=" + modelo + ", clienteId=" + clienteId + "]";
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAñoVehiculo() {
		return añoVehiculo;
	}

	public void setAñoVehiculo(int añoVehiculo) {
		this.añoVehiculo = añoVehiculo;
	}

	public double getKmActual() {
		return kmActual;
	}

	public void setKmActual(double kmActual) {
		this.kmActual = kmActual;
	}

	public double getKmAprox() {
		return kmAprox;
	}

	public void setKmAprox(double kmAprox) {
		this.kmAprox = kmAprox;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
    
    
    
}
