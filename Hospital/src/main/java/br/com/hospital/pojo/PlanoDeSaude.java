package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plano_de_saude", catalog = "hospital")
public class PlanoDeSaude implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa idPessoa;
	private String pldsNrCnpj;
	private String pldsNrFax;

	public PlanoDeSaude() {
	}

	public PlanoDeSaude(Pessoa idPessoa, String pldsNrCnpj,
			String pldsNrFax) {
		this.idPessoa = idPessoa;
		this.pldsNrCnpj = pldsNrCnpj;
		this.pldsNrFax = pldsNrFax;
	}

	@Id
	@Column(name = "PESS_ID_PESSOA", unique = true, nullable = false)
	public Pessoa getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Column(name = "PLDS_NR_CNPJ", nullable = false, length = 100)
	public String getPldsNrCnpj() {
		return this.pldsNrCnpj;
	}

	public void setPldsNrCnpj(String pldsNrCnpj) {
		this.pldsNrCnpj = pldsNrCnpj;
	}

	@Column(name = "PLDS_NR_FAX", nullable = false, length = 20)
	public String getPldsNrFax() {
		return this.pldsNrFax;
	}

	public void setPldsNrFax(String pldsNrFax) {
		this.pldsNrFax = pldsNrFax;
	}

}
