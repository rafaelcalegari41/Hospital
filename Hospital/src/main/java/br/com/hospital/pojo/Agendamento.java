package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "agendamento", catalog = "hospital")
public class Agendamento implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer agenIdAgendamento;
	private int pacientePessoaPessIdPessoa;
	private int atendentePessoaPessIdPessoa;
	private int medicoPessoaPessIdPessoa;
	private int situacaoSituIdSituacao;
	private int estadoPacienteEspaIdEstado;
	private Integer agenIdPaciente;
	private String agenTxAnamnese;
	private Date agenDtAgendamento;
	private Integer agenIdAtendente;
	private Date agenDtEspera;
	private Integer agenIdMedico;

	public Agendamento() {
	}

	public Agendamento(int pacientePessoaPessIdPessoa,
			int atendentePessoaPessIdPessoa, int medicoPessoaPessIdPessoa,
			int situacaoSituIdSituacao, int estadoPacienteEspaIdEstado) {
		this.pacientePessoaPessIdPessoa = pacientePessoaPessIdPessoa;
		this.atendentePessoaPessIdPessoa = atendentePessoaPessIdPessoa;
		this.medicoPessoaPessIdPessoa = medicoPessoaPessIdPessoa;
		this.situacaoSituIdSituacao = situacaoSituIdSituacao;
		this.estadoPacienteEspaIdEstado = estadoPacienteEspaIdEstado;
	}

	public Agendamento(int pacientePessoaPessIdPessoa,
			int atendentePessoaPessIdPessoa, int medicoPessoaPessIdPessoa,
			int situacaoSituIdSituacao, int estadoPacienteEspaIdEstado,
			Integer agenIdPaciente, String agenTxAnamnese,
			Date agenDtAgendamento, Integer agenIdAtendente, Date agenDtEspera,
			Integer agenIdMedico) {
		this.pacientePessoaPessIdPessoa = pacientePessoaPessIdPessoa;
		this.atendentePessoaPessIdPessoa = atendentePessoaPessIdPessoa;
		this.medicoPessoaPessIdPessoa = medicoPessoaPessIdPessoa;
		this.situacaoSituIdSituacao = situacaoSituIdSituacao;
		this.estadoPacienteEspaIdEstado = estadoPacienteEspaIdEstado;
		this.agenIdPaciente = agenIdPaciente;
		this.agenTxAnamnese = agenTxAnamnese;
		this.agenDtAgendamento = agenDtAgendamento;
		this.agenIdAtendente = agenIdAtendente;
		this.agenDtEspera = agenDtEspera;
		this.agenIdMedico = agenIdMedico;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AGEN_ID_AGENDAMENTO", unique = true, nullable = false)
	public Integer getAgenIdAgendamento() {
		return this.agenIdAgendamento;
	}

	public void setAgenIdAgendamento(Integer agenIdAgendamento) {
		this.agenIdAgendamento = agenIdAgendamento;
	}

	@Column(name = "PACIENTE_PESSOA_PESS_ID_PESSOA", nullable = false)
	public int getPacientePessoaPessIdPessoa() {
		return this.pacientePessoaPessIdPessoa;
	}

	public void setPacientePessoaPessIdPessoa(int pacientePessoaPessIdPessoa) {
		this.pacientePessoaPessIdPessoa = pacientePessoaPessIdPessoa;
	}

	@Column(name = "ATENDENTE_PESSOA_PESS_ID_PESSOA", nullable = false)
	public int getAtendentePessoaPessIdPessoa() {
		return this.atendentePessoaPessIdPessoa;
	}

	public void setAtendentePessoaPessIdPessoa(int atendentePessoaPessIdPessoa) {
		this.atendentePessoaPessIdPessoa = atendentePessoaPessIdPessoa;
	}

	@Column(name = "MEDICO_PESSOA_PESS_ID_PESSOA", nullable = false)
	public int getMedicoPessoaPessIdPessoa() {
		return this.medicoPessoaPessIdPessoa;
	}

	public void setMedicoPessoaPessIdPessoa(int medicoPessoaPessIdPessoa) {
		this.medicoPessoaPessIdPessoa = medicoPessoaPessIdPessoa;
	}

	@Column(name = "SITUACAO_SITU_ID_SITUACAO", nullable = false)
	public int getSituacaoSituIdSituacao() {
		return this.situacaoSituIdSituacao;
	}

	public void setSituacaoSituIdSituacao(int situacaoSituIdSituacao) {
		this.situacaoSituIdSituacao = situacaoSituIdSituacao;
	}

	@Column(name = "ESTADO_PACIENTE_ESPA_ID_ESTADO", nullable = false)
	public int getEstadoPacienteEspaIdEstado() {
		return this.estadoPacienteEspaIdEstado;
	}

	public void setEstadoPacienteEspaIdEstado(int estadoPacienteEspaIdEstado) {
		this.estadoPacienteEspaIdEstado = estadoPacienteEspaIdEstado;
	}

	@Column(name = "AGEN_ID_PACIENTE")
	public Integer getAgenIdPaciente() {
		return this.agenIdPaciente;
	}

	public void setAgenIdPaciente(Integer agenIdPaciente) {
		this.agenIdPaciente = agenIdPaciente;
	}

	@Column(name = "AGEN_TX_ANAMNESE", length = 1000)
	public String getAgenTxAnamnese() {
		return this.agenTxAnamnese;
	}

	public void setAgenTxAnamnese(String agenTxAnamnese) {
		this.agenTxAnamnese = agenTxAnamnese;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AGEN_DT_AGENDAMENTO", length = 10)
	public Date getAgenDtAgendamento() {
		return this.agenDtAgendamento;
	}

	public void setAgenDtAgendamento(Date agenDtAgendamento) {
		this.agenDtAgendamento = agenDtAgendamento;
	}

	@Column(name = "AGEN_ID_ATENDENTE")
	public Integer getAgenIdAtendente() {
		return this.agenIdAtendente;
	}

	public void setAgenIdAtendente(Integer agenIdAtendente) {
		this.agenIdAtendente = agenIdAtendente;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "AGEN_DT_ESPERA", length = 8)
	public Date getAgenDtEspera() {
		return this.agenDtEspera;
	}

	public void setAgenDtEspera(Date agenDtEspera) {
		this.agenDtEspera = agenDtEspera;
	}

	@Column(name = "AGEN_ID_MEDICO")
	public Integer getAgenIdMedico() {
		return this.agenIdMedico;
	}

	public void setAgenIdMedico(Integer agenIdMedico) {
		this.agenIdMedico = agenIdMedico;
	}

}