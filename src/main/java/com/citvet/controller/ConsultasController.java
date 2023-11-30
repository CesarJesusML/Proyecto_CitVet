package com.citvet.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.citvet.model.Cita;
import com.citvet.model.Pago;
import com.citvet.model.Veterinario;
import com.citvet.repository.ICitaRepository;
import com.citvet.repository.IPagoRepository;
import com.citvet.repository.IVeterinarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@Controller
public class ConsultasController {

	@Autowired
	IPagoRepository p;
	
	@Autowired
	ICitaRepository c;

	@Autowired
	IVeterinarioRepository v;
	
	@GetMapping("/consultas")
	public String cargarpag(Model model) {
		List<Veterinario> listVet = v.findAll();
		model.addAttribute("listVet",listVet);
		
		return "consultascitas";
	}
	
	@GetMapping("/consulta1")
	public String listadodecitas(@RequestParam("codVeterinario")Integer codigo,
							@RequestParam("fecha_cita")@DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,Model model){
		
		List<Veterinario> listVet = v.findAll();
		
		
		List<Cita> cons = c.listConsulta(codigo, fecha);
		
		
	    for (Cita consulta : cons) {
	        System.out.println("Cliente : " + consulta.getCliente().getNombres());
	        System.out.println("Mascota : " + consulta.getMascota().getNombre_mascota());
	        System.out.println("fecha : " + consulta.getFecha_cita());
	        System.out.println("Hora : " + consulta.getHora_cita());
	        System.out.println("----");
	    }
	    
	    model.addAttribute("listadocons", cons);
	    model.addAttribute("listVet",listVet);
	 	
	    return "consultascitas";
	    	
		
	}
	
	
	@GetMapping("/consulta2")
	public String  listadostotal(Model model, @RequestParam("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha) {
	    
		List<Veterinario> listVet = v.findAll();
		
	    List<Object[]> cons2 = p.constotal(fecha);

	    for (Object[] resultado : cons2) {
	        Date fechaPago = (Date) resultado[0];
	        Double totalMonto = (Double) resultado[1];
	        
	        System.out.println("Fecha de Pago: " + fechaPago);
	        System.out.println("Total Monto: " + totalMonto);
	    }
	    
	    model.addAttribute("consultas", cons2);
	    model.addAttribute("listVet",listVet);
	    
	    return "consultascitas";
	}
	
	
}
