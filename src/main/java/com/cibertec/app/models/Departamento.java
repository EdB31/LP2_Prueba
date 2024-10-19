package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departamento;
	
	@Column(name="departament_name", length = 30, nullable = false)
	private String departament_name;
	
	@Column(name="aaaa", length = 30, nullable = false)
	private String aaaa;
	
	public Departamento() {
		
	}

	public Departamento(int departamento, String departament_name, String aaaa) {
		super();
		this.departamento = departamento;
		this.departament_name = departament_name;
		this.aaaa = aaaa;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public String getDepartament_name() {
		return departament_name;
	}

	public void setDepartament_name(String departament_name) {
		this.departament_name = departament_name;
	}

	public String getAaaa() {
		return aaaa;
	}

	public void setAaaa(String aaaa) {
		this.aaaa = aaaa;
	}
	
	
}
