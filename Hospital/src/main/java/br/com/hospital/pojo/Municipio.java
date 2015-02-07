package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "municipio")
public class Municipio implements java.io.Serializable {

	
	private Integer muniIdMunicipio;
	private UnidadeFederativa idUnidade;
	private String muniNmMunicipio;

	public Municipio() {
	}

	public Municipio(UnidadeFederativa idUnidade) {
		this.idUnidade = idUnidade;
	}

	public Municipio(UnidadeFederativa idUnidade, String muniNmMunicipio) {
		this.idUnidade = idUnidade;
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

	@Column(name = "UNFE_ID_UNIDADE", nullable = false)
	public UnidadeFederativa getIdUnidade() {
		return this.idUnidade;
	}

	public void setIdUnidade(UnidadeFederativa idUnidade) {
		this.idUnidade = idUnidade;
	}

	@Column(name = "MUNI_NM_MUNICIPIO", length = 100)
	public String getMuniNmMunicipio() {
		return this.muniNmMunicipio;
	}

	public void setMuniNmMunicipio(String muniNmMunicipio) {
		this.muniNmMunicipio = muniNmMunicipio;
	}

}
