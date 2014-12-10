package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.PessoaDAO;
import br.com.hospital.pojo.Pessoa;

public class PessoaBO {
	
	private PessoaDAO dao = new PessoaDAO();
		
	public boolean salvar(Pessoa pessoa){
		System.out.println(pessoa.getPessNmNome());
		
		return dao.save(pessoa);
	}
	
	public boolean atualizar(Pessoa pessoa){
		return dao.update(pessoa);
	}
	
	public boolean deletar(Pessoa pessoa){
		return dao.delete(pessoa);
	}
	
	public List<Pessoa> listar(){
		return dao.findAll();
	}

}
