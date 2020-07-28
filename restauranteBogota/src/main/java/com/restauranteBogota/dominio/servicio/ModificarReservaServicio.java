package com.restauranteBogota.dominio.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restauranteBogota.persistencia.entidad.Reserva;
import com.restauranteBogota.persistencia.respositorio.ReservaRepositorio;

//import com.restauranteBogota.dominio.dto.ReservaDto;
//import com.restauranteBogota.dominio.fabrica.ReservaFabrica;
//import com.restauranteBogota.persistencia.entidad.Reserva;
//import com.restauranteBogota.persistencia.respositorio.ReservaRepositorio;

@Service
public class ModificarReservaServicio {
	
	@Autowired
	ReservaRepositorio reservaRepositorio;
	
	public Reserva modificarReservaServicio(Long id) throws Exception {
		Optional<Reserva> cliente = reservaRepositorio.findById(id); 
		
		if(cliente.isPresent()) {
			return cliente.get();
		}else {
			throw new Exception("No se ha modificado ninguna reserva por el cliente");
		}
		
	}
	
	/*private ReservaRepositorio reservaRepositorio = ReservaRepositorio.getUnicaInstancia();
	
	public void ejecutar(ReservaDto reservaDto) throws Exception{
		Reserva reserva = ReservaFabrica.convertirDtoEntidad(reservaDto);
		reservaRepositorio.modificar(reserva);
	}
*/
}
