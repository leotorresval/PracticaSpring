package com.Practica1.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usr_rol")
public class UsrRol {

	@Id
	@Column(name="id_rol")
	private Long IdRol;
	
	@OneToMany(mappedBy = "usrRol")
	private List<UsrUsuario> listaUsuarios;
	
	private String nombre;
	
	public UsrRol(Long idRol, String nombre, String estado, String observacion) {
		super();
		IdRol = idRol;
		this.nombre = nombre;
		this.estado = estado;
		this.observacion = observacion;
	}

	public UsrRol() {
		super();
	}

	public Long getIdRol() {
		return IdRol;
	}

	public void setIdRol(Long idRol) {
		IdRol = idRol;
	}

	public List<UsrUsuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsrUsuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	private String estado;
	
	private String observacion;


	
	
}
