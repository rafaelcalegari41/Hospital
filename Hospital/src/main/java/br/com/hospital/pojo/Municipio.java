package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "municipio", catalog = "hospital")
public class Municipio implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer muniIdMunicipio;
	private String unidadeFederativaUnfeIdUnidade;
	private String muniNmMunicipio;

	public Municipio() {
	}

	public Municipio(String unidadeFederativaUnfeIdUnidade) {
		this.unidadeFederativaUnfeIdUnidade = unidadeFederativaUnfeIdUnidade;
	}

	public Municipio(String unidadeFederativaUnfeIdUnidade, String muniNmMunicipio) {
		this.unidadeFederativaUnfeIdUnidade = unidadeFederativaUnfeIdUnidade;
		this.muniNmMunicipio = muniNmMunicipio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MUNI_ID_MUNICIPIO", unique = true, nullable = false)
	public Integer getMuniIdMunicipio() {
		return this.muniIdMunicipio;
	}

	public void setMuniIdMunicipio(Integer muniIdMunicipio) {
		this.muniIdMunicipio = muniIdMunicipio;
	}

	@Column(name = "UNIDADE_FEDERATIVA_UNFE_ID_UNIDADE", nullable = false)
	public String getUnidadeFederativaUnfeIdUnidade() {
		return this.unidadeFederativaUnfeIdUnidade;
	}

	public void setUnidadeFederativaUnfeIdUnidade(
			String unidadeFederativaUnfeIdUnidade) {
		this.unidadeFederativaUnfeIdUnidade = unidadeFederativaUnfeIdUnidade;
	}

	@Column(name = "MUNI_NM_MUNICIPIO", length = 100)
	public String getMuniNmMunicipio() {
		return this.muniNmMunicipio;
	}

	public void setMuniNmMunicipio(String muniNmMunicipio) {
		this.muniNmMunicipio = muniNmMunicipio;
	}

}
