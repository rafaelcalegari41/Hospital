package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_acesso")
public class TipoAcesso implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer tiacIdTipo;
	private String tiacNmTipo;

	public TipoAcesso() {
	}

	public TipoAcesso(String tiacNmTipo) {
		this.tiacNmTipo = tiacNmTipo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TIAC_ID_TIPO", unique = true, nullable = false)
	public Integer getTiacIdTipo() {
		return this.tiacIdTipo;
	}

	public void setTiacIdTipo(Integer tiacIdTipo) {
		this.tiacIdTipo = tiacIdTipo;
	}

	@Column(name = "TIAC_NM_TIPO", length = 100)
	public String getTiacNmTipo() {
		return this.tiacNmTipo;
	}

	public void setTiacNmTipo(String tiacNmTipo) {
		this.tiacNmTipo = tiacNmTipo;
	}

}
