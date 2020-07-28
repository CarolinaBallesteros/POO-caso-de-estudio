package com.restauranteBogota.dominio.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class ReservaDto {

	private static final String AU_DATE_FORMAT = "yyyy-MM-dd";
	
	private int numeroDocumento;
	private String nombreCompletoCliente;
	private int numeroContacto;
	private String correo;
	
	
	@DateTimeFormat(pattern = AU_DATE_FORMAT)
	private Date fechaReserva;
	private String estado;
	private int cantidadPersonas;
	private String motivo;
	private String tipoDecoracion;

	public ReservaDto(int numeroDocumento, String nombreCompletoCliente, int numeroContacto, String correo,
			Date fechaReserva, String estado, int cantidadPersonas, String motivo, String tipoDecoracion) {
		this.numeroDocumento = numeroDocumento;
		this.nombreCompletoCliente = nombreCompletoCliente;
		this.numeroContacto = numeroContacto;
		this.correo = correo;
		this.fechaReserva = fechaReserva;
		this.estado = estado;
		this.cantidadPersonas = cantidadPersonas;
		this.motivo = motivo;
		this.tipoDecoracion = tipoDecoracion;
		
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}

	public int getNumeroContacto() {
		return numeroContacto;
	}

	public String getCorreo() {
		return correo;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public String getEstado() {
		return estado;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public String getMotivo() {
		return motivo;
	}

	public String getTipoDecoracion() {
		return tipoDecoracion;
	}
}
