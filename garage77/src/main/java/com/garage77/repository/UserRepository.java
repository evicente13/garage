package com.garage77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garage77.model.Admin;

public interface UserRepository extends JpaRepository <Admin, String>

{
	@Query("select u from Admin u where u.adminUsu = ?1 and u.adminContra = ?2")
	Admin findByAdminUsu(String adminUsu, String adminContra);
}