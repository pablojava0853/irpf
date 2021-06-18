package com.delphos.irpf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delphos.irpf.model.Departamento;
import com.delphos.irpf.repository.DepartamentoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
public class DepartamentoController {
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	@GetMapping("/departamento")
	@ApiOperation(value="Salva um departamento")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	@GetMapping("/departamentos")
	@ApiOperation(value="Lista os Departamentos")
	public List<Departamento>listaDepartamentos(){
		return departamentoRepository.findAll();
	}
	@GetMapping("/departamento/{idDepatamento}")
	@ApiOperation(value="Lista um único Departamento")
	public Departamento listaUnicoDepartamento(@PathVariable(value="idDepatamento") long idDepatamento) {
		return departamentoRepository.findById(idDepatamento);
	}
	@DeleteMapping("/depatamento")
	@ApiOperation(value="Deleta um Departamento")
	public void deletaDepartamento(@RequestBody Departamento depatamento) {
		departamentoRepository.delete(depatamento);
	}
	@PutMapping("/departamento")
	@ApiOperation(value="Atualiza um Departamento")
	public Departamento atualizaDepartamento(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
}
