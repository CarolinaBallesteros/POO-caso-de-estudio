package com.restauranteBogota.persistencia.respositorio;


import org.springframework.data.jpa.repository.JpaRepository;


//import com.restauranteBogota.dominio.dto.ReservaDto;
import com.restauranteBogota.persistencia.entidad.Reserva;

public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {

	//public Reserva findByNumeroDocumento(int numeroDocumento);

	/*public static ReservaRepositorio getUnicaInstancia() {
		if (unicaInstancia == null) {
			unicaInstancia = new ReservaRepositorio();
		}
		return unicaInstancia;
	}

	@Override
	public void modificar(Reserva reservaModificar) throws Exception {
		Reserva reservaEncontrada = obtenerPorNumeroDocumento(reservaModificar.getNumeroDocumento());
		
		reservaEncontrada.setFechaReserva(reservaModificar.getFechaReserva());
		reservaEncontrada.setCantidadPersonas(reservaModificar.getCantidadPersonas());
		reservaEncontrada.setMotivo(reservaModificar.getMotivo());
		reservaEncontrada.setTipoDecoracion(reservaModificar.getTipoDecoracion());
	}

	public ReservaDto obtenerPorNumeroDocumento(String numeroDocumento);
	*/
}
