package br.com.hospital.pojo;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidade_federativa", catalog = "hospital")
public class UnidadeFederativa implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer unfeIdUnidade;
	private String unfeNmUnidade;

	public UnidadeFederativa() {
	}

	public UnidadeFederativa(String unfeNmUnidade) {
		this.unfeNmUnidade = unfeNmUnidade;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UNFE_ID_UNIDADE", unique = true, nullable = false)
	public Integer getUnfeIdUnidade() {
		return this.unfeIdUnidade;
	}

	public void setUnfeIdUnidade(Integer unfeIdUnidade) {
		this.unfeIdUnidade = unfeIdUnidade;
	}

	@Column(name = "UNFE_NM_UNIDADE", length = 100)
	public String getUnfeNmUnidade() {
		return this.unfeNmUnidade;
	}

	public void setUnfeNmUnidade(String unfeNmUnidade) {
		this.unfeNmUnidade = unfeNmUnidade;
	}

}
