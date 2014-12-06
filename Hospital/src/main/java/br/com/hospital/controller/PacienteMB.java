package br.com.hospital.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.hospital.model.PessoaDAO;
import br.com.hospital.pojo.Paciente;
import br.com.hospital.pojo.Pessoa;


@ManagedBean
@RequestScoped
public class PacienteMB {
	
	private Pessoa pessoa;
	private Paciente paciente;
	private PessoaDAO dao = new PessoaDAO();
	
	@PostConstruct
	public void inicio(){
		pessoa = new Pessoa();
		paciente = new Paciente();
	}
	
	public void salvar(){
		System.out.println(pessoa.getPessNmNome());
		
		//dao.save(pessoa);
	}
	
	public void atualizar(){
		dao.update(pessoa);
	}
	
	public void deletar(){
		dao.delete(pessoa);
	}
	
	public List<Pessoa> listar(){
		return dao.findAll();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	

}
