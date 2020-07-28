package com.restauranteBogota.dominio.fabrica;

import org.springframework.stereotype.Component;

import com.restauranteBogota.dominio.dto.ReservaDto;
import com.restauranteBogota.persistencia.entidad.Reserva;

@Component
public class ReservaFabrica {

	public Reserva ejecutar(ReservaDto reservaDto) throws Exception {

		Reserva reserva = new Reserva();
		reserva.setNumeroContacto(reservaDto.getNumeroDocumento());
		reserva.setCantidadPersonas(reservaDto.getCantidadPersonas());
		reserva.setCorreo(reservaDto.getCorreo());
		reserva.setEstado(reservaDto.getEstado());
		reserva.setFechaReserva(reservaDto.getFechaReserva());
		reserva.setMotivo(reservaDto.getMotivo());
		reserva.setNombreCompletoCliente(reservaDto.getNombreCompletoCliente());
		reserva.setNumeroDocumento(reservaDto.getNumeroDocumento());
		reserva.setTipoDecoracion(reservaDto.getTipoDecoracion());
		return reserva;
	}

	public static Reserva convertirDtoEntidad(ReservaDto reservaDto) {
		
		Reserva reserva = new Reserva();
		reserva.setNumeroContacto(reservaDto.getNumeroContacto());
		reserva.setCantidadPersonas(reservaDto.getCantidadPersonas());
		reserva.setCorreo(reservaDto.getCorreo());
		reserva.setEstado(reservaDto.getEstado());
		reserva.setFechaReserva(reservaDto.getFechaReserva());
		reserva.setMotivo(reservaDto.getMotivo());
		reserva.setNombreCompletoCliente(reservaDto.getNombreCompletoCliente());
		reserva.setNumeroDocumento(reservaDto.getNumeroDocumento());
		reserva.setTipoDecoracion(reservaDto.getTipoDecoracion());
		return reserva;
	}
}
