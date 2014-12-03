package br.com.hospital.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "paciente", catalog = "hospital")
public class Paciente implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int pessoaPessIdPessoa;
	private int tipoPlanoSaudeTipsIdTipo;
	private int paciIdPlanoSaude;
	private Date paciDtCadastro;

	public Paciente() {
	}

	public Paciente(int pessoaPessIdPessoa, int tipoPlanoSaudeTipsIdTipo,
			int paciIdPlanoSaude) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
		this.tipoPlanoSaudeTipsIdTipo = tipoPlanoSaudeTipsIdTipo;
		this.paciIdPlanoSaude = paciIdPlanoSaude;
	}

	public Paciente(int pessoaPessIdPessoa, int tipoPlanoSaudeTipsIdTipo,
			int paciIdPlanoSaude, Date paciDtCadastro) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
		this.tipoPlanoSaudeTipsIdTipo = tipoPlanoSaudeTipsIdTipo;
		this.paciIdPlanoSaude = paciIdPlanoSaude;
		this.paciDtCadastro = paciDtCadastro;
	}

	@Id
	@Column(name = "PESSOA_PESS_ID_PESSOA", unique = true, nullable = false)
	public int getPessoaPessIdPessoa() {
		return this.pessoaPessIdPessoa;
	}

	public void setPessoaPessIdPessoa(int pessoaPessIdPessoa) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
	}

	@Column(name = "TIPO_PLANO_SAUDE_TIPS_ID_TIPO", nullable = false)
	public int getTipoPlanoSaudeTipsIdTipo() {
		return this.tipoPlanoSaudeTipsIdTipo;
	}

	public void setTipoPlanoSaudeTipsIdTipo(int tipoPlanoSaudeTipsIdTipo) {
		this.tipoPlanoSaudeTipsIdTipo = tipoPlanoSaudeTipsIdTipo;
	}

	@Column(name = "PACI_ID_PLANO_SAUDE", nullable = false)
	public int getPaciIdPlanoSaude() {
		return this.paciIdPlanoSaude;
	}

	public void setPaciIdPlanoSaude(int paciIdPlanoSaude) {
		this.paciIdPlanoSaude = paciIdPlanoSaude;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PACI_DT_CADASTRO", length = 10)
	public Date getPaciDtCadastro() {
		return this.paciDtCadastro;
	}

	public void setPaciDtCadastro(Date paciDtCadastro) {
		this.paciDtCadastro = paciDtCadastro;
	}

}
