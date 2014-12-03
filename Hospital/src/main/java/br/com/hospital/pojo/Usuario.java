package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", catalog = "hospital")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int pessoaPessIdPessoa;
	private int tipoAcessoTiacIdTipo;
	private String usuaTxSenha;

	public Usuario() {
	}

	public Usuario(int pessoaPessIdPessoa, int tipoAcessoTiacIdTipo) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
		this.tipoAcessoTiacIdTipo = tipoAcessoTiacIdTipo;
	}

	public Usuario(int pessoaPessIdPessoa, int tipoAcessoTiacIdTipo,
			String usuaTxSenha) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
		this.tipoAcessoTiacIdTipo = tipoAcessoTiacIdTipo;
		this.usuaTxSenha = usuaTxSenha;
	}

	@Id
	@Column(name = "PESSOA_PESS_ID_PESSOA", unique = true, nullable = false)
	public int getPessoaPessIdPessoa() {
		return this.pessoaPessIdPessoa;
	}

	public void setPessoaPessIdPessoa(int pessoaPessIdPessoa) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
	}

	@Column(name = "TIPO_ACESSO_TIAC_ID_TIPO", nullable = false)
	public int getTipoAcessoTiacIdTipo() {
		return this.tipoAcessoTiacIdTipo;
	}

	public void setTipoAcessoTiacIdTipo(int tipoAcessoTiacIdTipo) {
		this.tipoAcessoTiacIdTipo = tipoAcessoTiacIdTipo;
	}

	@Column(name = "USUA_TX_SENHA", length = 50)
	public String getUsuaTxSenha() {
		return this.usuaTxSenha;
	}

	public void setUsuaTxSenha(String usuaTxSenha) {
		this.usuaTxSenha = usuaTxSenha;
	}

}
