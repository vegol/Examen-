package com.vexamen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vexamen.entity.HuCatMoneda;
import com.vexamen.implement.HuCatMonedaImplement;
import com.vexamen.request.HuCatMonedaRequest;

@RestController
@RequestMapping("moneda/")
public class HuCatMonedaController {

	@Autowired
	HuCatMonedaImplement service;

	@GetMapping
	public ResponseEntity<List<HuCatMoneda>> mostrar() {
		List<HuCatMoneda> items = service.mostrarTodos();
		if (items.size() > 0) {
			return new ResponseEntity<List<HuCatMoneda>>(items, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<HuCatMoneda>>(items, HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping("buscar-por-clave/{clave}")
	public ResponseEntity<HuCatMoneda> buscar(@PathVariable("clave") String clave) {
		Optional<HuCatMoneda> item = service.buscar(clave);
		if (item.isPresent()) {
			return new ResponseEntity<HuCatMoneda>(item.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

		}
	}

	@PostMapping
	public ResponseEntity<HuCatMoneda> guardar(@RequestBody HuCatMonedaRequest request) {
		HuCatMoneda item = service.guardar(request);
		if (item != null) {
			return new ResponseEntity<HuCatMoneda>(item, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping
	public ResponseEntity<HuCatMoneda> editar(@RequestBody HuCatMonedaRequest request){
		HuCatMoneda item = service.guardar(request);		
		if(item!=null) {
			return new ResponseEntity<HuCatMoneda>(item, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}				
	} 
	
	@DeleteMapping("borrar/{clave}")
	public ResponseEntity<String> eliminar(@PathVariable("clave")String clave){
		String mensaje = service.eliminar(clave);
		if(mensaje != null) {
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	

}
