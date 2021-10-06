package com.Practica1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Practica1.models.UsrUsuario;
import com.Practica1.repository.UsrUsuarioRepository;

public class UsrUsuarioService {
	
	@Autowired
	private UsrUsuarioRepository usrUsuarioRepository;

	public UsrUsuarioService(UsrUsuarioRepository usrUsuarioRepository) {
		super();
		this.usrUsuarioRepository = usrUsuarioRepository;
	}
	
	public List<UsrUsuario> obtenerTodosUsuario(){
		return (List<UsrUsuario>) usrUsuarioRepository.findAll();
	}
	
	public void ingresarNuevoUsuario(UsrUsuario objUsrUsuario) {
		usrUsuarioRepository.save(objUsrUsuario);
		
	}
	
	public void borrarUsuario(UsrUsuario objUsrUsuario) {
		usrUsuarioRepository.delete(objUsrUsuario);
	}
	
	public UsrUsuario actualizarUsuario(UsrUsuario objUsrUsuario) {
		return usrUsuarioRepository.save(objUsrUsuario);
	}

}
