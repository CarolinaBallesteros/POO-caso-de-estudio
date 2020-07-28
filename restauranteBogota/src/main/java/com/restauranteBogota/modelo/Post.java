package com.restauranteBogota.modelo;

import java.util.Date;



public class Post {

	private int id;
	private String descripcion;
	private String url;
	private Date fecha;
	private String titulo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Post(int id, String descripcion, String url, Date fecha, String titulo) {
		
		this.id = id;
		this.descripcion = descripcion;
		this.url = url;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	public Post() {
		
	}
	
	
}
