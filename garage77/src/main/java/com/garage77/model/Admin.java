package com.garage77.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "tb_admin")
public class Admin 

{
	
	@Id
	@Column (name = "admin_usuario")
	private String adminUsu;
	@Column (name = "admin_contrasena")
	private String adminContra;
	@Column (name = "admin_nombre")
	private String adminNombre;
	@Column (name = "admin_apellido")
	private String adminApellido;
	
	
	public String getAdminUsu() {
		return adminUsu;
	}
	public void setAdminUsu(String adminUsu) {
		this.adminUsu = adminUsu;
	}
	public String getAdminContra() {
		return adminContra;
	}
	public void setAdminContra(String adminContra) {
		this.adminContra = adminContra;
	}
	public String getAdminNombre() {
		return adminNombre;
	}
	public void setAdminNombre(String adminNombre) {
		this.adminNombre = adminNombre;
	}
	public String getAdminApellido() {
		return adminApellido;
	}
	public void setAdminApellido(String adminApellido) {
		this.adminApellido = adminApellido;
	}
	
	
	

}
