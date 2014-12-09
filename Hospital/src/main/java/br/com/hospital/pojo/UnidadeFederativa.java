package br.com.hospital.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidade_federativa", catalog = "hospital")
public class UnidadeFederativa implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String unfeIdUnidade;
	private String unfeNmUnidade;

	public UnidadeFederativa() {
	}

	public UnidadeFederativa(String unfeNmUnidade) {
		this.unfeNmUnidade = unfeNmUnidade;
	}

	@Id	
	@Column(name = "UNFE_ID_UNIDADE", unique = true, nullable = false)
	public String getUnfeIdUnidade() {
		return this.unfeIdUnidade;
	}

	public void setUnfeIdUnidade(String unfeIdUnidade) {
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
