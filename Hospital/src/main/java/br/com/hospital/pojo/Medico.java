package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medico", catalog = "hospital")
public class Medico implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private Especialidade especialidade;
	private String mediIdCrm;

	public Medico() {
	}

	public Medico(Pessoa pessoa, Especialidade especialidade,
			String mediIdCrm) {
		this.pessoa = pessoa;
		this.especialidade = especialidade;
		this.mediIdCrm = mediIdCrm;
	}

	@Id
	@Column(name = "MEDI_ID_PESSOA", unique = true, nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "ESPE_ID_ESPECIALIDADE", nullable = false)
	public Especialidade getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	@Column(name = "MEDI_ID_CRM", nullable = false, length = 100)
	public String getMediIdCrm() {
		return this.mediIdCrm;
	}

	public void setMediIdCrm(String mediIdCrm) {
		this.mediIdCrm = mediIdCrm;
	}

}
