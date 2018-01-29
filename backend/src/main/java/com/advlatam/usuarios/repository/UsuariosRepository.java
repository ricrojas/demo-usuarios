package com.advlatam.usuarios.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.advlatam.usuarios.model.Usuario;

public interface UsuariosRepository extends CrudRepository<Usuario, String> {
	
	Usuario findByCedula(String cedula);

}
