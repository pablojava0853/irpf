package com.delphos.irpf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping(value = "/api")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@PostMapping("/funcionario")
	public Funcionario salvarFunconario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	@GetMapping("/funcionarios")
	public List<Funcionario>funcionarios(){
		return funcionarioRepository.findAll();
	}
	@GetMapping("/funcionario/{id}")
	public Funcionario listaUnicoFuncionario(@PathVariable(value="id") long id) {
		return funcionarioRepository.findById(id);
	}
	@DeleteMapping("/funcionario")
	public void deletaFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
	@PutMapping("/funcionario")
	public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
}
