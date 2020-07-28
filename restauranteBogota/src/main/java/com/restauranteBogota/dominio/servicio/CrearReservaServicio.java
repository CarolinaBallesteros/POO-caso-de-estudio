package com.restauranteBogota.dominio.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restauranteBogota.dominio.dto.ReservaDto;
import com.restauranteBogota.dominio.fabrica.ReservaFabrica;
import com.restauranteBogota.persistencia.entidad.Reserva;
import com.restauranteBogota.persistencia.respositorio.ReservaRepositorio;

@Service
public class CrearReservaServicio {
	
	@Autowired
	private ReservaFabrica reservaFabrica;
	
	@Autowired
	private ReservaRepositorio reservaRepositorio;
	
	public void ejecutar(ReservaDto reservaDto) throws Exception {
		Reserva reserva = reservaFabrica.ejecutar(reservaDto);
		reservaRepositorio.save(reserva);
	}
	
	public Reserva crearReservaServicio(Reserva reserva) {
		
		if(reserva.getId() == null) {
			reserva = reservaRepositorio.save(reserva);
			return reserva;
		}
		else {
			Optional<Reserva> cliente = reservaRepositorio.findById(reserva.getId());
			if(cliente.isPresent()) {
				Reserva reservaNew = cliente.get();
				reservaNew.setCantidadPersonas(reserva.getCantidadPersonas());
				reservaNew.setCorreo(reserva.getCorreo());
				reservaNew.setEstado(reserva.getEstado());
				reservaNew.setFechaReserva(reserva.getFechaReserva());
				reservaNew.setId(reserva.getId());
				reservaNew.setMotivo(reserva.getMotivo());
				reservaNew.setNombreCompletoCliente(reserva.getNombreCompletoCliente());
				reservaNew.setNumeroContacto(reserva.getNumeroContacto());
				reservaNew.setNumeroDocumento(reserva.getNumeroDocumento());
				reservaNew.setTipoDecoracion(reserva.getTipoDecoracion());
				
				reservaNew = reservaRepositorio.save(reservaNew);
				return reservaNew;
			}else {
				reserva = reservaRepositorio.save(reserva);
				return reserva;
			}
		}
	}

}
