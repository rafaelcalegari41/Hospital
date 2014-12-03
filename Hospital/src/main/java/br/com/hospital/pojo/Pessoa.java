package br.com.hospital.pojo;



import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa", catalog = "hospital")
public class Pessoa implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer pessIdPessoa;
	private int municipioMuniIdMunicipio;
	private String pessNmNome;
	private String pessNrCpf;
	private String pessTxLogradouro;
	private String pessNrNumero;
	private String pessTxCep;
	private String pessTxBairro;
	private int pessTxComplemento;
	private String pessTxEmail;
	private String pessNrTelefone;
	private String pessNrCelular;

	public Pessoa() {
	}

	public Pessoa(int municipioMuniIdMunicipio, int pessTxComplemento) {
		this.municipioMuniIdMunicipio = municipioMuniIdMunicipio;
		this.pessTxComplemento = pessTxComplemento;
	}

	public Pessoa(int municipioMuniIdMunicipio, String pessNmNome,
			String pessNrCpf, String pessTxLogradouro, String pessNrNumero,
			String pessTxCep, String pessTxBairro, int pessTxComplemento,
			String pessTxEmail, String pessNrTelefone, String pessNrCelular) {
		this.municipioMuniIdMunicipio = municipioMuniIdMunicipio;
		this.pessNmNome = pessNmNome;
		this.pessNrCpf = pessNrCpf;
		this.pessTxLogradouro = pessTxLogradouro;
		this.pessNrNumero = pessNrNumero;
		this.pessTxCep = pessTxCep;
		this.pessTxBairro = pessTxBairro;
		this.pessTxComplemento = pessTxComplemento;
		this.pessTxEmail = pessTxEmail;
		this.pessNrTelefone = pessNrTelefone;
		this.pessNrCelular = pessNrCelular;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PESS_ID_PESSOA", unique = true, nullable = false)
	public Integer getPessIdPessoa() {
		return this.pessIdPessoa;
	}

	public void setPessIdPessoa(Integer pessIdPessoa) {
		this.pessIdPessoa = pessIdPessoa;
	}

	@Column(name = "MUNICIPIO_MUNI_ID_MUNICIPIO", nullable = false)
	public int getMunicipioMuniIdMunicipio() {
		return this.municipioMuniIdMunicipio;
	}

	public void setMunicipioMuniIdMunicipio(int municipioMuniIdMunicipio) {
		this.municipioMuniIdMunicipio = municipioMuniIdMunicipio;
	}

	@Column(name = "PESS_NM_NOME", length = 100)
	public String getPessNmNome() {
		return this.pessNmNome;
	}

	public void setPessNmNome(String pessNmNome) {
		this.pessNmNome = pessNmNome;
	}

	@Column(name = "PESS_NR_CPF", length = 20)
	public String getPessNrCpf() {
		return this.pessNrCpf;
	}

	public void setPessNrCpf(String pessNrCpf) {
		this.pessNrCpf = pessNrCpf;
	}

	@Column(name = "PESS_TX_LOGRADOURO", length = 100)
	public String getPessTxLogradouro() {
		return this.pessTxLogradouro;
	}

	public void setPessTxLogradouro(String pessTxLogradouro) {
		this.pessTxLogradouro = pessTxLogradouro;
	}

	@Column(name = "PESS_NR_NUMERO", length = 10)
	public String getPessNrNumero() {
		return this.pessNrNumero;
	}

	public void setPessNrNumero(String pessNrNumero) {
		this.pessNrNumero = pessNrNumero;
	}

	@Column(name = "PESS_TX_CEP", length = 20)
	public String getPessTxCep() {
		return this.pessTxCep;
	}

	public void setPessTxCep(String pessTxCep) {
		this.pessTxCep = pessTxCep;
	}

	@Column(name = "PESS_TX_BAIRRO", length = 100)
	public String getPessTxBairro() {
		return this.pessTxBairro;
	}

	public void setPessTxBairro(String pessTxBairro) {
		this.pessTxBairro = pessTxBairro;
	}

	@Column(name = "PESS_TX_COMPLEMENTO", nullable = false)
	public int getPessTxComplemento() {
		return this.pessTxComplemento;
	}

	public void setPessTxComplemento(int pessTxComplemento) {
		this.pessTxComplemento = pessTxComplemento;
	}

	@Column(name = "PESS_TX_EMAIL", length = 100)
	public String getPessTxEmail() {
		return this.pessTxEmail;
	}

	public void setPessTxEmail(String pessTxEmail) {
		this.pessTxEmail = pessTxEmail;
	}

	@Column(name = "PESS_NR_TELEFONE", length = 20)
	public String getPessNrTelefone() {
		return this.pessNrTelefone;
	}

	public void setPessNrTelefone(String pessNrTelefone) {
		this.pessNrTelefone = pessNrTelefone;
	}

	@Column(name = "PESS_NR_CELULAR", length = 20)
	public String getPessNrCelular() {
		return this.pessNrCelular;
	}

	public void setPessNrCelular(String pessNrCelular) {
		this.pessNrCelular = pessNrCelular;
	}

}
