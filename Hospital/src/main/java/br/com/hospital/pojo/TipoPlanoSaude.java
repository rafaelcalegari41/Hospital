package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tipo_plano_saude")
public class TipoPlanoSaude implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tipsIdTipo;
	private String tipsNmNome;

	public TipoPlanoSaude() {
	}

	public TipoPlanoSaude(String tipsNmNome) {
		this.tipsNmNome = tipsNmNome;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TIPS_ID_TIPO", unique = true, nullable = false)
	public Integer getTipsIdTipo() {
		return this.tipsIdTipo;
	}

	public void setTipsIdTipo(Integer tipsIdTipo) {
		this.tipsIdTipo = tipsIdTipo;
	}

	@Column(name = "TIPS_NM_NOME", length = 100)
	public String getTipsNmNome() {
		return this.tipsNmNome;
	}

	public void setTipsNmNome(String tipsNmNome) {
		this.tipsNmNome = tipsNmNome;
	}

}
