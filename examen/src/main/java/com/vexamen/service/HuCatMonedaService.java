package com.vexamen.service;

import java.util.List;
import java.util.Optional;

import com.vexamen.entity.HuCatMoneda;
import com.vexamen.request.HuCatMonedaRequest;

public interface HuCatMonedaService {
	
	HuCatMoneda guardar(HuCatMonedaRequest request);
	HuCatMoneda actualizar(HuCatMonedaRequest request);
	Optional<HuCatMoneda> buscar(String clave);
	String eliminar(String clave);
	List mostrarTodos();

}
