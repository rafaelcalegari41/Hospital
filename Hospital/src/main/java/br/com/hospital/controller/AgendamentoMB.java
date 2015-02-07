package br.com.hospital.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.hospital.business.AgendamentoBO;
import br.com.hospital.pojo.Agendamento;
import br.com.hospital.pojo.EstadoPaciente;
import br.com.hospital.pojo.Pessoa;
import br.com.hospital.pojo.PlanoDeSaude;
import br.com.hospital.pojo.Situacao;


@ManagedBean
@RequestScoped
public class AgendamentoMB {
	
	private AgendamentoBO agendamentoBO;
	private Agendamento agendamento;
        private PlanoDeSaude planoSaude;
        private EstadoPaciente estadoPaciente;
        private Situacao situacao;
	private Pessoa pessoa;
	
	@PostConstruct
	public void inicio(){
		
	}
	
	public void salvar(Agendamento agendamento){
		if(agendamentoBO.salvar(agendamento))
			System.out.println("Salvo com sucesso!");
	}
	
	public void atualizar(Agendamento agendamento){
		if(agendamentoBO.atualizar(agendamento))
			System.out.println("Atualizado com sucesso!");
	}
	
	public void deletar(Agendamento agendamento){
		if(agendamentoBO.deletar(agendamento))
			System.out.println("Deletado com sucesso!");
	}
	
	public List<Agendamento> listar(){
		return agendamentoBO.listar();
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

    public PlanoDeSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoDeSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public AgendamentoBO getAgendamentoBO() {
        return agendamentoBO;
    }

    public void setAgendamentoBO(AgendamentoBO agendamentoBO) {
        this.agendamentoBO = agendamentoBO;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public EstadoPaciente getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(EstadoPaciente estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }
    
    
    
    
        
        
}
