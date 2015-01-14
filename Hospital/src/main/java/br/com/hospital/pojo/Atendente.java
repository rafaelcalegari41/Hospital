package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atendente", catalog = "hospital")
public class Atendente implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;

	public Atendente() {
	}

	public Atendente(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Id
	@Column(name = "PESSOA_PESS_ID_PESSOA", unique = true, nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoaPessIdPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
