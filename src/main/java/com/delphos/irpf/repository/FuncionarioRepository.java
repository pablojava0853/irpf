package com.delphos.irpf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delphos.irpf.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	Funcionario findById(long id);
}
