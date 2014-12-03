package br.com.hospital.pojo;

// Generated 03/12/2014 21:22:56 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Medico generated by hbm2java
 */
@Entity
@Table(name = "medico", catalog = "hospital")
public class Medico implements java.io.Serializable {

	private int pessoaPessIdPessoa;
	private int especialidadeEspeIdEspecialidade;
	private String mediIdCrm;

	public Medico() {
	}

	public Medico(int pessoaPessIdPessoa, int especialidadeEspeIdEspecialidade,
			String mediIdCrm) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
		this.especialidadeEspeIdEspecialidade = especialidadeEspeIdEspecialidade;
		this.mediIdCrm = mediIdCrm;
	}

	@Id
	@Column(name = "PESSOA_PESS_ID_PESSOA", unique = true, nullable = false)
	public int getPessoaPessIdPessoa() {
		return this.pessoaPessIdPessoa;
	}

	public void setPessoaPessIdPessoa(int pessoaPessIdPessoa) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
	}

	@Column(name = "ESPECIALIDADE_ESPE_ID_ESPECIALIDADE", nullable = false)
	public int getEspecialidadeEspeIdEspecialidade() {
		return this.especialidadeEspeIdEspecialidade;
	}

	public void setEspecialidadeEspeIdEspecialidade(
			int especialidadeEspeIdEspecialidade) {
		this.especialidadeEspeIdEspecialidade = especialidadeEspeIdEspecialidade;
	}

	@Column(name = "MEDI_ID_CRM", nullable = false, length = 100)
	public String getMediIdCrm() {
		return this.mediIdCrm;
	}

	public void setMediIdCrm(String mediIdCrm) {
		this.mediIdCrm = mediIdCrm;
	}

}
