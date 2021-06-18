package com.delphos.irpf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delphos.irpf.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
	Departamento findById(long idDepatamento);
}
