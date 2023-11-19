package com.citvet.controller;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.citvet.model.Cita;
import com.citvet.model.Cliente;
import com.citvet.model.Mascota;
import com.citvet.model.Pago;
import com.citvet.model.Servicio;
import com.citvet.model.Veterinario;
import com.citvet.repository.ICitaRepository;
import com.citvet.repository.IClienteRepository;
import com.citvet.repository.IMascotaRepository;
import com.citvet.repository.IPagoRepository;
import com.citvet.repository.IServicioRepository;
import com.citvet.repository.IVeterinarioRepository;

@Controller
public class TransaccionController {

	@Autowired
	ICitaRepository c;
	
	@Autowired
	IPagoRepository p;
	
	@Autowired
	IClienteRepository cli;
	
	@Autowired 
	IMascotaRepository m;
	
	@Autowired
	IServicioRepository s;
	
	@Autowired
	IVeterinarioRepository v;
	
	@GetMapping("/citas")
	public String cargarpag(Model model) {
		Cita cita = new Cita();
		model.addAttribute("cita",cita);
		model.addAttribute("listClientes",cli.findAll());
		model.addAttribute("listMascotas", m.findAll());
		model.addAttribute("listVet",v.findAll());
		model.addAttribute("listServ",s.findAll());
		
	
		return "citas";
	}
	
	@GetMapping("/listMascotas")
	  public ResponseEntity<List<String>> listMascotas(@RequestParam("cod_cliente") Integer codCliente) {
        List<Mascota> mascotas = m.nombredemascota(codCliente);
        List<String> nombresMascotas = mascotas.stream().map(Mascota::getNombre_mascota).collect(Collectors.toList());
        return ResponseEntity.ok(nombresMascotas);
    }
		
	@GetMapping("/ListadocodNombres")
	public ResponseEntity<List<Object[]>> listcodnom(@RequestParam("cod_cliente") Integer codCliente) {
	    List<Object[]> codigosYnombres = m.codigosYnombresDeMascotas(codCliente);
	    return ResponseEntity.ok(codigosYnombres);
	}
	
	
	@PostMapping("/savecita")
	public String registrarCita(@ModelAttribute Cita cita,@RequestParam("mascota.codMascota") Integer codMascota){    
		 Mascota mascota = m.findByCodMascota(codMascota);
		    cita.setMascota(mascota);
		
		c.save(cita);
		System.out.println("Se grabo correctamente");
		   
	    return "redirect:/citas";
	}
	
	@GetMapping("/vercita")
	public String vercita(Model model) {
		

		model.addAttribute("listPagos",p.findAll());
		model.addAttribute("listCitas",c.findAll());
		return "vercita";
		
	}
	
	@PostMapping("/SavePago")
	public String pago(@ModelAttribute Pago pago,@RequestParam("codigocita") int codigo,RedirectAttributes attribute) {
		
		Cita codcita = c.findByCodCita(codigo);
		Integer busca = p.buscar(codigo);
		
		if(busca!=null) {
			attribute.addFlashAttribute("sucess","El Pago YA Esta REGISTRADO " );
		}else {
		pago.setCita(codcita);
		p.save(pago);
		}
		return "redirect:/vercita";
	}
}
