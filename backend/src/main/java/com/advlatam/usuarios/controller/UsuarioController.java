package com.advlatam.usuarios.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.advlatam.usuarios.model.Usuario;
import com.advlatam.usuarios.repository.UsuariosRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuariosRepository repository;

	// considerar mapear a POST
	@RequestMapping(value = "/{cedula}")
	public ResponseEntity<?> getById(@PathVariable final String cedula) {
		Usuario usuarioEncontrado = repository.findOne(cedula);
		if (usuarioEncontrado != null) {
			return new ResponseEntity<Usuario>(usuarioEncontrado, HttpStatus.OK);
		} else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		// return repository.findByCedula(cedula);
	}

	@PostMapping(value = "/")
	public ResponseEntity<?> saveUsuario(@RequestBody Usuario inputUsuario) {
		if (repository.findOne(inputUsuario.getCedula()) == null) {
			Usuario nuevoUsuario = repository.save(new Usuario(inputUsuario.getCedula(), inputUsuario.getPrimerNombre(),
					inputUsuario.getSegundoNombre(), inputUsuario.getPrimerApellido(),
					inputUsuario.getSegundoApellido(), inputUsuario.getEstadoCivil(), inputUsuario.getDireccion1(),
					inputUsuario.getDireccion2(), inputUsuario.getTelefono(), inputUsuario.getEmail()));
			//TODO retornar exito y url
			URI location = ServletUriComponentsBuilder
					.fromCurrentRequest().path("/{id}")
					.buildAndExpand(nuevoUsuario.getCedula()).toUri();

			return new ResponseEntity<>(ResponseEntity.created(location).build(), HttpStatus.OK);
		} else return new ResponseEntity<>("Ya existe un usuario con ese número de cédula", HttpStatus.BAD_REQUEST);
	}

}
