package com.delphos.irpf.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DEPARTAMENTO")
public class Departamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long idDepatamento;
	private String nomeDpa;
	private String siglaDpa;
	@OneToMany
	private List<Funcionario> funcionarios;
		
	public Departamento() {
		
	}

	public Departamento(Long idDepatamento, String nomeDpa, String siglaDpa, List<Funcionario> funcionarios) {
		super();
		this.idDepatamento = idDepatamento;
		this.nomeDpa = nomeDpa;
		this.siglaDpa = siglaDpa;
		this.funcionarios = funcionarios;
	}


	public Long getIdDepatamento() {
		return idDepatamento;
	}

	public void setIdDepatamento(Long idDepatamento) {
		this.idDepatamento = idDepatamento;
	}

	public String getNomeDpa() {
		return nomeDpa;
	}

	public void setNomeDpa(String nomeDpa) {
		this.nomeDpa = nomeDpa;
	}

	public String getSiglaDpa() {
		return siglaDpa;
	}

	public void setSiglaDpa(String siglaDpa) {
		this.siglaDpa = siglaDpa;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	

}
