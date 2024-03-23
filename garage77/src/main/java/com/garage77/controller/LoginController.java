package com.garage77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garage77.model.Admin;
import com.garage77.repository.UserRepository;

public class LoginController
{
	
	@Autowired
	private UserRepository repoUse;
	
	@PostMapping("/Login")
	public String logeoAdmin(@ModelAttribute Admin admin, @RequestParam(value = "action", required = false) String action, Model model)
	{
        if ("logear".equals(action))
        {

        	System.out.print(admin.getAdminUsu());
        	System.out.print(admin.getAdminContra());
        }
		return "/Login";
	}
}
