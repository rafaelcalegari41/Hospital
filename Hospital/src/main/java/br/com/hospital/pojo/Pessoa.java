package br.com.hospital.pojo;



import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements java.io.Serializable {

	
	private Integer pessIdPessoa;
	private Municipio idMunicipio;
        private TipoAcesso idTipoAcesso;
	private String pessNmNome;
	private String pessNrCpf;
	private String pessTxLogradouro;
	private String pessNrNumero;
	private String pessTxCep;
	private String pessTxBairro;
	private String pessTxComplemento;
	private String pessTxEmail;
	private String pessNrTelefone;
	private String pessNrCelular;

	public Pessoa() {
	}

	public Pessoa(Municipio idMunicipio, String pessTxComplemento) {
		this.idMunicipio = idMunicipio;
		this.pessTxComplemento = pessTxComplemento;
	}

	public Pessoa(Municipio idMunicipio, TipoAcesso idTipoAcesso, String pessNmNome,
			String pessNrCpf, String pessTxLogradouro, String pessNrNumero,
			String pessTxCep, String pessTxBairro, String pessTxComplemento,
			String pessTxEmail, String pessNrTelefone, String pessNrCelular) {
		this.idMunicipio = idMunicipio;
                this.idTipoAcesso = idTipoAcesso;
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

	@Column(name = "MUNI_ID_MUNICIPIO", nullable = false)
	public Municipio getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Municipio idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
        
        @Column(name = "TIAC_ID_TIPO", nullable = false)
        public TipoAcesso getIdTipoAcesso(){
            return this.idTipoAcesso;
        }
        
        public void setIdTipoAcesso(TipoAcesso idTipoAcesso){
            this.idTipoAcesso = idTipoAcesso;
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
	public String getPessTxComplemento() {
		return this.pessTxComplemento;
	}

	public void setPessTxComplemento(String pessTxComplemento) {
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
