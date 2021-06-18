package com.delphos.irpf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delphos.irpf.model.Funcionario;
import com.delphos.irpf.repository.FuncionarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST IRPF")
@CrossOrigin(origins = "*")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@PostMapping("/funcionario")
	@ApiOperation(value="Salvar um funcionário")
	public Funcionario salvarFunconario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	@GetMapping("/funcionarios")
	@ApiOperation(value="Retorna lista de funciários")
	public List<Funcionario>funcionarios(){
		return funcionarioRepository.findAll();
	}
	@GetMapping("/funcionario/{id}")
	@ApiOperation(value="Retorna um funcionario por id")
	public Funcionario listaUnicoFuncionario(@PathVariable(value="id") long id) {
		return funcionarioRepository.findById(id);
	}
	@DeleteMapping("/funcionario")
	@ApiOperation(value="Deleta um funcionário")
	public void deletaFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
	@PutMapping("/funcionario")
	@ApiOperation("Atualiza um funcionário")
	public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
}
