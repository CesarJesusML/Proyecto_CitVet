package com.citvet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.citvet.repository.IClienteRepository;
import com.citvet.repository.IEspecieRepository;
import com.citvet.repository.IMascotaRepository;
import com.citvet.repository.IRazaRepository;

@Controller
public class MascotaController {
	
	@Autowired
	private IMascotaRepository masc;
	
	@Autowired
	private IClienteRepository clie;
	
	@Autowired
	private IEspecieRepository espe;
	
	@Autowired
	private IRazaRepository raza;
	

	@GetMapping("/mascota-listado")
	public String listadoMascota(Model model) {
		model.addAttribute("content", "mascota-listado");
		model.addAttribute("lstMascotas", masc.findAll());
		return "layout";
	}
	
	
	
	
}

	