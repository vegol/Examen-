package com.vexamen.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vexamen.entity.HuCatMoneda;
import com.vexamen.repository.HuCatMonedaRepository;
import com.vexamen.request.HuCatMonedaRequest;
import com.vexamen.service.HuCatMonedaService;

@Service
public class HuCatMonedaImplement implements HuCatMonedaService {

	@Autowired
	HuCatMonedaRepository dao;

	@Override
	public HuCatMoneda guardar(HuCatMonedaRequest request) {

		HuCatMoneda object = new HuCatMoneda();
		object.setClaveMoneda(request.getClaveMoneda());
		object.setAbreviacion(request.getAbreviacion());
		object.setDescripcion(request.getDescripcion());
		object.setMonedaCorriente(request.getMonedaCorriente());
		object.setNumCia(request.getNumCia());
		object.setSimbolo(request.getSimbolo());
		object.setStatus(request.getStatus());

		dao.save(object);

		return object;
	}

	@Override
	public HuCatMoneda actualizar(HuCatMonedaRequest request) {
		HuCatMoneda object = dao.findById(request.getClaveMoneda()).get();
		object.setAbreviacion(request.getAbreviacion());
		object.setDescripcion(request.getDescripcion());
		object.setMonedaCorriente(request.getMonedaCorriente());
		object.setNumCia(request.getNumCia());
		object.setSimbolo(request.getSimbolo());
		object.setStatus(request.getStatus());
		dao.save(object);
		return object;
	}

	@Override
	public Optional<HuCatMoneda> buscar(String clave) {
		return dao.findById(clave);
	}

	@Override
	public String eliminar(String clave) {
		dao.deleteById(clave);
		return "Eliminado";
	}

	@Override
	public List mostrarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
