package br.com.hospital.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agendamento")
public class Agendamento implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idAgendamento;
    private Paciente paciente;
    private Atendente atendente;
    private Medico medico;
    private Situacao situacao;
    private EstadoPaciente estadoPaciente;
    private String agenTxAnamnese;
    private Date agenDtAgendamento;
    private Date agenDtEspera;

    public Agendamento() {
    }

    public Agendamento(Paciente paciente,
            Atendente atendente,
            Medico medico,
            Situacao situacao,
            EstadoPaciente estadoPaciente) {
        this.paciente = paciente;
        this.atendente = atendente;
        this.medico = medico;
        this.situacao = situacao;
        this.estadoPaciente = estadoPaciente;
    }

    public Agendamento(Paciente paciente,
            Atendente atendente,
            Medico medico,
            Situacao situacao,
            EstadoPaciente estadoPaciente,
            String agenTxAnamnese,
            Date agenDtAgendamento,
            Date agenDtEspera) {

        this.paciente = paciente;
        this.atendente = atendente;
        this.medico = medico;
        this.situacao = situacao;
        this.estadoPaciente = estadoPaciente;
        this.agenTxAnamnese = agenTxAnamnese;
        this.agenDtAgendamento = agenDtAgendamento;
        this.agenDtEspera = agenDtEspera;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "AGEN_ID_AGENDAMENTO", unique = true, nullable = false)
    public Integer getidAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Integer idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    @Column(name = "PACI_ID_PESSOA", nullable = false)
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Column(name = "ATEN_ID_PESSOA", nullable = false)
    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    @Column(name = "MEDI_ID_PESSOA", nullable = false)
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Column(name = "SITU_ID_SITUACAO", nullable = false)
    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Column(name = "ESPA_ID_ESTADO", nullable = false)
    public EstadoPaciente getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(EstadoPaciente estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    @Column(name = "AGEN_TX_ANAMNESE", nullable = false)
    public String getAgenTxAnamnese() {
        return agenTxAnamnese;
    }

    public void setAgenTxAnamnese(String agenTxAnamnese) {
        this.agenTxAnamnese = agenTxAnamnese;
    }

    @Column(name = "AGEN_DT_AGENDAMENTO", nullable = false)
    public Date getAgenDtAgendamento() {
        return agenDtAgendamento;
    }

    public void setAgenDtAgendamento(Date agenDtAgendamento) {
        this.agenDtAgendamento = agenDtAgendamento;
    }

    @Column(name = "AGEN_DT_ESPERA", nullable = false)
    public Date getAgenDtEspera() {
        return agenDtEspera;
    }

    public void setAgenDtEspera(Date agenDtEspera) {
        this.agenDtEspera = agenDtEspera;
    }

    
}
