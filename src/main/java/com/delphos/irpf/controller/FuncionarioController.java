package com.delphos.irpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public Funcionario salvarFunconario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

}
