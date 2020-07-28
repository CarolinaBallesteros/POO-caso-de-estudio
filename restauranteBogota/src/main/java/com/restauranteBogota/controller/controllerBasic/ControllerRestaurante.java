package com.restauranteBogota.controller.controllerBasic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restauranteBogota.dominio.servicio.CancelarReservaServicio;
import com.restauranteBogota.dominio.servicio.ConsultarReservaServicio;
import com.restauranteBogota.dominio.servicio.CrearReservaServicio;
import com.restauranteBogota.dominio.servicio.ModificarReservaServicio;
import com.restauranteBogota.modelo.Post;
import com.restauranteBogota.persistencia.entidad.Reserva;

@Controller
@RequestMapping("/restauranteBogota")
public class ControllerRestaurante {
	
	@Autowired
	CancelarReservaServicio cancelarReservaServicio;
	@Autowired
	ConsultarReservaServicio consultarReservaServicio;
	@Autowired
	CrearReservaServicio crearReservaServicio;
	@Autowired
	ModificarReservaServicio modificarReservaServicio;
	
	
	public List<Post> getPosts(){

		List<Post> post = new ArrayList<>();
		
		post.add(new Post(1,"El precio indicado en la carta es una referencia del valor promedio del restaurante consumiendo una entrada, un plato fuerte y un postre.","http://localhost:8080/img/img1.jpg", new Date(),"Comedor"));
		post.add(new Post(2,"El precio indicado en la carta es una referencia del valor promedio del restaurante consumiendo una entrada, un plato fuerte y un postre.","http://localhost:8080/img/img2.jpg", new Date(),"Cocina"));
		post.add(new Post(3,"El precio indicado en la carta es una referencia del valor promedio del restaurante consumiendo una entrada, un plato fuerte y un postre.","http://localhost:8080/img/img3.jpg", new Date(),"Bar"));
		post.add(new Post(3,"El precio indicado en la carta es una referencia del valor promedio del restaurante consumiendo una entrada, un plato fuerte y un postre.","http://localhost:8080/img/img4.jpg", new Date(),"Salon"));
		return post;
	}
	
	@GetMapping
	public String restauranteBogota(Model model) {
		model.addAttribute("posts", this.getPosts());		
		return "index";
	}
	
	
	@RequestMapping(path= {"/reservas"})
	public String consultarReservaServicio(Model model) {
		
		List<Reserva> list = consultarReservaServicio.consultarReservaServicio();
		model.addAttribute("cliente", list);
		return "lista-de-reserva";
	}
	
	
	@RequestMapping(path = {"/modificar","/modificar/{id}"})
	public String modificarReservaServicio(Model model, @PathVariable("id") Optional<Long> id) throws Exception{
		
		if(id.isPresent()) {
			Reserva reserva = modificarReservaServicio.modificarReservaServicio(id.get());
			model.addAttribute("cliente", reserva);
		}else {
			model.addAttribute("cliente", new Reserva());
		}
		return "modificar-reserva";
	}
	
	@RequestMapping(path = "/cancelar/{id}")
	public String cancelarReservaServicio(Model model, @PathVariable("id") Long id) throws Exception{
		
		cancelarReservaServicio.cancelarReservaServicio(id);
		return "redirect:/restauranteBogota/reservas";
	}
	
	@RequestMapping(path = "/crearReserva", method = RequestMethod.POST)
	public String crearReservaServicio(Reserva reserva) {
		crearReservaServicio.crearReservaServicio(reserva);
		return "redirect:/restauranteBogota/reservas";
	}
	
}
