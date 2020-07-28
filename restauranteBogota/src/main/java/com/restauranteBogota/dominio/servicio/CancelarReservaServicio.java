package com.restauranteBogota.dominio.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restauranteBogota.persistencia.entidad.Reserva;
import com.restauranteBogota.persistencia.respositorio.ReservaRepositorio;

@Service
public class CancelarReservaServicio {
	
	@Autowired
	ReservaRepositorio reservaRepositorio;
	
	public void cancelarReservaServicio(Long id) throws Exception {
		
		Optional<Reserva> cliente = reservaRepositorio.findById(id);
		
		if(cliente.isPresent()) {
			reservaRepositorio.deleteById(id);
		}else {
			throw new Exception("No existe reserva con el numero de documento dado");
		}
	}

}
