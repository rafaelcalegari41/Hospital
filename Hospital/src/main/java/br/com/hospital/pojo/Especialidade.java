package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidade", catalog = "hospital")
public class Especialidade implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer espeIdEspecialidade;
	private String espeNmEspecialidade;

	public Especialidade() {
	}

	public Especialidade(String espeNmEspecialidade) {
		this.espeNmEspecialidade = espeNmEspecialidade;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ESPE_ID_ESPECIALIDADE", unique = true, nullable = false)
	public Integer getEspeIdEspecialidade() {
		return this.espeIdEspecialidade;
	}

	public void setEspeIdEspecialidade(Integer espeIdEspecialidade) {
		this.espeIdEspecialidade = espeIdEspecialidade;
	}

	@Column(name = "ESPE_NM_ESPECIALIDADE", length = 100)
	public String getEspeNmEspecialidade() {
		return this.espeNmEspecialidade;
	}

	public void setEspeNmEspecialidade(String espeNmEspecialidade) {
		this.espeNmEspecialidade = espeNmEspecialidade;
	}

}
