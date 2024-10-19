package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Mascotas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_mascota;
	
	@Column(name="nombre", length=45, nullable=false)
	private String nombre;
	
	@Column(name="raza", length=45, nullable=false)
	private String raza;
	
	@Column(name="genero", length=10, nullable=false)
	private String genero;
	
	@ManyToOne
	@JoinColumn(name="cedula")
	private Mascotas mascotas;
	
	public Mascotas() {
		
	}

	public Mascotas(Integer iD_mascota, String nombre, String raza, String genero, Mascotas mascotas) {
		super();
		ID_mascota = iD_mascota;
		this.nombre = nombre;
		this.raza = raza;
		this.genero = genero;
		this.mascotas = mascotas;
	}

	public Integer getID_mascota() {
		return ID_mascota;
	}

	public void setID_mascota(Integer iD_mascota) {
		ID_mascota = iD_mascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Mascotas getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascotas mascotas) {
		this.mascotas = mascotas;
	}
	
	
}
