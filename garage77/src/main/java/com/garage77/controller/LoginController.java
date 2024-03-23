package com.garage77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garage77.model.Admin;
import com.garage77.repository.UserRepository;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserRepository repoUse;

	@PostMapping("/valida")
	public String logeoAdmin(@ModelAttribute Admin admin,
			@RequestParam(value = "action", required = false) String action, Model model) {
		System.out.println("djfksjkfjksjfksjkfjdk");
		if ("logear".equals(action)) {

			System.out.print(admin.getAdminUsu());
			System.out.print(admin.getAdminContra());
		}
		return "Login";
	}
}
