package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa idPessoa;
	private TipoAcesso idTipoAcesso;
	private String usuaTxSenha;

	public Usuario() {
	}

	public Usuario(Pessoa idPessoa, TipoAcesso idTipoAceso) {
		this.idPessoa = idPessoa;
		this.idTipoAcesso = idTipoAceso;
	}

	public Usuario(Pessoa idPessoa, TipoAcesso idTipoAceso,
			String usuaTxSenha) {
		this.idPessoa = idPessoa;
		this.idTipoAcesso = idTipoAceso;
		this.usuaTxSenha = usuaTxSenha;
	}

	@Id
	@Column(name = "USUA_ID_PESSOA", unique = true, nullable = false)
	public Pessoa getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Column(name = "TIAC_ID_TIPO", nullable = false)
	public TipoAcesso getIdTipoAcesso() {
		return this.idTipoAcesso;
	}

	public void setIdTipoAcesso(TipoAcesso idTipoAcesso) {
		this.idTipoAcesso = idTipoAcesso;
	}

	@Column(name = "USUA_TX_SENHA", length = 50)
	public String getUsuaTxSenha() {
		return this.usuaTxSenha;
	}

	public void setUsuaTxSenha(String usuaTxSenha) {
		this.usuaTxSenha = usuaTxSenha;
	}

}
