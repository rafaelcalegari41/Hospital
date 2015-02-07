
package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "situacao")
public class Situacao implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer situIdSituacao;
	private String situNmSituacao;

	public Situacao() {
	}

	public Situacao(String situNmSituacao) {
		this.situNmSituacao = situNmSituacao;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SITU_ID_SITUACAO", unique = true, nullable = false)
	public Integer getSituIdSituacao() {
		return this.situIdSituacao;
	}

	public void setSituIdSituacao(Integer situIdSituacao) {
		this.situIdSituacao = situIdSituacao;
	}

	@Column(name = "SITU_NM_SITUACAO", length = 100)
	public String getSituNmSituacao() {
		return this.situNmSituacao;
	}

	public void setSituNmSituacao(String situNmSituacao) {
		this.situNmSituacao = situNmSituacao;
	}

}
