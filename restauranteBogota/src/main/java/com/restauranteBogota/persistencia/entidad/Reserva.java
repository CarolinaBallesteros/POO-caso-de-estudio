package com.restauranteBogota.persistencia.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="RESTAURANTE_BOGOTA")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numero_documento")
	private int numeroDocumento;
	
	@Column(name="nombre_completo_cliente")
	private String nombreCompletoCliente;
	
	@Column(name="numero_contacto")
	private int numeroContacto;
	
	@Column(name="correo", nullable=false, length=200)
	private String correo;
	
	private static final String AU_DATE_FORMAT = "yyyy-MM-dd";
	@DateTimeFormat(pattern = AU_DATE_FORMAT)
	@Column(name="fecha_reserva")
	private Date fechaReserva;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="cantidad_personas")
	private int cantidadPersonas;
	
	@Column(name="motivo")
	private String motivo;
	
	@Column(name="tipo_decoracion")
	private String tipoDecoracion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}

	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}

	public int getNumeroContacto() {
		return numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getTipoDecoracion() {
		return tipoDecoracion;
	}

	public void setTipoDecoracion(String tipoDecoracion) {
		this.tipoDecoracion = tipoDecoracion;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", numeroDocumento=" + numeroDocumento + ", nombreCompletoCliente="
				+ nombreCompletoCliente + ", numeroContacto=" + numeroContacto + ", correo=" + correo
				+ ", fechaReserva=" + fechaReserva + ", estado=" + estado + ", cantidadPersonas=" + cantidadPersonas
				+ ", motivo=" + motivo + ", tipoDecoracion=" + tipoDecoracion + "]";
	}
	
	

}
