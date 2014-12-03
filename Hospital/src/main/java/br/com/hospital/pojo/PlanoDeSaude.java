package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plano_de_saude", catalog = "hospital")
public class PlanoDeSaude implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int pessoaPessIdPessoa;
	private String pldsNrCnpj;
	private String pldsNrFax;

	public PlanoDeSaude() {
	}

	public PlanoDeSaude(int pessoaPessIdPessoa, String pldsNrCnpj,
			String pldsNrFax) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
		this.pldsNrCnpj = pldsNrCnpj;
		this.pldsNrFax = pldsNrFax;
	}

	@Id
	@Column(name = "PESSOA_PESS_ID_PESSOA", unique = true, nullable = false)
	public int getPessoaPessIdPessoa() {
		return this.pessoaPessIdPessoa;
	}

	public void setPessoaPessIdPessoa(int pessoaPessIdPessoa) {
		this.pessoaPessIdPessoa = pessoaPessIdPessoa;
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
