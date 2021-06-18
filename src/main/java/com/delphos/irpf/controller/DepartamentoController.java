package com.delphos.irpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delphos.irpf.model.Departamento;
import com.delphos.irpf.repository.DepartamentoRepository;

@RestController
@RequestMapping(value="/api")
public class DepartamentoController {
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
}
