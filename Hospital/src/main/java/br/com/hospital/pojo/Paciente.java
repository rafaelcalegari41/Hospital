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
	private Pessoa pessoa;
	private TipoPlanoSaude idTipo;
	private PlanoDeSaude idPlanoSaude;
	private Date paciDtCadastro;

	public Paciente() {
	}

	public Paciente(Pessoa pessoa, TipoPlanoSaude idTipo,
			PlanoDeSaude idPlanoSaude) {
		this.pessoa = pessoa;
		this.idTipo = idTipo;
		this.idPlanoSaude = idPlanoSaude;
	}

	public Paciente(Pessoa pessoa, TipoPlanoSaude idTipo,
			PlanoDeSaude idPlanoSaude, Date paciDtCadastro) {
		this.pessoa = pessoa;
		this.idTipo = idTipo;
		this.idPlanoSaude = idPlanoSaude;
		this.paciDtCadastro = paciDtCadastro;
	}

	@Id
	@Column(name = "PESS_ID_PESSOA", unique = true, nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setIdPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "TIPS_ID_TIPO", nullable = false)
	public TipoPlanoSaude getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(TipoPlanoSaude idTipo) {
		this.idTipo = idTipo;
	}

	@Column(name = "PACI_ID_PLANO", nullable = false)
	public PlanoDeSaude getIdPlanoSaude() {
		return this.idPlanoSaude;
	}

	public void setIdPlanoSaude(PlanoDeSaude idPlanoSaude) {
		this.idPlanoSaude = idPlanoSaude;
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
