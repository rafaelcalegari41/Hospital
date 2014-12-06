package br.com.hospital.model;

import java.util.List;

import br.com.hospital.pojo.Pessoa;

public class PessoaDAO extends GenericDAO<Pessoa, Integer> {

	public PessoaDAO(){
		super();
	}
	
	public static void main(String args[]){
		PessoaDAO dao = new PessoaDAO();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setPessNmNome("Teste f");
		dao.save(pessoa);
		
		
		pessoa.setPessIdPessoa(4);		
		pessoa.setPessNmNome("Teste g");		
		dao.update(pessoa);
		
		
		Pessoa pe = dao.findById(4);
		System.out.println(pe.getPessNmNome());
		
		List<Pessoa> pessoas = dao.findAll();		
		for(Pessoa pess: pessoas){
			System.out.println(pess.getPessNmNome());
		}
		
		dao.delete(pessoa);
		
	}
}
