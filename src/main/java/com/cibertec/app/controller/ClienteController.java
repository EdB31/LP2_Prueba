package com.cibertec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.app.models.Alumno;
import com.cibertec.app.service.IAlumnoService;


@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping("/inicio")
	public String inicio() {
		return "cliente/inicio";
	}
	
	@GetMapping("/crear")
	public String crear() {
		return "cliente/crear";
	}
}
