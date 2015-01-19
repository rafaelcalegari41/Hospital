package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", catalog = "hospital")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa idPessoa;
	private TipoAcesso idTipoAceso;
	private String usuaTxSenha;

	public Usuario() {
	}

	public Usuario(Pessoa idPessoa, TipoAcesso idTipoAceso) {
		this.idPessoa = idPessoa;
		this.idTipoAceso = idTipoAceso;
	}

	public Usuario(Pessoa idPessoa, TipoAcesso idTipoAceso,
			String usuaTxSenha) {
		this.idPessoa = idPessoa;
		this.idTipoAceso = idTipoAceso;
		this.usuaTxSenha = usuaTxSenha;
	}

	@Id
	@Column(name = "PESS_ID_PESSOA", unique = true, nullable = false)
	public Pessoa getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Column(name = "TIAC_ID_TIPO", nullable = false)
	public TipoAcesso getIdTipoAcesso() {
		return this.idTipoAceso;
	}

	public void setTipoAcessoTiacIdTipo(TipoAcesso idTipoAceso) {
		this.idTipoAceso = idTipoAceso;
	}

	@Column(name = "USUA_TX_SENHA", length = 50)
	public String getUsuaTxSenha() {
		return this.usuaTxSenha;
	}

	public void setUsuaTxSenha(String usuaTxSenha) {
		this.usuaTxSenha = usuaTxSenha;
	}

}
