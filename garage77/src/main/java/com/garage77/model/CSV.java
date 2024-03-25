package com.garage77.model;

import lombok.Data;

@Data
public class CSV {
    
    //Cliente
    private int idCliente;
    private String nombreCliente;
    private String telefonoCliente;
    private String dniCliente;
    //Vehiculo
    private String placa;
    private int añoVehiculo;
    private double kmActual;
    private double kmAprox;
    private String marca;
    private String modelo;

    //Servicio
    private int servicioId;
    private String servicioHoraRecep;
    private String servicioHoraEntrega;
    private double servicioTotal;

    //InsumoVehiculo
    private int insumoVehiculoId;
    //Insumo
    private int insumoId;
    private String insumoDescripcion;
    private double insumoPrecio;
    
	@Override
	public String toString() {
		return "CSV [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", telefonoCliente="
				+ telefonoCliente + ", dniCliente=" + dniCliente + ", placa=" + placa + ", añoVehiculo=" + añoVehiculo
				+ ", kmActual=" + kmActual + ", kmAprox=" + kmAprox + ", marca=" + marca + ", modelo=" + modelo
				+ ", servicioId=" + servicioId + ", servicioHoraRecep=" + servicioHoraRecep + ", servicioHoraEntrega="
				+ servicioHoraEntrega + ", servicioTotal=" + servicioTotal + ", insumoVehiculoId=" + insumoVehiculoId
				+ ", insumoId=" + insumoId + ", insumoDescripcion=" + insumoDescripcion + ", insumoPrecio="
				+ insumoPrecio + "]";
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
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

	public int getServicioId() {
		return servicioId;
	}

	public void setServicioId(int servicioId) {
		this.servicioId = servicioId;
	}

	public String getServicioHoraRecep() {
		return servicioHoraRecep;
	}

	public void setServicioHoraRecep(String servicioHoraRecep) {
		this.servicioHoraRecep = servicioHoraRecep;
	}

	public String getServicioHoraEntrega() {
		return servicioHoraEntrega;
	}

	public void setServicioHoraEntrega(String servicioHoraEntrega) {
		this.servicioHoraEntrega = servicioHoraEntrega;
	}

	public double getServicioTotal() {
		return servicioTotal;
	}

	public void setServicioTotal(double servicioTotal) {
		this.servicioTotal = servicioTotal;
	}

	public int getInsumoVehiculoId() {
		return insumoVehiculoId;
	}

	public void setInsumoVehiculoId(int insumoVehiculoId) {
		this.insumoVehiculoId = insumoVehiculoId;
	}

	public int getInsumoId() {
		return insumoId;
	}

	public void setInsumoId(int insumoId) {
		this.insumoId = insumoId;
	}

	public String getInsumoDescripcion() {
		return insumoDescripcion;
	}

	public void setInsumoDescripcion(String insumoDescripcion) {
		this.insumoDescripcion = insumoDescripcion;
	}

	public double getInsumoPrecio() {
		return insumoPrecio;
	}

	public void setInsumoPrecio(double insumoPrecio) {
		this.insumoPrecio = insumoPrecio;
	}
    
    
    
    
}

	

