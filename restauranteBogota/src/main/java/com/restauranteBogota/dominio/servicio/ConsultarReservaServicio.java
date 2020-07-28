package com.restauranteBogota.dominio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restauranteBogota.persistencia.entidad.Reserva;
import com.restauranteBogota.persistencia.respositorio.ReservaRepositorio;

//import com.restauranteBogota.dominio.dto.ReservaDto;
//import com.restauranteBogota.dominio.fabrica.ReservaFabrica;

@Service
public class ConsultarReservaServicio {
	@Autowired
	ReservaRepositorio reservaRepositorio; 
	
	public List<Reserva> consultarReservaServicio() {
		List<Reserva> result= reservaRepositorio.findAll();
		
		return result;
	}
	
	/*private ReservaRepositorio reservaRepositorio = ReservaRepositorio.getUnicaInstancia();
	
	public ReservaDto ejecutar(String numeroDocumento) throws Exception{
		return ReservaFabrica.convertirDtoEntidad(reservaRepositorio.obtenerPorNumeroDocumento(numeroDocumento));
	}
*/
	
}
